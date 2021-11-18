package br.betternow.springbot.controller.dto;

import br.betternow.springbot.model.dialog.RootDialog;

import java.util.HashMap;

public class RootDialogDto {

    private String dialogName;
    private String title;
    private String message;
    private HashMap<String, String> choice;
    private String redirection;

    public RootDialogDto(RootDialog rootDialog) {
        this.dialogName = "RootDialog";
        this.title = rootDialog.getTitle();
        this.message = rootDialog.getMessage();
        this.choice = rootDialog.getChoice();
        this.redirection = "GET /dialogs/current/rootdialog/next/{chosendialog}";
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

    public String getRedirection() {
        return redirection;
    }
}
