/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import java.io.Serializable;

/**
 *
 * @author HugoM
 */
public interface ICategoriaEservico extends Serializable {

    /**
     * Categoria de hotel *
     */
    public static final String UMA_ESTRELA = "*";
    /**
     * Categoria de hotel **
     */
    public static final String DUAS_ESTRELAS = "**";
    /**
     * Categoria de hotel ***
     */
    public static final String TRES_ESTRELAS = "***";
    /**
     * Categoria de hotel ****
     */
    public static final String QUATRO_ESTRELAS = "****";
    /**
     * Categoria de hotel ******
     */
    public static final String CINCO_ESTRELAS = "*****";
    /**
     * Categoria de hotel por omissao *
     */
    public static final String CATEGORIA_POR_OMISSAO = UMA_ESTRELA;
    
    /**
     * Valor do servico de transfer por omissao
     */
    public static final boolean SERVICO_POR_OMISSAO = false;

    /**
     * Valida se o hotel oferece serviço de transfer
     *
     * @return serviço de transfer (true/false)
     */
    public boolean oferecerTransfer();
}

