package com.teste.logicas.teste;

import java.util.HashMap;

public class Sample {

    public static void main(String[] args) {
        HashMap<String, String> maps = new HashMap<String, String>();

        maps.put("1", "Felipe");
        maps.put("2", "Daniele");
        maps.put("3", "Deise");
        maps.put("4", "Leandro");
        maps.put("5", "Erica");

        System.out.println(maps);

        String param = "5";
        String newMap = maps.get(param);
        System.out.println(newMap);

        ControlMap cc = new ControlMap();
        System.out.println(cc.teste("1"));

        System.out.println(TesteEnum.DANIELE);

    }
}
