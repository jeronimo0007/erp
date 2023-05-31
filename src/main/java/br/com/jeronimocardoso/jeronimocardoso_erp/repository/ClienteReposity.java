package br.com.jeronimocardoso.jeronimocardoso_erp.repository;


import br.com.jeronimocardoso.jeronimocardoso_erp.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteReposity extends JpaRepository<Cliente, Long> {


    Cliente findByCpfCnpj(String documento);


}
