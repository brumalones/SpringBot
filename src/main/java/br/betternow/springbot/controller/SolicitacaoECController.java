package br.betternow.springbot.controller;

import br.betternow.springbot.controller.dto.ConversationReferencesDto;
import br.betternow.springbot.controller.dto.ec.BandeiraEcDto;
import br.betternow.springbot.controller.dto.ec.ConfirmarSolicitacaoEcDto;
import br.betternow.springbot.controller.dto.ec.DomicilioBancarioEcDto;
import br.betternow.springbot.controller.dto.ec.MeioPagamentoEcDto;
import br.betternow.springbot.controller.form.ConversationReferenceForm;
import br.betternow.springbot.model.ConversationReference;
import br.betternow.springbot.model.dialog.ec.BandeiraEc;
import br.betternow.springbot.model.dialog.ec.ConfirmarSolicitacaoEc;
import br.betternow.springbot.model.dialog.ec.DomicilioBancarioEc;
import br.betternow.springbot.model.dialog.ec.MeioPagamentoEc;
import br.betternow.springbot.repository.ConversationReferenceRepository;
import br.betternow.springbot.validation.GenericHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.io.IOException;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/dialogs/solicitacaoec")
public class SolicitacaoECController {

    @Autowired
    private ConversationReferenceRepository referenceRepository;

    @PostMapping("/create")
    public ResponseEntity createSolicitacao(@RequestHeader("uuid") String uuid, UriComponentsBuilder builder) {
        URI uri = builder.path("").buildAndExpand("").toUri();
        return ResponseEntity.created(uri).body("Solicitação criada com sucesso!");
    }

    @GetMapping("/confirm")
    public ResponseEntity confirm(@RequestHeader("uuid") String uuid) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            ConversationReference conversationReference = referenceRepository.getById(uuid);
            if (conversationReference.getAtributes().size() == 4) {
                return ResponseEntity.ok(
                        new ConfirmarSolicitacaoEcDto(
                                new ConfirmarSolicitacaoEc("Confirmação da Solicitação de EC", conversationReference)
                        )
                );
            }
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(
                    new GenericHandler("atributes", "Object Map<ConversationReferenceEnum, SolctEcEnum> is null or not was completed")
            );
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

    @PutMapping("/update")
    @Transactional
    public ResponseEntity putAction(@RequestBody @Valid ConversationReferenceForm form, @RequestHeader("uuid") String uuid) throws IOException {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            ConversationReference conversationReference = form.update(uuid, referenceRepository);
            return ResponseEntity.ok(new ConversationReferencesDto(conversationReference));
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

    @GetMapping("/meiopagamento")
    public ResponseEntity meioPagamento(@RequestHeader("uuid") String uuid) {
        return ResponseEntity.ok(
                new MeioPagamentoEcDto(
                        new MeioPagamentoEc("Solicitação de EC", "Solecione o meio de pagamento do EC")
                )
        );
    }

    @GetMapping("/bandeira")
    public ResponseEntity bandeira(@RequestHeader("uuid") String uuid) {
        return ResponseEntity.ok(
                new BandeiraEcDto(
                        new BandeiraEc("Solicitação de EC", "Deseja inserir todas as bandeiras " +
                                "e todos os tipos de pagamentos?")
                )
        );
    }

    @GetMapping("/domiciliobancario")
    public ResponseEntity domiciliobancario(@RequestHeader("uuid") String uuid) {
        return ResponseEntity.ok(
                new DomicilioBancarioEcDto(
                        new DomicilioBancarioEc("Solicitação de EC", "Informe o Domicilio Bancário")
                )
        );
    }

}
