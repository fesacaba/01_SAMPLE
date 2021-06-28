package br.com.samplej.repository;

import br.com.samplej.model.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
    ContatoModel findByNome(String nome);
}
