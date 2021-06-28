package com.teste.logicas.console;

import com.teste.logicas.controller.dto.Parans;
import org.springframework.stereotype.Service;

@Service("nintendo")
public class Nitendo implements Videogame {

    @Override
    public Parans process(Parans parans) {
        System.out.println("Nintendo");
        return null;
    }
}
