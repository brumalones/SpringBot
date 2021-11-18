package br.betternow.springbot.controller.dto.ec;

import br.betternow.springbot.model.dialog.ec.SolicitacaoEc;

import java.util.HashMap;

public class SolicitacaoEcDto {

    private String dialogName;
    private String title;
    private String message;
    private HashMap<String, String> choice;
    private String action;
    private String redirection;

    public SolicitacaoEcDto(SolicitacaoEc solicitacaoEc) {
        this.dialogName = "SolicitacaoEc";
        this.title = solicitacaoEc.getTitle();
        this.message = solicitacaoEc.getMessage();
        this.choice = solicitacaoEc.getChoice();
        this.action = "PUT /dialogs/solicitacaoec/update";
        this.redirection = "GET /dialogs/solicitacaoec/meiopagamento/";
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

    public String getDialogName() {
        return dialogName;
    }

    public String getAction() {
        return action;
    }

    public String getRedirection() {
        return redirection;
    }

}
