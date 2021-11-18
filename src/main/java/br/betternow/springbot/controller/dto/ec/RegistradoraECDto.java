package br.betternow.springbot.controller.dto.ec;

import br.betternow.springbot.model.dialog.ec.RegistradoraEC;
import br.betternow.springbot.model.dialog.ec.enums.DomicilioBancario;
import br.betternow.springbot.model.dialog.ec.enums.MeioPagamento;
import br.betternow.springbot.model.dialog.ec.enums.TipoEC;

public class RegistradoraECDto {

    private String uuid;
    private TipoEC tipoEC;
    private MeioPagamento meioPagamento;
    private DomicilioBancario domicilioBancario;
    private Integer bandeira;

    public RegistradoraECDto(RegistradoraEC registradoraEC) {
        this.uuid = registradoraEC.getUuid();
        this.tipoEC = registradoraEC.getTipoEC();
        this.meioPagamento = registradoraEC.getMeioPagamento();
        this.domicilioBancario = registradoraEC.getDomicilioBancario();
        this.bandeira = registradoraEC.getBandeira();
    }

    public String getUuid() {
        return uuid;
    }

    public TipoEC getTipoEC() {
        return tipoEC;
    }

    public MeioPagamento getMeioPagamento() {
        return meioPagamento;
    }

    public DomicilioBancario getDomicilioBancario() {
        return domicilioBancario;
    }

    public Integer getBandeira() {
        return bandeira;
    }
}
