package com.example.SpringBot.controller;

import com.example.SpringBot.dto.RootDialogDto;
import com.example.SpringBot.model.dialog.RootDialog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dialog")
public class DialogController {

    @GetMapping("/root")
    public RootDialogDto getDialog() {
        return new RootDialogDto(new RootDialog("this is a title", "this is a message"));
    }


}
