package br.com.zup.edu.nossositedeviagens.rota;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

@RestController
@RequestMapping("/rotas")
public class RotaController {

    private RotaRepository rotaRepository;

    public RotaController(RotaRepository rotaRepository) {
        this.rotaRepository = rotaRepository;
    }

    @PersistenceContext
    EntityManager entityManager;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String criaRota(@Valid @RequestBody RotaRequest rotaRequest){

        return "Criando rota";
    }
}
