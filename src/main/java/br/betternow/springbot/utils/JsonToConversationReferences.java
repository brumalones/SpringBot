package br.betternow.springbot.utils;

import br.betternow.springbot.model.ConversationReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonToConversationReferences {

    public ConversationReference[] get() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("conversationReferences.json");

        if (file.exists()) {
            return mapper.readValue(file, (new ConversationReference[]{}).getClass());
        }
        return null;
    }
}
