package br.com.samplej.dto;

import br.com.samplej.model.EnderecoModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Endereco {

    private String cep;

    public Endereco(EnderecoModel enderecoModel) {
        this.cep = enderecoModel.getCep();
    }
}