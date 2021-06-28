package com.crud.dois.gateway.http;

import com.crud.dois.Usecase.PessoaUsecase;
import com.crud.dois.model.PessoaRequest;
import com.crud.dois.model.PessoaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/v2/api")
public class PessoaController {

  private final PessoaUsecase useCase;

  @PostMapping("/consult")
  public PessoaResponse buscarPorIdENome(@RequestBody PessoaRequest request) throws Exception {
    return useCase.execute(request);
  }
}
