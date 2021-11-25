package br.betternow.chatbot.dough.model;

import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcValoresEnum;

import java.util.HashMap;

public class GenericDialog {

    private String dialogName;
    private String title;
    private String message;
    private HashMap<SolicitarEcValoresEnum, String> choice;
    private String action;
    private String redirection;

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

    public HashMap<SolicitarEcValoresEnum, String> getChoice() {
        return choice;
    }

    public void setChoice(HashMap<SolicitarEcValoresEnum, String> choice) {
        this.choice = choice;
    }

    public String getDialogName() {
        return dialogName;
    }

    public void setDialogName(String dialogName) {
        this.dialogName = dialogName;
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
}
