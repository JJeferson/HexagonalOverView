package com.hexagonaloverview.framework.adapters.out;

import com.hexagonaloverview.application.out.MensagemPortOut;
import com.hexagonaloverview.domain.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MensagemPersistence implements MensagemPortOut {
    @Autowired
    MensagemRepository mensagemRepository;

    @Override
    public Mensagem SaveMensagem(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }

    @Override
    public List<Mensagem> GetMensagens() {
        return mensagemRepository.findAll();
    }

    @Override
    public List<Mensagem> findAllByStatusMensagem(String status) {
        return mensagemRepository.findAllByStatusMensagem(status);
    }
}
