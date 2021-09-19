package com.hexagonaloverview.application.out;

import com.hexagonaloverview.domain.Mensagem;

import java.util.List;

public interface MensagemPortOut {
    Mensagem SaveMensagem (Mensagem mensagem);
    List<Mensagem> GetMensagens();
    List<Mensagem> findAllByStatusMensagem(String status);
}
