package com.crud.estudos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Exec {

  public static void main(String[] args) {
    Coisa coisa = new Coisa();
    coisa.setNome("Felipe");
    coisa.setEnd("Rua alpes");

    System.out.println(coisaBuilder(coisa));
  }

  public static CoisaTransformada coisaBuilder(Coisa coisa) {
    return CoisaTransformada.builder()
        .nome(coisa.getNome())
        .end(coisa.getEnd())
        .build();
  }
}

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Coisa {

  public String nome;
  public String end;
}


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class CoisaTransformada {

  public String nome;
  public String end;
}

