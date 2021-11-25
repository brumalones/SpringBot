package br.betternow.chatbot.dough.controller.dto.solicitar.ec;

import br.betternow.chatbot.dough.controller.dto.GenericDialogDto;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcValoresEnum;
import br.betternow.chatbot.dough.model.ConversationReference;

import java.util.HashMap;

public class MeioPagamentoDto extends GenericDialogDto {

    public MeioPagamentoDto(ConversationReference reference) {
        setDialogName(getClass().getSimpleName());
        setTitle("Solicitação de EC");
        setMessage("Solecione o meio de pagamento do EC");
        setChooseAction(choices());
        setRedirection("POST /dialog/solicitacaoec/meiopagamento");
        setTypeable(false);
        setReferenceDto(reference);
    }

    public HashMap<SolicitarEcValoresEnum, String> choices() {
        HashMap<SolicitarEcValoresEnum, String> choices = new HashMap<>();
        choices.put(SolicitarEcValoresEnum.meio_Pgto_Individual, SolicitarEcValoresEnum.meio_Pgto_Individual.toText());
        choices.put(SolicitarEcValoresEnum.meio_Pgto_Cadeia_Centralizada, SolicitarEcValoresEnum.meio_Pgto_Cadeia_Centralizada.toText());
        choices.put(SolicitarEcValoresEnum.meio_Pgto_Cadeia_Descentralizada, SolicitarEcValoresEnum.meio_Pgto_Cadeia_Descentralizada.toText());
        return choices;
    }

}
