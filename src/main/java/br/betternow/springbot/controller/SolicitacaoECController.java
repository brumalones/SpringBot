package br.betternow.springbot.controller;

import br.betternow.springbot.controller.dto.ec.BandeiraEcDto;
import br.betternow.springbot.controller.dto.ec.DomicilioBancarioEcDto;
import br.betternow.springbot.controller.dto.ec.MeioPagamentoEcDto;
import br.betternow.springbot.controller.dto.ec.RegistradoraECDto;
import br.betternow.springbot.controller.form.ec.RegistradoraEcForm;
import br.betternow.springbot.model.dialog.ec.BandeiraEC;
import br.betternow.springbot.model.dialog.ec.DomicilioBancarioEC;
import br.betternow.springbot.model.dialog.ec.MeioPagamentoEc;
import br.betternow.springbot.model.dialog.ec.RegistradoraEC;
import br.betternow.springbot.repository.SolicitacaoEcRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.io.IOException;
import java.net.URI;

@RestController
@RequestMapping("/dialogs/solicitacaoec")
public class SolicitacaoECController {

    private SolicitacaoEcRepository ecRepository = new SolicitacaoEcRepository();

    @PostMapping("/create")
    public ResponseEntity createSolicitacao(UriComponentsBuilder builder) {
        URI uri = builder.path("").buildAndExpand("").toUri();
        return ResponseEntity.created(uri).body("");
    }

    @PutMapping("/update")
    public ResponseEntity putAction(@RequestBody @Valid RegistradoraEcForm form, @RequestHeader("uuid") String uuid) throws IOException {
        RegistradoraEC registradora = form.convert();
        registradora.setUuid(uuid);
        if (ecRepository.put(registradora))
            return ResponseEntity.ok(
                    new RegistradoraECDto(registradora)
            );
        else
            return ResponseEntity.notFound().build();
    }

    @GetMapping("/meiopagamento")
    public ResponseEntity meioPagamento(@RequestHeader("uuid") String uuid) {
        return ResponseEntity.ok(
                new MeioPagamentoEcDto(
                        new MeioPagamentoEc("Solicitação de EC", "Solecione o meio de pagamento do EC")
                )
        );
    }

    @GetMapping("/bandeira")
    public ResponseEntity bandeira(@RequestHeader("uuid") String uuid) {
        return ResponseEntity.ok(
                new BandeiraEcDto(
                        new BandeiraEC("Solicitação de EC", "Deseja inserir todas as bandeiras " +
                                "e todos os tipos de pagamentos?")
                )
        );
    }

    @GetMapping("/domiciliobancario")
    public ResponseEntity domiciliobancario(@RequestHeader("uuid") String uuid) {
        return ResponseEntity.ok(
                new DomicilioBancarioEcDto(
                        new DomicilioBancarioEC("Solicitação de EC", "Informe o Domicilio Bancário")
                )
        );
    }
}
