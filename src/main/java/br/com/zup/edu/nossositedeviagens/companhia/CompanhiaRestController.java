package br.com.zup.edu.nossositedeviagens.companhia;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/companhia")
public class CompanhiaRestController {

    CompanhiaRepository companhiaRepository;

    public CompanhiaRestController(CompanhiaRepository companhiaRepository) {
        this.companhiaRepository = companhiaRepository;
    }

    @PostMapping
    @Transactional
    public String saveCompanhia(@RequestBody @Valid CompanhiaRequest companhiaRequest){
        return "Deu certo";
    }
}
