package br.com.jeronimocardoso.jeronimocardoso_erp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class Cliente{

    @GetMapping("/")
    public String lista(){
        return "lista de clientes";
    }

    @PostMapping("/inserir")
    public String inserir(){
        return "Inserindo cliente";
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

    @GetMapping("/{id}")
    public String getCliente(@PathVariable Long id ){
        return "recuperando  cliente: " + id;
    }

    @GetMapping("/teste")
    public String teste(){
        return "testando ";
    }


}
