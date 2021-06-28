package com.teste.logicas.console;

import com.teste.logicas.controller.dto.Parans;
import org.springframework.stereotype.Service;

@Service("sony")
public class Sony implements Videogame {

    @Override
    public Parans process(Parans parans) {
        System.out.println("Sony");
        System.out.println(parans);
        return null;
    }
}
