package com.crud.dois.model.domain;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaResponseDomain {

  private int id;
  private String nome;
  private String obs;
}
