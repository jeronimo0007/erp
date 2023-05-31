package br.com.jeronimocardoso.jeronimocardoso_erp.service;

import br.com.jeronimocardoso.jeronimocardoso_erp.models.Cliente;
import br.com.jeronimocardoso.jeronimocardoso_erp.repository.ClienteReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private  ClienteReposity clienteReposity;

    public List<Cliente> recuperarClientes(){

        return clienteReposity.findAll();


    }

    public Cliente recuperaCliente(Long userid){

        return clienteReposity.findById(userid).orElse(null);
    }


    public Cliente recuperaClientePorCpf(String documento){

        return clienteReposity.findByCpfCnpj(documento);
    }

    public Cliente salvarCliente(Cliente cliente){

        return clienteReposity.save(cliente);
    }

}
