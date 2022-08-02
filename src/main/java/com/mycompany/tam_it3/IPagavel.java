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
public interface IPagavel extends Serializable{

    /**
     * Devolve o custo da reserva
     *
     * @return custo da reserva
     */
    public float obterCustoReservaHotel();
}
