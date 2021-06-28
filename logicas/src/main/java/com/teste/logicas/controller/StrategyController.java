package com.teste.logicas.controller;

import com.teste.logicas.serivce.StrategyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/v1/strategy")
@CrossOrigin({"*"})
@Slf4j
public class StrategyController {

    @Autowired
    private StrategyService strategyService;

    @GetMapping("listar")
    public void findAll(String nome) {
        strategyService.find(nome);
    }

}
