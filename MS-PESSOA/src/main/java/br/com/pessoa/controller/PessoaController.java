package br.com.pessoa.controller;

import br.com.pessoa.controller.dto.Pessoa;
import br.com.pessoa.service.PessoaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@CrossOrigin({"*"})
@RequestMapping(path = "/v1/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/{cpf}")
    public ResponseEntity<Pessoa> find(@PathVariable("cpf")String cpf) {
        log.info("****[CONTROLLER - GET REQUEST - /v1/pessoa/find]****");
        return new ResponseEntity(pessoaService.buscarDadosPessoas(cpf), HttpStatus.OK);
    }
}
