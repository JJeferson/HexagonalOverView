package com.hexagonaloverview.framework.adapters.in.rest;

import com.hexagonaloverview.application.in.MensagemUseCase;
import com.hexagonaloverview.domain.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Mensagens")
public class MensagemRest {

    @Autowired
    MensagemUseCase mensagemUseCase;

    @Transactional
    @CacheEvict(value = "/nova_mensagem", allEntries = true)
    @PostMapping("/nova_mensagem")
    public ResponseEntity<Mensagem> novaMensagem(@RequestBody Mensagem mensagem)
    {
        Mensagem salvaMensagem = mensagemUseCase.SaveMensagem(mensagem);
        return ResponseEntity.ok(salvaMensagem);
    }

    @RequestMapping(value = "/recupera_mensagem", method = RequestMethod.GET)
    public ResponseEntity<List<Mensagem>> recupera_mensagem()
    {
        List<Mensagem> listMensagens = mensagemUseCase.GetMensagens();
        return ResponseEntity.ok(listMensagens);
    }

    @RequestMapping(value = "/recupera_mensagem_por_status", method = RequestMethod.GET)
    public ResponseEntity<List<Mensagem>> recupera_mensagem_por_status(
    @RequestParam(value = "status", required=false, defaultValue = "enviada") String status
    )
    {
        List<Mensagem> listMensagens = mensagemUseCase.findAllByStatusMensagem(status);
        return ResponseEntity.ok(listMensagens);
    }
}
