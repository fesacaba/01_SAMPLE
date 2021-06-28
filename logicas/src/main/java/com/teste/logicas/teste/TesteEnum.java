package com.teste.logicas.teste;

import lombok.Getter;

import java.util.HashMap;

@Getter
public enum TesteEnum {

    FELIPE("1", "Felipe"),
    DANIELE("2", "Daniele");

    private String id;
    private String nome;

    TesteEnum(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TesteEnum{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
