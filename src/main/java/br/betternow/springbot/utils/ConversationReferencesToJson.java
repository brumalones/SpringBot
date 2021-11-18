package br.betternow.springbot.utils;

import br.betternow.springbot.model.ConversationReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ConversationReferencesToJson {
    private ObjectMapper mapper = new ObjectMapper();
    private JsonToConversationReferences toObject = new JsonToConversationReferences();

    public void put(ConversationReference[] reference) throws IOException {

        mapper.writeValue(new File("C:\\BetterNow\\conversationReferences.json"), reference);

    }

    public void set(ConversationReference reference) throws IOException {

        ConversationReference[] referencesObject = toObject.get();
        ArrayList<ConversationReference> referenceList = new ArrayList<>();

        if (referencesObject != null) {
            Arrays.stream(referencesObject).forEach(ref -> referenceList.add(ref));
        }

        referenceList.add(reference);

        mapper.writeValue(new File("C:\\BetterNow\\conversationReferences.json"), referenceList);

    }

}
