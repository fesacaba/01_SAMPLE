package com.teste.logicas.teste;

import java.util.HashMap;

public class ControlMap {

    public String teste(String id) {
        HashMap<String, String> hs = new HashMap<String, String>();
        hs.put(TesteEnum.FELIPE.getId(),TesteEnum.FELIPE.getNome());
        hs.put(TesteEnum.DANIELE.getId(),TesteEnum.DANIELE.getNome());
        return hs.get(id);
    }
}
