package br.com.zup.edu.nossositedeviagens.aeroporto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/aeroportos")
public class AeroportoController {

    @PersistenceContext
    EntityManager manager;

    private AeroportoRepository aeroportoRepository;

    public AeroportoController(AeroportoRepository aeroportoRepository) {
        this.aeroportoRepository = aeroportoRepository;
    }

    @PostMapping
    @Transactional
    @ResponseStatus(code = HttpStatus.CREATED)
    public String criarAeroporto(@RequestBody @Valid AeroportoRequest aeroportoRequest){
        Aeroporto aeroporto = aeroportoRequest.toModel(manager);
        aeroportoRepository.save(aeroporto);

        return "Aeroporto criado com o id " + aeroporto.getId() ;
    }
}


//Novo aeroporto criado e 201 retornado

//Em caso de falha, retorne 400 e os erros de validação