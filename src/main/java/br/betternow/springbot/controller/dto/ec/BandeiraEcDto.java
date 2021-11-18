package br.betternow.springbot.controller.dto.ec;

import br.betternow.springbot.model.dialog.ec.BandeiraEC;

import java.util.HashMap;

public class BandeiraEcDto {

    private String dialogName;
    private String title;
    private String message;
    private HashMap<Integer, String> choice;
    private String action;
    private String redirection;

    public BandeiraEcDto(BandeiraEC bandeiraEC) {
        this.dialogName = "BandeiraEC";
        this.title = bandeiraEC.getTitle();
        this.message = bandeiraEC.getMessage();
        this.choice = bandeiraEC.getChoice();
        this.action = "PUT /dialogs/solicitacaoec/update";
        this.redirection = "GET /dialogs/solicitacaoec/domiciliobancario/";
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

    public HashMap<Integer, String> getChoice() {
        return choice;
    }

    public String getAction() {
        return action;
    }

    public String getRedirection() {
        return redirection;
    }

}
