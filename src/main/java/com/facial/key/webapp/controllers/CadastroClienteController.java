package com.facial.key.webapp.controllers;

import com.facial.key.webapp.domain.cliente.CadastraCliente;
import com.facial.key.webapp.domain.cliente.DadosCadastraCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cadastroCliente")
public class CadastroClienteController {
    List<CadastraCliente> listaCliente = new ArrayList<>();
    @PostMapping
    public CadastraCliente cadastroCliente(@RequestBody DadosCadastraCliente dados){
        var cliente = new CadastraCliente(dados);
        listaCliente.add(cliente);
                return cliente;
    }

    @GetMapping
    public List<CadastraCliente> listarCliente(){


        return listaCliente;
    }
}
