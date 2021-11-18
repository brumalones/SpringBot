package br.betternow.springbot.model.dialog.ec;

import br.betternow.springbot.model.dialog.ec.enums.DomicilioBancario;
import br.betternow.springbot.model.dialog.ec.enums.MeioPagamento;
import br.betternow.springbot.model.dialog.ec.enums.TipoEC;

public class RegistradoraEC {

    private String uuid;
    private TipoEC tipoEC;
    private MeioPagamento meioPagamento;
    private DomicilioBancario domicilioBancario;
    private Integer bandeira;

    public RegistradoraEC() {
    }

    public RegistradoraEC(TipoEC tipoEC, MeioPagamento meioPagamento, DomicilioBancario domicilioBancario, Integer bandeira) {
        this.tipoEC = tipoEC;
        this.meioPagamento = meioPagamento;
        this.domicilioBancario = domicilioBancario;
        this.bandeira = bandeira;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

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

}
