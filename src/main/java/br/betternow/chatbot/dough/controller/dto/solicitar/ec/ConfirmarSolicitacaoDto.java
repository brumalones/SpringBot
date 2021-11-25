package br.betternow.chatbot.dough.controller.dto.solicitar.ec;

import br.betternow.chatbot.dough.controller.dto.GenericDialogDto;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcChavesEnum;
import br.betternow.chatbot.dough.controller.dto.solicitar.ec.enums.SolicitarEcValoresEnum;
import br.betternow.chatbot.dough.model.ConversationReference;

import java.util.HashMap;
import java.util.Map;

public class ConfirmarSolicitacaoDto extends GenericDialogDto {

    private Map<SolicitarEcChavesEnum, SolicitarEcValoresEnum> attributes;

    public ConfirmarSolicitacaoDto() {
    }

    public ConfirmarSolicitacaoDto(ConversationReference reference) {
        attributes = new HashMap<>();
        setDialogName(getClass().getSimpleName());
        setTitle("Confirmação da Solicitação de EC");
        setChooseAction(choices());
        setRedirection("POST /dialogs/solicitacaoec/confirme");

        reference.getAttributes().forEach(
                (k, v) -> this.attributes.put(SolicitarEcChavesEnum.valueOf(k), SolicitarEcValoresEnum.valueOf(v))
        );

        setMessage(confirmationMessage());
        setTypeable(false);
        setReferenceDto(reference);
    }

    private HashMap<String, String> choices() {
        HashMap<String, String> choices = new HashMap<>();
        choices.put("accept", "Aceitar");
        choices.put("reject", "Recusar");
        return choices;
    }

    private String confirmationMessage() {
        String text = "";
        return text
                .concat("Antes de concluir sua solicitação vamos confirmar suas escolhas!\n")
                .concat("Tipo do EC: ").concat(attributes.get(SolicitarEcChavesEnum.tipoEC).toText()).concat("\n")
                .concat("Meio de Pagamento: ").concat(attributes.get(SolicitarEcChavesEnum.meioPgtoEC).toText()).concat("\n")
                .concat("Domicilio Bancario: ").concat(attributes.get(SolicitarEcChavesEnum.domclioEC).toText()).concat("\n")
                .concat("Inclusão de Todas as Bandeiras: ").concat(attributes.get(SolicitarEcChavesEnum.bandeiraEC).toText()).concat("\n");
    }

}
