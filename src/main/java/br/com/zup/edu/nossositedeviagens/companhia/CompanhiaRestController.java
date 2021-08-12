package br.com.zup.edu.nossositedeviagens.companhia;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/companhia")
public class CompanhiaRestController {

    @PersistenceContext
    EntityManager manager;

    CompanhiaRepository companhiaRepository;

    public CompanhiaRestController(CompanhiaRepository companhiaRepository) {
        this.companhiaRepository = companhiaRepository;
    }

    @PostMapping
    @Transactional
    @ResponseStatus(code = HttpStatus.CREATED)
    public String saveCompanhia(@RequestBody @Valid CompanhiaRequest companhiaRequest){
        Companhia companhia = companhiaRepository.save(companhiaRequest.toModel(manager));
        return "Companhia criada com o id "+companhia.getId() ;
    }
}
