package com.crud.dois.gateway.repository;

import com.crud.dois.model.domain.PessoaRequestDomain;
import com.crud.dois.model.PessoaRequest;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJdbcTemplateRepository{

  PessoaRequestDomain findall(PessoaRequest request);

}
