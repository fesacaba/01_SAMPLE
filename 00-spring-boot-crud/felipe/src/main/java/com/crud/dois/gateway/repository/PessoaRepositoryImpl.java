package com.crud.dois.gateway.repository;

import com.crud.dois.config.file.FileLoad;
import com.crud.dois.gateway.repository.converter.RefundMappaer;
import com.crud.dois.model.domain.PessoaRequestDomain;
import com.crud.dois.model.PessoaRequest;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class PessoaRepositoryImpl implements  PessoaJdbcTemplateRepository {

  private final JdbcTemplate jdbcTemplate;
  private final FileLoad fileLoad;

  @Override
  public PessoaRequestDomain findall(PessoaRequest request) {
   List<PessoaRequestDomain> response =
       (List<PessoaRequestDomain>)
           executeQueryPessoaParan(
               request,
               "/queries/consult.sql",
               new RefundMappaer());
       return !response.isEmpty() ? response.get(0) : null;
  }

  private Object executeQueryPessoaParan(
      PessoaRequest pessoaRequest,
      String sqlFileName,
      RowMapper objectToRetunr) {
    return jdbcTemplate.query(
        this.fileLoad.getFileContent(sqlFileName).get(),
        objectToRetunr,
        pessoaRequest.getId(),
        pessoaRequest.getNome()
    );
  }
}
