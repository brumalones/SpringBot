package br.betternow.chatbot.dough.controller.form.solicitar.ec;

import br.betternow.chatbot.dough.controller.form.GenericForm;
import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.repository.solicita.ec.ConversationReferenceRepository;

import java.util.Map;

public class ConfirmeForm extends GenericForm {

    public ConfirmeForm() {
    }

    public ConversationReference update(String uuid, ConversationReferenceRepository referenceRepository) {
        ConversationReference conversationReference = referenceRepository.getById(uuid);

        Map<String, String> attributes = conversationReference.getAttributes();
        attributes.put("acceptSolicition", this.chosen);

        conversationReference.setAttributes(attributes);
        return conversationReference;
    }

}
