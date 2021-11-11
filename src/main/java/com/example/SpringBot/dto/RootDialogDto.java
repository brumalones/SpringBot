package com.example.SpringBot.dto;

import com.example.SpringBot.model.dialog.RootDialog;

import java.util.ArrayList;

public class RootDialogDto {

    private String title;
    private String message;
    private ArrayList<String> choice;

    public RootDialogDto(RootDialog rootDialog) {
        this.title = rootDialog.getTitle();
        this.message = rootDialog.getMessage();
        this.choice = rootDialog.getChoices();
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<String> getChoice() {
        return choice;
    }


}
