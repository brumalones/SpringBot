package br.betternow.chatbot.dough.controller;

import br.betternow.chatbot.dough.controller.dto.RootDialogDto;
import br.betternow.chatbot.dough.controller.dto.Unavailable;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.TipoEcDto;
import br.betternow.chatbot.dough.controller.form.solicitar.ec.ChosenDialogForm;
import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.model.enums.DialogNameEnum;
import br.betternow.chatbot.dough.repository.solicita.ec.ConversationReferenceRepository;
import br.betternow.chatbot.dough.validation.GenericHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/dialog")
public class GenericDialogController {

    @Autowired
    private ConversationReferenceRepository referenceRepository;

    @GetMapping("/root")
    public ResponseEntity<Object> getRootDialog(@RequestHeader("uuid") String uuid) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            return ResponseEntity.ok(
                    new RootDialogDto(referenceRepository.getById(uuid))
            );
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

    @PostMapping("/current/rootdialog/new")
    @Transactional
    public ResponseEntity newDialog(@RequestBody @Valid ChosenDialogForm form, @RequestHeader("uuid") String uuid) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            ConversationReference reference = form.update(uuid, referenceRepository);
            String chosen = DialogNameEnum.fromText(form.getChosen()).name();
            ResponseEntity response = switch (chosen) {
                case "solicitar_Ec" -> ResponseEntity.ok(new TipoEcDto(reference));
                default -> ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new Unavailable());
            };
            return response;
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

}

