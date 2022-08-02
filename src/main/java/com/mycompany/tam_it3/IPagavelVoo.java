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
public interface IPagavelVoo extends Serializable {

    /**
     * Devolve o custo do voo de ida
     *
     * @return custo do voo de ida
     */
    public float obterCustoVooIda();

    /**
     * Devolve o custo do voo de regresso
     *
     * @return custo do voo de regresso
     */
    public float obterCustoVooRegresso();
}
