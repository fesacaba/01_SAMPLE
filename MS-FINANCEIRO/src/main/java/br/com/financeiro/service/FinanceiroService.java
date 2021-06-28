package br.com.financeiro.service;

import br.com.financeiro.controller.dto.Salario;
import br.com.financeiro.model.SalarioModel;
import br.com.financeiro.repository.SalarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceiroService {

    @Autowired
    private SalarioRepository salarioRepository;

    public Salario buscarDadosSalario(String cpf) {

        SalarioModel retorno = salarioRepository.findByCpf(cpf);

        return Salario.builder().cpf(retorno.getCpf()).salario(retorno.getSalario()).build();
    }
}
