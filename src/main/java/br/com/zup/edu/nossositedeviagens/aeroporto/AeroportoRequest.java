package br.com.zup.edu.nossositedeviagens.aeroporto;

import br.com.zup.edu.nossositedeviagens.cadastropais.Pais;
import br.com.zup.edu.nossositedeviagens.validacao.ExistsId;
import br.com.zup.edu.nossositedeviagens.validacao.UniqueValue;

import javax.persistence.EntityManager;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AeroportoRequest {

    @NotBlank
    @UniqueValue(domainClass = Aeroporto.class, fieldName = "nome")
    private String nome;
    @NotNull
    @ExistsId(domainClass = Pais.class, fieldName = "id")
    private Long paisId;

    public AeroportoRequest(String nome, Long paisId) {
        this.nome = nome;
        this.paisId = paisId;
    }

    public Aeroporto toModel(EntityManager manager) {

        Pais pais = manager.find(Pais.class, paisId);
        return new Aeroporto(nome, pais);
    }


}
