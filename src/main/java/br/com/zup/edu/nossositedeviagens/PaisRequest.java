package br.com.zup.edu.nossositedeviagens;

public class PaisRequest {
    private String nome;

    public PaisRequest() {
    }

    public PaisRequest(Pais pais) {
        this.nome = pais.getNome();
    }

    public Pais toModel(){

    }
}
