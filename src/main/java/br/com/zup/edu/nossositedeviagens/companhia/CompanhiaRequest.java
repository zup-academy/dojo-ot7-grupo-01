package br.com.zup.edu.nossositedeviagens.companhia;


import br.com.zup.edu.nossositedeviagens.cadastropais.Pais;

import javax.persistence.EntityManager;
import javax.validation.constraints.NotBlank;

public class CompanhiaRequest {

    @NotBlank
    private String nome;

    private Long paisId;

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
