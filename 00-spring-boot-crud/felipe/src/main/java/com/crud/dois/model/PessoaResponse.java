package com.crud.dois.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaResponse {

  private int id;
  private String nome;
  private String obs;

}
