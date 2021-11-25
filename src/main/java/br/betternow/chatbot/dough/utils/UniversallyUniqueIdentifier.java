package br.betternow.chatbot.dough.utils;

import java.util.UUID;

public class UniversallyUniqueIdentifier {

    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
