package br.betternow.chatbot.dough.controller.dto.solicitar.ec;

import br.betternow.chatbot.dough.controller.dto.ConversationReferenceDto;
import br.betternow.chatbot.dough.controller.dto.GenericDialogDto;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcValoresEnum;
import br.betternow.chatbot.dough.model.ConversationReference;
import br.betternow.chatbot.dough.repository.solicita.ec.ConversationReferenceRepository;

import java.util.HashMap;

public class TipoEcDto extends GenericDialogDto {

    public TipoEcDto(ConversationReference reference) {
        setDialogName(getClass().getSimpleName());
        setTitle("Solicitação de EC");
        setMessage("Selecione o Tipo do EC");
        setChooseAction(choices());
        setRedirection("POST /dialog/solicitacaoec/tipoec");
        setTypeable(false);
        setReferenceDto(reference);
    }

    public HashMap<SolicitarEcValoresEnum, String> choices() {
        HashMap<SolicitarEcValoresEnum, String> choices = new HashMap<>();
        choices.put(SolicitarEcValoresEnum.tipo_Convivencia, SolicitarEcValoresEnum.tipo_Convivencia.toText());
        choices.put(SolicitarEcValoresEnum.tipo_Sec, SolicitarEcValoresEnum.tipo_Sec.toText());
        return choices;
    }

}
