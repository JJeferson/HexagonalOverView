package com.hexagonaloverview.application.in;

import com.hexagonaloverview.domain.Mensagem;

import java.util.List;

public interface MensagemUseCase {
    Mensagem SaveMensagem (Mensagem mensagem);
    List<Mensagem> GetMensagens();
    List<Mensagem> findAllByStatusMensagem(String status);
}
