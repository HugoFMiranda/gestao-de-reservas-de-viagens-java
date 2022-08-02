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
public class ExceptionClientes extends Exception implements Serializable{

    /**
     * Creates a new instance of <code>ExceptionClientes</code> without detail
     * message.
     */
    public ExceptionClientes() {
        super("O nome do cliente deve conter apenas letras do alfabeto e espaço!");
    }

    /**
     * Constructs an instance of <code>ExceptionClientes</code> with the
     * specified detail message.
     *
     * @param msg
     */
    public ExceptionClientes(String msg) {
        super(msg);
    }
}
