package br.betternow.chatbot.dough.controller;

import br.betternow.chatbot.dough.controller.dto.solicitar.ec.*;
import br.betternow.chatbot.dough.controller.form.solicitar.ec.*;
import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.repository.solicita.ec.ConversationReferenceRepository;
import br.betternow.chatbot.dough.validation.GenericHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/dialog/solicitacaoec")
public class SolicitarECController {

    @Autowired
    private ConversationReferenceRepository referenceRepository;

    @PostMapping("/tipoec")
    @Transactional
    public ResponseEntity<Object> getTipoEcDialog(@RequestBody @Valid TipoEcForm form, @RequestHeader("uuid") String uuid) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            ConversationReference reference = form.update(uuid, referenceRepository);
            return ResponseEntity.ok(
                    new MeioPagamentoDto(reference)
            );
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }


    @PostMapping("/meiopagamento")
    @Transactional
    public ResponseEntity<Object> getMeioPagamentoDialog(@RequestBody @Valid MeioPagamentoForm form, @RequestHeader("uuid") String uuid) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            ConversationReference reference = form.update(uuid, referenceRepository);
            return ResponseEntity.ok(
                    new BandeiraDto(reference)
            );
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

    @PostMapping("/bandeira")
    @Transactional
    public ResponseEntity<Object> getBandeiraDialog(@RequestBody @Valid BandeiraForm form, @RequestHeader("uuid") String uuid) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            ConversationReference reference = form.update(uuid, referenceRepository);
            return ResponseEntity.ok(
                    new DomicilioBancarioDto(reference)
            );
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

    @PostMapping("/domcliobancario")
    @Transactional
    public ResponseEntity<Object> getDomclioBancarioDialog(@RequestBody @Valid DomicilioBancarioForm form, @RequestHeader("uuid") String uuid) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            ConversationReference reference = form.update(uuid, referenceRepository);
            return ResponseEntity.ok(
                    new ConfirmarSolicitacaoDto(reference)
            );
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

    @PostMapping("/confirme")
    public ResponseEntity<Object> getConfirmeDialog(@RequestBody @Valid ConfirmeForm form, @RequestHeader("uuid") String uuid) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            ConversationReference reference = form.update(uuid, referenceRepository);
            if (form.getChosen().equals("Aceitar"))
                return ResponseEntity.created(null).body("Solicitação resgistrada com sucesso!");
            else
                return ResponseEntity.ok().body(new TipoEcDto(reference));

        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

    @PostMapping("/create")
    public ResponseEntity createSolicitacao(@RequestHeader("uuid") String uuid, UriComponentsBuilder builder) {
        Optional<ConversationReference> referenceOptional = referenceRepository.findById(uuid);
        if (referenceOptional.isPresent()) {
            URI uri = builder.path("").buildAndExpand("").toUri();
            return ResponseEntity.created(uri).body("Solicitação criada com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new GenericHandler("uuid", "uuid is not valid")
        );
    }

}
