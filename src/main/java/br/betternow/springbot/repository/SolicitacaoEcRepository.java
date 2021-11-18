package br.betternow.springbot.repository;

import br.betternow.springbot.model.ConversationReference;
import br.betternow.springbot.model.dialog.ec.RegistradoraEC;
import br.betternow.springbot.utils.ConversationReferencesToJson;
import br.betternow.springbot.utils.JsonToConversationReferences;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolicitacaoEcRepository {

    public boolean put(RegistradoraEC registradora) throws IOException {

        boolean findy = false;
        JsonToConversationReferences referencesObject = new JsonToConversationReferences();
        ConversationReference[] references = referencesObject.get();

        for (ConversationReference reference : references) {

            if (registradora.getUuid().equals(reference.getUuid())) {

                Map<String, String> atributes = reference.getAtributes();
                if (atributes == null)
                    atributes = new HashMap<>();

                if (registradora.getTipoEC() != null)
                    atributes.put("tipoEC", registradora.getTipoEC().toString());

                if (registradora.getMeioPagamento() != null)
                    atributes.put("meioPagamento", registradora.getMeioPagamento().toString());

                if (registradora.getDomicilioBancario() != null)
                    atributes.put("domicilioBancario", registradora.getDomicilioBancario().toString());

                if (registradora.getBandeira() != null)
                    atributes.put("bandeira", registradora.getBandeira().toString());

                reference.setAtributes(atributes);

                ConversationReferencesToJson toJson = new ConversationReferencesToJson();
                toJson.put(references);

                findy = true;

            }

        }

        return findy;

    }

}
