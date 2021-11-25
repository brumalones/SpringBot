package br.betternow.chatbot.dough.controller.form.solicitar.ec;

import br.betternow.chatbot.dough.controller.form.GenericForm;
import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.model.enums.DialogNameEnum;
import br.betternow.chatbot.dough.repository.solicita.ec.ConversationReferenceRepository;

public class ChosenDialogForm extends GenericForm {

    public ChosenDialogForm() {
    }

    public ConversationReference update(String uuid, ConversationReferenceRepository referenceRepository) {
        ConversationReference conversationReference = referenceRepository.getById(uuid);
        conversationReference.setDialogStartet(DialogNameEnum.fromText(this.chosen));
        return conversationReference;
    }

}
