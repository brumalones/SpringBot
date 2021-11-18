package br.betternow.springbot.controller.form.ec;

import br.betternow.springbot.model.dialog.ec.RegistradoraEC;
import br.betternow.springbot.model.dialog.ec.enums.DomicilioBancario;
import br.betternow.springbot.model.dialog.ec.enums.MeioPagamento;
import br.betternow.springbot.model.dialog.ec.enums.TipoEC;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class RegistradoraEcForm {

    @Enumerated(EnumType.STRING)
    private TipoEC tipoEC;
    @Enumerated(EnumType.STRING)
    private MeioPagamento meioPagamento;
    @Enumerated(EnumType.STRING)
    private DomicilioBancario domicilioBancario;
    private Integer bandeira;

    public TipoEC getTipoEC() {
        return tipoEC;
    }

    public void setTipoEC(TipoEC tipoEC) {
        this.tipoEC = tipoEC;
    }

    public MeioPagamento getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(MeioPagamento meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public DomicilioBancario getDomicilioBancario() {
        return domicilioBancario;
    }

    public void setDomicilioBancario(DomicilioBancario domicilioBancario) {
        this.domicilioBancario = domicilioBancario;
    }

    public Integer getBandeira() {
        return bandeira;
    }

    public void setBandeira(Integer bandeira) {
        this.bandeira = bandeira;
    }

    public RegistradoraEC convert(){
        return new RegistradoraEC(tipoEC,meioPagamento,domicilioBancario,bandeira);
    }

}
