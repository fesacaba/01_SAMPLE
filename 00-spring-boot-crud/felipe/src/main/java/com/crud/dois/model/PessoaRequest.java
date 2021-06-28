package com.crud.dois.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaRequest {

  private Long id;
  private String nome;
}
