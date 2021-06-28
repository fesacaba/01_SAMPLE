package com.crud.um.gateway.http;


import com.crud.um.model.Pessoa;
import com.crud.um.usecase.PessoaUsecase;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/api")
public class PessoaController {

  @Autowired
  private PessoaUsecase usecase;
  @GetMapping("/consultaTodasPessoa")
  public List<Pessoa> getAll(int pageNumber) {
    return usecase.execute(pageNumber).getContent();
  }
}