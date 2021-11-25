package br.betternow.chatbot.dough.controller.form.solicitar.ec;

import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcChavesEnum;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcValoresEnum;
import br.betternow.chatbot.dough.controller.form.GenericForm;
import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.repository.solicita.ec.ConversationReferenceRepository;

import java.util.Map;

public class DomicilioBancarioForm extends GenericForm {

    public DomicilioBancarioForm() {
    }

    public ConversationReference update(String uuid, ConversationReferenceRepository referenceRepository) {
        ConversationReference conversationReference = referenceRepository.getById(uuid);

        Map<String, String> attributes = conversationReference.getAttributes();
        attributes.put(SolicitarEcChavesEnum.domclioEC.toString(), SolicitarEcValoresEnum.fromText(this.chosen).toString());

        conversationReference.setAttributes(attributes);
        return conversationReference;
    }

}
