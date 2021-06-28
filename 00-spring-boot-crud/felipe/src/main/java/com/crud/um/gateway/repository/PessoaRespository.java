package com.crud.um.gateway.repository;

import com.crud.um.model.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRespository extends JpaRepository<Pessoa, Integer> {

  Page<Pessoa> findAll(Pageable pageable);

}
