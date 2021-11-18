package br.betternow.springbot.controller.dto.ec;

import br.betternow.springbot.model.dialog.ec.DomicilioBancarioEC;

import java.util.HashMap;

public class DomicilioBancarioEcDto {

    private final String dialogName;
    private final String title;
    private final String message;
    private final HashMap<String, String> choice;
    private final String action;
    private final String redirection;

    public DomicilioBancarioEcDto(DomicilioBancarioEC domicilioBancario) {
        this.dialogName = "domicilioBancarioEC";
        this.title = domicilioBancario.getTitle();
        this.message = domicilioBancario.getMessage();
        this.choice = domicilioBancario.getChoice();
        this.action = "PUT /dialogs/solicitacaoec/update";
        this.redirection = "POST /dialogs/solicitacaoec/confirm";
    }

    public String getDialogName() {
        return dialogName;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public HashMap<String, String> getChoice() {
        return choice;
    }

    public String getAction() {
        return action;
    }

    public String getRedirection() {
        return redirection;
    }

}
