package br.com.zup.edu.nossositedeviagens.companhia;


import br.com.zup.edu.nossositedeviagens.cadastropais.Pais;
import br.com.zup.edu.nossositedeviagens.validacao.UniqueValue;

import javax.persistence.EntityManager;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CompanhiaRequest {

    @NotBlank @UniqueValue(domainClass = Companhia.class, fieldName = "nome")
    private String nome;

    @NotNull
    private Long paisId;

    @Deprecated
    public CompanhiaRequest() {
    }

    public CompanhiaRequest(Companhia companhia) {
        this.nome = companhia.getNome();
        this.paisId = companhia.getId();
    }

    public String getNome() {
        return nome;
    }

    public Long getPaisId() {
        return paisId;
    }

    public Companhia toModel(EntityManager manager){
        Pais pais = manager.find(Pais.class, paisId);
        return new Companhia(nome, pais);
    }
}
