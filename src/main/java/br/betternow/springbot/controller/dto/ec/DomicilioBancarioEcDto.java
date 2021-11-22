package br.betternow.springbot.controller.dto.ec;

import br.betternow.springbot.model.dialog.ec.DomicilioBancarioEc;
import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import java.util.HashMap;

public class DomicilioBancarioEcDto {

    private final String dialogName;
    private final String title;
    private final String message;
    private final HashMap<SolctEcEnum, String> choice;
    private final String action;
    private final String redirection;

    public DomicilioBancarioEcDto(DomicilioBancarioEc domicilioBancarioEc) {
        this.dialogName = "DomicilioBancarioEc";
        this.title = domicilioBancarioEc.getTitle();
        this.message = domicilioBancarioEc.getMessage();
        this.choice = domicilioBancarioEc.getChoice();
        this.action = "PUT /dialogs/solicitacaoec/update";
        this.redirection = "GET /dialogs/solicitacaoec/confirm";
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

    public HashMap<SolctEcEnum, String> getChoice() {
        return choice;
    }

    public String getAction() {
        return action;
    }

    public String getRedirection() {
        return redirection;
    }

}
