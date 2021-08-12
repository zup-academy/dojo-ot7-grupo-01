package br.com.zup.edu.nossositedeviagens.rota;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.Duration;

public class RotaRequest {


    private String nome;

    @NotBlank
    private String origem;
    @NotBlank
    private String destino;
    @Positive
    @NotNull
    private Duration duracao;


    public RotaRequest(String nome, String origem, String destino, Duration duracao) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.duracao = duracao;
    }

}
