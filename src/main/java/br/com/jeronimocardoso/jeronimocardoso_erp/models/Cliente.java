package br.com.jeronimocardoso.jeronimocardoso_erp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "tblclients", uniqueConstraints = {@UniqueConstraint(columnNames = "vat")})
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy =   GenerationType.IDENTITY)
    private Long userid;

    @Size(max = 100)
    @NotBlank
    private String company;

    @Column(name = "vat")
    @NotBlank
    private String cpfCnpj;



}
