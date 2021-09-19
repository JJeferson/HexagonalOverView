package com.hexagonaloverview.framework.adapters.out;

import com.hexagonaloverview.domain.Mensagem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MensagemRepository extends MongoRepository<Mensagem,String> {
    List<Mensagem> findAllByStatusMensagem(String status);
}
