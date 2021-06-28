package br.com.samplej.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_contato")
public class ContatoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100)
    private String nome;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contato")
    private List<EnderecoModel> enderecos;
}
