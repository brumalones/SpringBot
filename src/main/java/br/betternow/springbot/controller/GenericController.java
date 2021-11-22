package br.betternow.springbot.controller;

import br.betternow.springbot.model.ConversationReference;
import br.betternow.springbot.controller.dto.ec.SolicitacaoEcDto;
import br.betternow.springbot.model.dialog.RootDialog;
import br.betternow.springbot.controller.dto.*;
import br.betternow.springbot.model.dialog.Unavailable;
import br.betternow.springbot.model.dialog.ec.SolicitacaoEc;
import br.betternow.springbot.repository.ConversationReferenceRepository;
import br.betternow.springbot.utils.UniversallyUniqueIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/dialogs")
public class GenericController {

    @Autowired
    private ConversationReferenceRepository referenceRepository;

    @GetMapping("/token")
    public ResponseEntity<Object> token() throws IOException {
        String uuid = new UniversallyUniqueIdentifier().getUUID();
        ConversationReference reference = new ConversationReference();
        reference.setUuid(uuid);
        referenceRepository.save(reference);
        return ResponseEntity.ok(new ConversationReferencesDto(reference));
    }

    @GetMapping("/root")
    public ResponseEntity<Object> getDialog(@RequestHeader("uuid") String uuid) {
        return ResponseEntity.ok(
                new RootDialogDto(
                        new RootDialog("Chat Bot - Dough", "Posso te ajudar a solicita massa para os seguintes itens:")
                )
        );
    }

    @GetMapping("/current/{currentDialog}/next/{chosenDialog}")
    public ResponseEntity genericDialog(@PathVariable String currentDialog, @PathVariable String chosenDialog, @RequestHeader("uuid") String uuid) {
        ResponseEntity response = null;
        switch (chosenDialog.toLowerCase()) {
            case "transacaodebitocredito":
            case "criarterminal":
            case "solicitarcancelamento":
            case "transacaocancelamentoedi":
            case "transacaocancelamentoiata":
            case "rejeicaocippagfor":
                response = ResponseEntity.ok(
                        new UnavailableDto(
                                new Unavailable("Menu Principal", "Desculpe, mas esse menu esta em manutenção! \n" +
                                        "Mas fique tranquilo(a) nossa equipe está empanhada para finalizar o mais rapido possivel")
                        )
                );
                break;
            case "solicitacaoec":
                response = ResponseEntity.ok(
                        new SolicitacaoEcDto(
                                new SolicitacaoEc("Solicitação de EC", "Selecione o Tipo do EC")
                        )
                );
                break;
            default:
                response = ResponseEntity.notFound().build();
                break;
        }
        return response;
    }

}
