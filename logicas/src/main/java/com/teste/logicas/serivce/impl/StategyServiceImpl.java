package com.teste.logicas.serivce.impl;

import com.teste.logicas.console.Videogame;
import com.teste.logicas.controller.dto.Parans;
import com.teste.logicas.serivce.StrategyService;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StategyServiceImpl implements StrategyService {

    private final ApplicationContext applicationContext;

    @Override
    public void find(String nome) {
        Videogame impl = getImpl(nome);
        impl.process(new Parans("Felipe", 34));
    }

    private Videogame getImpl(String nome) {
        return applicationContext.getBean(nome, Videogame.class);
    }
}
