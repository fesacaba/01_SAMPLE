package com.crud.um.gateway;

import com.crud.um.gateway.repository.PessoaRespository;
import com.crud.um.model.Pessoa;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PessoaGateway {

  private final PessoaRespository respository;

  public Page<Pessoa> execute( int pageNumber) {
    log.info("Passou no gateway");
    Page<Pessoa> retorno = respository.findAll(new PageRequest(pageNumber, 10));
    return
  }
}
