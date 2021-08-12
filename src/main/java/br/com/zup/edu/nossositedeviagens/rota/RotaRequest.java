package br.com.zup.edu.nossositedeviagens.rota;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.Duration;
import java.util.Objects;

public class RotaRequest {


    private String nome;

    @NotBlank
    private String origem;
    @NotBlank
    private String destino;
    @Positive
    @NotNull
    private Integer duracao;


    public RotaRequest(String nome, String origem, String destino, Integer duracao) {
        this.nome = validarNomeRota(nome);
        this.origem = origem;
        this.destino = destino;
        this.duracao = duracao;
    }

    private String validarNomeRota(String nome){
        //se der merda foi aqui
        if(Objects.isNull(this.nome)){
            return this.origem + " - " + this.destino;
        }
        return nome;
    }

    private String validaOrigemDestino (String origem, String destino){
        if(origem.equals(destino)){
            throw new RegraDeNegocioException("Não pode ");
        }
    }

}
