package br.betternow.chatbot.dough.controller;

import br.betternow.chatbot.dough.controller.dto.ConversationReferenceDto;
import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.repository.solicita.ec.ConversationReferenceRepository;
import br.betternow.chatbot.dough.utils.UniversallyUniqueIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class GenericController {

    @Autowired
    private ConversationReferenceRepository referenceRepository;

    @GetMapping("/token")
    public ResponseEntity<Object> token() {
        ConversationReference reference = new ConversationReference(
                new UniversallyUniqueIdentifier().getUUID()
        );
        referenceRepository.save(reference);
        return ResponseEntity.ok(new ConversationReferenceDto(reference));
    }

}

