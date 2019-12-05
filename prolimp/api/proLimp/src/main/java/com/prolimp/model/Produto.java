package com.prolimp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "produto", schema = "prolimp")
public class Produto implements Serializable {
    /*
    * Entidade produto
    * @author Jonathan
    */

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SQ_PRODUTO", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SQ_PRODUTO", sequenceName = "prolimp.SQ_PRODUTO", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "CODIGO_BARRA")
    private Long codigoBarra;

    @Column(name = "QUANTIDADE")
    private Long quantidade;
}
