package br.com.zup.edu.nossositedeviagens.companhia;

import br.com.zup.edu.nossositedeviagens.cadastropais.Pais;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class CompanhiaRequest {

    @NotBlank
    private String nome;

    @ManyToOne
    private Pais pais;

    public CompanhiaRequest() {
    }


}
