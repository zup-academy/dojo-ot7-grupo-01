package br.com.zup.edu.nossositedeviagens.companhia;



import br.com.zup.edu.nossositedeviagens.cadastropais.Pais;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class Companhia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String nome;

    @CreationTimestamp
    private LocalDateTime instanteCriacao;

    @ManyToOne
    private Pais pais;

    public Companhia() {
    }

    public Companhia(Long id, String nome, LocalDateTime instanteCriacao, Pais pais) {
        this.id = id;
        this.nome = nome;
        this.instanteCriacao = instanteCriacao;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getInstanteCriacao() {
        return instanteCriacao;
    }

    public Pais getPais() {
        return pais;
    }
}
