package br.com.financeiro.controller;

import br.com.financeiro.controller.dto.Salario;
import br.com.financeiro.service.FinanceiroService;
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
@RequestMapping(path = "/v1/financeiro")
public class FinanceiroController {

    @Autowired
    private FinanceiroService financeiroService;

    @GetMapping("/{cpf}")
    public ResponseEntity<Salario> find(@PathVariable("cpf")String cpf) {
        log.info("****[CONTROLLER - GET REQUEST - /v1/financeiro/find]****");
        return new ResponseEntity(financeiroService.buscarDadosSalario(cpf), HttpStatus.OK);
    }
}
