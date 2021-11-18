package br.betternow.springbot.utils;

import java.util.UUID;

public class UniversallyUniqueIdentifier {

    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
