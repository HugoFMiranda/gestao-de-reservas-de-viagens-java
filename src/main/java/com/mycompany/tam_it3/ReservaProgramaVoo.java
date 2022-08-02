/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mdm
 */
public class ReservaProgramaVoo extends ReservaPrograma implements IPagavelVoo, Serializable{
    private int codVooIda;
    private int codVooRegresso;

    /**
     *
     */
    public int precobilhete;
   
    /**
     * Construtor com os parametros:
     * @param codVooIda
     * @param codVooRegresso
     */
    public ReservaProgramaVoo(int codVooIda, int codVooRegresso) {
        super();
        this.codVooIda = codVooIda;
        this.codVooRegresso = codVooRegresso;
    }
    
    /**
     * Construtor com os parametros:
     * @param nrPessoas
     * @param codVooIda
     * @param codVooRegresso
     * @param dataReserva
     * @param dataPartida
     * @param dataRegresso
     * @param cliente
     * @param taxa
     * @param programa
     * @param alojamentosDiarios
     * @param dataInicio
     */
    public ReservaProgramaVoo(int nrPessoas, int codVooIda, int codVooRegresso, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente,int taxa, ProgramaViagem programa, ArrayList<Hotel> alojamentosDiarios, Data dataInicio) {
        super(nrPessoas, dataReserva, dataPartida, dataRegresso, cliente,taxa, programa, alojamentosDiarios, dataInicio);
        this.codVooIda = codVooIda;
        this.codVooRegresso = codVooRegresso;
    }
    /**
     * Metodo copia
     * @param rpVoo 
     */
    public ReservaProgramaVoo(ReservaProgramaVoo rpVoo) {
        this(rpVoo.getNrPessoas(), rpVoo.getCodVooIda(), rpVoo.getCodVooRegresso(), rpVoo.getDataReserva(), rpVoo.getDataPartida(), rpVoo.getDataRegresso(), rpVoo.getCliente(),rpVoo.getTaxa(), rpVoo.getPrograma(), rpVoo.getAlojamentosDiarios(), rpVoo.getDataInicio());
    }

    /**
     * Retorna o codigo do voo de ida
     * @return
     */
    public int getCodVooIda() {
        return codVooIda;
    }

    /**
     * Retorna o codigo do voo de Regresso
     * @return
     */
    public int getCodVooRegresso() {
        return codVooRegresso;
    }

    /**
     * Define o codigo do voo de ida
     * @param codVooIda
     */
    public void setCodVooIda(int codVooIda) {
        this.codVooIda = codVooIda;
    }
    /**
     * Define o codigo do voo de Regresso
     * @param codVooRegresso 
     */
    public void setCodVooRegresso(int codVooRegresso) {
        this.codVooRegresso = codVooRegresso;
    }
    /**
     * Metodo equals
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) == false) {
            return false;
        }
        final ReservaProgramaVoo other = (ReservaProgramaVoo) obj;
        return this.codVooIda==other.codVooIda
                && this.codVooRegresso==other.codVooRegresso;
    }
    
    /**
     * Encontra o voo atraves dos parametros:
     * @param cod
     * @param v
     */
    public void encontrarVoo(int cod, ArrayList<Voo> v){
        for (Voo voo : v)
        {
            if (cod == voo.getCodigoVoo())
            {
                precobilhete = voo.getPrecobilhete();
            }
        }
    }
    /**
     * Obtem o custo do voo de ida
     * @return 
     */
    @Override
    public float obterCustoVooIda() { 
        int npessoas = this.getNrPessoas();
        float preco = npessoas*precobilhete;
        return preco;
    }
    /**
     * Obtem o custo do voo de ida
     * @return 
     */
    @Override
    public float obterCustoVooRegresso() {
        int npessoas = this.getNrPessoas();
        float preco = npessoas*precobilhete;
        return preco;
    }
    /**
     * Retorna a inforamacao da reserva em string
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "codVooIda=" + codVooIda + ", codVooRegresso=" + codVooRegresso + '}';
    }
    /**
     * mMostra os voos associados
     * @return 
     */
    public String mostraVoos(){
        return "Ida  : " + codVooIda + "\nVolta: "+codVooRegresso;
    }
}
