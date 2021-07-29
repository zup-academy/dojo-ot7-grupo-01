package br.com.zup.edu.nossositedeviagens.cadastropais;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;

public class PaisRequest {

    @NotBlank
    private String nome;

    public PaisRequest() {
    }

    public PaisRequest(Pais pais) {
        this.nome = pais.getNome();
    }

    public Pais toModel(){
        return new Pais(nome);
    }

    public String getNome() {
        return nome;
    }
}
