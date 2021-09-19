package com.hexagonaloverview.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Getter
@Setter
@Document(collection="Mensagem")
public class Mensagem {
    @Id
    @JsonProperty("id")
    private String id;
    private String statusMensagem;
    private String corpoMensagem;
}
