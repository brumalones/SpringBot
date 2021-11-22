package br.betternow.springbot.controller.dto.ec;

import br.betternow.springbot.controller.form.enums.ConversationReferenceEnum;
import br.betternow.springbot.model.dialog.ec.ConfirmarSolicitacaoEc;
import br.betternow.springbot.model.dialog.ec.enums.SolctEcEnum;

import java.util.Map;

public class ConfirmarSolicitacaoEcDto {

    private String dialogName;
    private String title;
    private String message;
    private Map<String, String> choice;
    private Map<ConversationReferenceEnum, SolctEcEnum> atributes;
    private String action;
    private String redirection;

    public ConfirmarSolicitacaoEcDto() {
    }

    public String getTitle() {
        return title;
    }

    public ConfirmarSolicitacaoEcDto(ConfirmarSolicitacaoEc confirmarSoclicitacao){
        this.dialogName = "ConfirmarSolicitacaoEc";
        this.title = confirmarSoclicitacao.getTitle();
        this.choice = confirmarSoclicitacao.getChoice();
        this.atributes = confirmarSoclicitacao.getAtributes();
        this.message = confirmationMessage();
        this.action = "POST /dialogs/solicitacaoec/save";
        this.redirection = "GET /dialogs/root";
    }

    public String getMessage() {
        return message;
    }

    public Map<String, String> getChoice() {
        return choice;
    }

    public String confirmationMessage() {
        String text = "";
        return text
                .concat("Antes de concluir sua solicitação vamos confirmar suas escolhas!\n")
                .concat("Tipo do EC: ").concat(atributes.get(ConversationReferenceEnum.tipoEC).toText()).concat("\n")
                .concat("Meio de Pagamento: ").concat(atributes.get(ConversationReferenceEnum.meioPgtoEC).toText()).concat("\n")
                .concat("Domicilio Bancario: ").concat(atributes.get(ConversationReferenceEnum.domclioEC).toText()).concat("\n")
                .concat("Inclusão de Todas as Bandeiras: ").concat(atributes.get(ConversationReferenceEnum.bandeiraEC).toText()).concat("\n");
    }

    public String getDialogName() {
        return dialogName;
    }

    public String getAction() {
        return action;
    }

    public String getRedirection() {
        return redirection;
    }

}
