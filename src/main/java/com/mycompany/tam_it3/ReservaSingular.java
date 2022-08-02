/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;

/**
 *
 * @author Catarina
 */
public class ReservaSingular extends ReservaViagem implements Serializable{
    private Destino destino;
    private Hotel alojamento;

    /**
     * Construtor vazio
     */
    public ReservaSingular() {
        super();
        this.destino = new Destino();
        this.alojamento = new Hotel();
    }
    
    /**
     * Construtor com os parametros:
     * @param nrPessoas
     * @param dataPartida
     * @param dataReserva
     * @param dataRegresso
     * @param alojamento
     * @param destino
     * @param cliente
     */
    public ReservaSingular(int nrPessoas, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente, Destino destino, Hotel alojamento) {
        super(nrPessoas, dataReserva, dataPartida, dataRegresso, cliente);
        this.destino = destino;
        this.alojamento = alojamento;
    }
    /**
     * Construtor com os parametros:
     * @param nrPessoas
     * @param dataReserva
     * @param dataPartida
     * @param cliente
     * @param taxa
     * @param dataRegresso
     * @param destino 
     * @param alojamento 
     */
     public ReservaSingular(int nrPessoas, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente,int taxa, Destino destino, Hotel alojamento) {
        super(nrPessoas, dataReserva, dataPartida, dataRegresso, cliente, taxa);
        this.destino = destino;
        this.alojamento = alojamento;
    }
    /**
     * Metodo copia
     * @param rs 
     */
    public ReservaSingular(ReservaSingular rs) {
        super(rs);
        this.destino = rs.destino;
        this.alojamento = rs.alojamento;
    }
    /**
     * Retorna o destino da reserva
     * @return 
     */
    public Destino getDestino() {
        return destino;
    }
    /**
     * Define o destino da reserva
     * @param destino 
     */
    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    /**
     * Retorna o alojamento da reserva
     * @return
     */
    public Hotel getAlojamento() {
        return alojamento;
    }
    /**
     * Define o alojamento da reserva
     * @param alojamento 
     */
    public void setAlojamento(Hotel alojamento) {
        this.alojamento = alojamento;
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
        final ReservaSingular other = (ReservaSingular) obj;
        return this.alojamento.equals(other.alojamento)
                && this.destino.equals(other.destino);
    }
    /**
     * obtem o custo da reserva do hotel
     * @return 
     */
    @Override
    public float obterCustoReservaHotel() {
        int noites = this.getDataRegresso().calcularDiferenca(this.getDataPartida());
        if (noites == 0)
        {
            noites =1;
        }
        int npessoas = this.getNrPessoas();
        float precquartos = this.getAlojamento().getPreconoite();
        int n = 0;
        if (npessoas%2==0)
        {
            n=npessoas/2;
        }else{
            n=(npessoas/2)+1;
        }

        float preco = precquartos*noites*n;    
        return preco;        
    }
    /**
     * Retorna a informacao da reserva em string
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + " => ReservaSingular{" + "destino=" + destino + ", alojamento=" + alojamento + '}';
    }
    
    
}
