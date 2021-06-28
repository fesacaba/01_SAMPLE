package com.crud.um.usecase;

import com.crud.um.gateway.PessoaGateway;
import com.crud.um.model.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class PessoaUsecase {

  private final PessoaGateway gateway;

  public Page<Pessoa> execute(int numberPage) {
    log.info("Passou no usecase");
    return gateway.execute(numberPage);
  }
}
