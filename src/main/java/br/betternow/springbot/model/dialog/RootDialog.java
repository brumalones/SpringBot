package br.betternow.springbot.model.dialog;

import java.util.ArrayList;
import java.util.HashMap;

public class RootDialog {

    private String title;
    private String message;
    private HashMap<String, String> choice;

    public RootDialog() {
    }

    public RootDialog(String title, String message) {
        this.title = title;
        this.message = message;
        this.choice = setChoiceMap();
    }

    private HashMap<String, String> setChoiceMap() {
        HashMap<String, String> choices = new HashMap<>();
        choices.put("solicitacaoEc", "Solicitação de ECs");
        choices.put("transacaoDebitoCredito", "Realizar transações Debito e Credito");
        choices.put("transacaoCancelamentoIata", "Realizar transações/Cancelamentos IATA");
        choices.put("transacaoCancelamentoEdi", "Realizar transações/Cancelamentos EDI");
        choices.put("criarTerminal", "Criação de terminal");
        choices.put("solicitarCancelamento", "Soliciatar cancelamanto");
        choices.put("rejeicaoCIPPagfor", "Rejeição CIP/Pagfor");
        return choices;
    }

    public HashMap<String, String> getChoice() {
        return choice;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}
