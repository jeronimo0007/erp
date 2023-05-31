package br.com.jeronimocardoso.jeronimocardoso_erp.controller;


import br.com.jeronimocardoso.jeronimocardoso_erp.models.Cliente;
import br.com.jeronimocardoso.jeronimocardoso_erp.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {



    @Autowired
    private ClienteService clienteService;



    @GetMapping("/")
    public List<Cliente> lista(){

        return clienteService.recuperarClientes();
    }



    @PostMapping("/inserir")
    public Cliente inserir(@RequestBody Cliente cliente){

        return clienteService.salvarCliente(cliente);

    }

    @PutMapping("/atualizar")
    public String atualizacao(){
        return "Atualizando cliente";
    }

    @PatchMapping ("/atualizar_status")
    public String atualizarStatus(){
        return "Atualizando status do cliente";
    }

    @DeleteMapping("/{id}")
    public String apagar(@PathVariable Long id ){
        return "apagando cliente";
    }

    @GetMapping("/{cliente_id}")
    public Cliente getCliente(@PathVariable String cliente_id )
    {


        //Cliente cliente = clienteService.recuperaCliente(cliente_id);
        Cliente cliente = clienteService.recuperaClientePorCpf(cliente_id);

        return cliente;

    }

    @GetMapping("/teste")
    public String teste(){
        return "testando ";
    }


}
