package br.betternow.chatbot.dough.model.enums;

public enum DialogType {

    choice("Apenas escolha"),
    action("Apenas ação");

    private final String text;

    DialogType(String text) {
        this.text = text;
    }

    public static DialogType fromText(String text) {
        for (DialogType dialogType : DialogType.values()) {
            if (dialogType.text.equalsIgnoreCase(text)) {
                return dialogType;
            }
        }
        return null;
    }

    public String toText() {
        return text;
    }
}
