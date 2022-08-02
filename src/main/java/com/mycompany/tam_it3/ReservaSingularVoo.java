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
public class ReservaSingularVoo extends ReservaSingular implements IPagavelVoo, Serializable {

    private int codVooIda;
    private int codVooRegresso;
    private int precobilhete;

    /**
     * Construtor com os parametros:
     * @param codVooIda
     * @param codVooRegresso
     */
    public ReservaSingularVoo(int codVooIda, int codVooRegresso) {
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
     * @param destino
     * @param alojamento
     */
    public ReservaSingularVoo(int nrPessoas, int codVooIda, int codVooRegresso, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente,int taxa, Destino destino, Hotel alojamento) {
        super(nrPessoas, dataReserva, dataPartida, dataRegresso, cliente,taxa, destino, alojamento);
        this.codVooIda = codVooIda;
        this.codVooRegresso = codVooRegresso;
    }

    /**
     * Metodo copia
     * @param rsVoo
     */
    public ReservaSingularVoo(ReservaSingularVoo rsVoo) {
        this(rsVoo.getNrPessoas(), rsVoo.getCodVooIda(), rsVoo.getCodVooRegresso(), rsVoo.getDataReserva(), rsVoo.getDataPartida(), rsVoo.getDataRegresso(), rsVoo.getCliente(),rsVoo.getTaxa(), rsVoo.getDestino(), rsVoo.getAlojamento());
    }

    /**
     * Retorna o codigo do voo de ida
     * @return
     */
    public int getCodVooIda() {
        return codVooIda;
    }

    /**
     *Retorna o codigo do voo de regresso
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
     * Define o codigo do voo de regresso
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
        if (super.equals(obj) == false)
        {
            return false;
        }
        final ReservaSingularVoo other = (ReservaSingularVoo) obj;
        return this.codVooIda == other.codVooIda
                && this.codVooRegresso == other.codVooRegresso;
    }
    /**
     * Procura um Voo atraves dos seguintes parametros:
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
     * Obtem o custo do voo de regresso
     * @return 
     */
    @Override
    public float obterCustoVooRegresso() {
        int npessoas = this.getNrPessoas();
        float preco = npessoas*precobilhete;
        return preco;
    }
    /**
     * Retorna a reserva em string
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "codVooIda=" + codVooIda + ", codVooRegresso=" + codVooRegresso + '}';
    }

    /**
     * Mostra os voos associados a reserva
     * @return
     */
    public String mostraVoos() {
        return "Ida  : " + codVooIda + "\nVolta: " + codVooRegresso;
    }

}
