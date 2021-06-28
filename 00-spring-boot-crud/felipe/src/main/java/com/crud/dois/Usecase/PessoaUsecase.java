package com.crud.dois.Usecase;

import com.crud.dois.gateway.PessoaGateway;
import com.crud.dois.model.PessoaRequest;
import com.crud.dois.model.domain.PessoaRequestDomain;
import com.crud.dois.model.PessoaResponse;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class PessoaUsecase {

  private final PessoaGateway gateway;

  public PessoaResponse execute(PessoaRequest request) throws Exception {
    try{
      PessoaRequestDomain pessoaRequestDomain = gateway.findbyParameters(request);
      return Optional.ofNullable(pessoaRequestDomain)
        .map(this::builderResponseSuccess)
        .orElseGet(this::builderResponseMessageError);
    }catch (Exception e){
      return PessoaResponse.builder()
          .obs(e.getMessage())
          .build();
    }
  }

  private PessoaResponse builderResponseSuccess(PessoaRequestDomain pessoaRequestDomain) {
    return PessoaResponse.builder()
        .id(pessoaRequestDomain.getId())
        .nome(pessoaRequestDomain.getNome())
        .build();
  }

  private PessoaResponse builderResponseMessageError() {
    return PessoaResponse.builder()
        .obs("Pessoa Não Encontrada")
        .build();
  }
}
