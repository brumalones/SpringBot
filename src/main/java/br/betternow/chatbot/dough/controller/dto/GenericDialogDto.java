package br.betternow.chatbot.dough.controller.dto;

import br.betternow.chatbot.dough.model.ConversationReference;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;

public class GenericDialogDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dialogName;
    private Boolean isTypeable;
    private String title;
    private String message;
    private HashMap<?, String> chooseAction;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String action;
    private String redirection;
    private ConversationReferenceDto referenceDto;

    public String getDialogName() {
        return dialogName;
    }

    public void setDialogName(String dialogName) {
        this.dialogName = dialogName;
    }

    public Boolean getTypeable() {
        return isTypeable;
    }

    public void setTypeable(Boolean typeable) {
        isTypeable = typeable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<?, String> getChooseAction() {
        return chooseAction;
    }

    public void setChooseAction(HashMap<?, String> chooseAction) {
        this.chooseAction = chooseAction;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRedirection() {
        return redirection;
    }

    public void setRedirection(String redirection) {
        this.redirection = redirection;
    }

    public ConversationReferenceDto getReferenceDto() {
        return referenceDto;
    }

    public void setReferenceDto(ConversationReference reference) {
        this.referenceDto = new ConversationReferenceDto(reference);
    }
}
