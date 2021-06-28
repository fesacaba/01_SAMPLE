package br.com.pessoa.service;

//import br.com.pessoa.client.FinanceiroClient;
import br.com.pessoa.client.dto.Salario;
import br.com.pessoa.controller.dto.Pessoa;
import br.com.pessoa.model.PessoaModel;
import br.com.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private FinanceiroClient financeiroClient;

    public Pessoa buscarDadosPessoas(String cpf) {

        PessoaModel pessoa = pessoaRepository.findByCpf(cpf);
        Salario salario = financeiroClient.buscarSalarioPorCPF(cpf);
        return Pessoa
                .builder()
                .cpf(pessoa.getCpf())
                .name(pessoa.getName())
                .build();
    }
}
