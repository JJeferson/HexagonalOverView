package com.hexagonaloverview.application.service;

import com.hexagonaloverview.application.in.MensagemUseCase;
import com.hexagonaloverview.application.out.MensagemPortOut;
import com.hexagonaloverview.domain.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MensagemImplUseCase implements MensagemUseCase {
    @Autowired
    MensagemPortOut mensagemPortOut;

    @Override
    public Mensagem SaveMensagem(Mensagem mensagem) {
        return mensagemPortOut.SaveMensagem(mensagem);
    }

    @Override
    public List<Mensagem> GetMensagens() {
        return mensagemPortOut.GetMensagens();
    }

    @Override
    public List<Mensagem> findAllByStatusMensagem(String status) {
        return mensagemPortOut.findAllByStatusMensagem(status);
    }
}
