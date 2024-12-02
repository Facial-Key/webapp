package com.facial.key.webapp.domain.cliente;

import com.facial.key.webapp.domain.endereco.Endereco;
import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

//@Entity(name = "Cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class CadastraCliente {
    @Id
    @GeneratedValue
    Long id;

    String nome;
    String telefone;
    String email;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public CadastraCliente(DadosCadastraCliente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.endereco = new Endereco(dados.endereco());

    }
}
