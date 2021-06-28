package br.com.pessoa.repository;

import br.com.pessoa.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

    PessoaModel findByCpf(String cpf);
}
