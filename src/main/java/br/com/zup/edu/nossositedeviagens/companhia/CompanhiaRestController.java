package br.com.zup.edu.nossositedeviagens.companhia;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CompanhiaRestController {

    CompanhiaRepository companhiaRepository;

    public CompanhiaRestController(CompanhiaRepository companhiaRepository) {
        this.companhiaRepository = companhiaRepository;
    }

    public String saveCompanhia(@RequestBody @Valid CompanhiaRequest companhiaRequest){

    }
}
