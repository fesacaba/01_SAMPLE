package br.com.samplej.controller;

import br.com.samplej.dto.Contato;
import br.com.samplej.dto.Endereco;
import br.com.samplej.model.ContatoModel;
import br.com.samplej.repository.ContatoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@Slf4j
@CrossOrigin({"*"})
@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/contato")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping
    public Contato get() {

//        return contatoRepository.findByNome("Felipe");
        ContatoModel response = contatoRepository.findByNome("Felipe");
        return Contato
                .builder()
                .nome(response.getNome())
                .enderecos(response.getEnderecos()
                        .stream()
                        .map(Endereco::new)
                        .collect(Collectors.toList())
                )
                .build();
    }
}
