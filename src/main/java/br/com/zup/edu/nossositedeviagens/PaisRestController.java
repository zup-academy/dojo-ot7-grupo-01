package br.com.zup.edu.nossositedeviagens;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/paises")
public class PaisRestController {

    private PaisRepository paisRepository;

    public PaisRestController(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public PaisRequest savePais(@RequestBody @Valid PaisRequest paisRequest){

    }
}
