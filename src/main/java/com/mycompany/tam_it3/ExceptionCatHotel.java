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
public class ExceptionCatHotel extends Exception implements Serializable{

    /**
     * Creates a new instance of <code>ExceptionCatHotel</code> without detail
     * message.
     */
    public ExceptionCatHotel() {
        super("Insira uma categoria valida!");
    }

    /**
     * Constructs an instance of <code>ExceptionCatHotel</code> with the
     * specified detail message.
     *
     * @param msg
     */
    public ExceptionCatHotel(String msg) {
        super(msg);
    }
}
