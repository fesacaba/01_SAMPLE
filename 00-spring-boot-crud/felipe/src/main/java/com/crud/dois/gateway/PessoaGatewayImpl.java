package com.crud.dois.gateway;

import com.crud.dois.gateway.repository.PessoaJdbcTemplateRepository;
import com.crud.dois.model.domain.PessoaRequestDomain;
import com.crud.dois.model.PessoaRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PessoaGatewayImpl implements PessoaGateway {

  private final PessoaJdbcTemplateRepository repository;

  @Override
  public PessoaRequestDomain findbyParameters(PessoaRequest request) {
    return repository.findall(request);
  }
}
