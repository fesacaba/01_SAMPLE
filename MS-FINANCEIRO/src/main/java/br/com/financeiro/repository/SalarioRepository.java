package br.com.financeiro.repository;

import br.com.financeiro.model.SalarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalarioRepository extends JpaRepository<SalarioModel, Long> {

    SalarioModel findByCpf(String cpf);
}
