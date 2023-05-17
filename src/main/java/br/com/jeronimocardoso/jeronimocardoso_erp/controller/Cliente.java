package br.com.jeronimocardoso.jeronimocardoso_erp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class Cliente{

    @GetMapping("/lista")
    public String getListaClientes(){
        return "Testando nosso primeiro endpoinnt";
    }


}
