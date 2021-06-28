package com.crud.dois.gateway;

import com.crud.dois.model.domain.PessoaRequestDomain;
import com.crud.dois.model.PessoaRequest;

public interface PessoaGateway {

  PessoaRequestDomain findbyParameters(PessoaRequest request);
}
