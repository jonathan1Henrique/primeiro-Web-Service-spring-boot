package com.prolimp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ProdutoDTO implements Serializable {

    private Long id;

    private String nome;

    private String marca;

    private Long codigoBarra;

    private Long quantidade;

}
