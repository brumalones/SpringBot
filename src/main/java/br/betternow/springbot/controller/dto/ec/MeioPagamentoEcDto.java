package br.betternow.springbot.controller.dto.ec;

import br.betternow.springbot.model.dialog.ec.MeioPagamentoEc;

import java.util.HashMap;

public class MeioPagamentoEcDto {

    private String dialogName;
    private String title;
    private String message;
    private HashMap<String, String> choice;
    private String action;
    private String redirection;

    public MeioPagamentoEcDto(MeioPagamentoEc pagamentoEc) {
        this.dialogName = "MeioPagamentoEc";
        this.title = pagamentoEc.getTitle();
        this.message = pagamentoEc.getMessage();
        this.choice = pagamentoEc.getChoice();
        this.action = "PUT /dialogs/solicitacaoec/update";
        this.redirection = "GET /dialogs/solicitacaoec/bandeira";
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
