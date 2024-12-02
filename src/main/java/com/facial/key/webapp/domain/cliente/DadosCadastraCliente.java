package com.facial.key.webapp.domain.cliente;

import com.facial.key.webapp.domain.endereco.DadosEndereco;

public record DadosCadastraCliente(
        String nome,
        String telefone,
        String email,
        DadosEndereco endereco
) {
}
