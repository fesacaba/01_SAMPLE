package com.crud.dois.model.domain;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaRequestDomain {

  private int id;
  private String nome;
}
