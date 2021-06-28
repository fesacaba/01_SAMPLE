package com.crud.dois.gateway.repository.converter;

import com.crud.dois.model.domain.PessoaRequestDomain;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class RefundMappaer implements RowMapper<PessoaRequestDomain>{

  @Override
  public PessoaRequestDomain mapRow(ResultSet resultSet, int i) throws SQLException {
    return PessoaRequestDomain.builder()
        .id(resultSet.getInt("id"))
        .nome(resultSet.getString("nome"))
        .build();
  }
}
