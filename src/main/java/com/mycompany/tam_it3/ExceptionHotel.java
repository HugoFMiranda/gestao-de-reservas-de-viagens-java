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
public class ExceptionHotel extends Exception implements Serializable{

    /**
     * Creates a new instance of <code>ExceptionHotel</code> without detail
     * message.
     */
    public ExceptionHotel() {
        super("O preço do quarto de Hotel não pode ser negativo!");
    }

    /**
     * Constructs an instance of <code>ExceptionHotel</code> with the specified
     * detail message.
     *
     * @param msg
     */
    public ExceptionHotel(String msg) {
        super(msg);
    }
}
