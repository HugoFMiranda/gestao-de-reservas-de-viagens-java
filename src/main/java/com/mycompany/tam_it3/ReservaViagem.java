/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;

/**
 * Uma reserva Singular é caraterizada por um código único, um destino, uma data
 * de partida e uma data de regresso, voos (ida e de regresso, opcionais), um
 * alojamento tipo hotel, o número de pessoas, o cliente que vai estar associado
 * à reserva e a data da reserva.
 *
 * @author Catarina
 */
public abstract class ReservaViagem implements IPagavel, Comparable<ReservaViagem>, Serializable{

    /**
     *
     * @return
     */
    public static int getNrReservasViagem() {
        return nrReservasViagem;
    }

    private int codigoUnico;
    private int nrPessoas;
    private int taxa;
    private Data dataReserva;
    private Data dataPartida;
    private Data dataRegresso;
    private Cliente cliente;
    private float preco;

    private static int nrReservasViagem = 0;

    private static final String STRING_PREDEFINIDO = "Nao definido";
    private static final int INT_PREDEFINIDO = 0;
    private static final int TAXA_OMISSAO = 20;

    /**
     * Construtor vazio
     */
    public ReservaViagem() {
        this.codigoUnico = ++nrReservasViagem;
        this.nrPessoas = INT_PREDEFINIDO;
        this.dataReserva = new Data();
        this.dataPartida = new Data();
        this.dataRegresso = new Data();
        this.cliente = new Cliente();
    }

    /**
     * Construtor com os parametros:
     * @param nrPessoas
     * @param dataReserva
     * @param dataPartida
     * @param dataRegresso
     * @param cliente
     */
    public ReservaViagem(int nrPessoas, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente) {
        this.codigoUnico = ++nrReservasViagem;
        this.nrPessoas = nrPessoas;

        this.dataReserva = new Data(dataPartida);
        this.dataPartida = new Data(dataPartida);
        this.dataRegresso = new Data(dataPartida);
        this.cliente = cliente;
    }

    /**
     * Construtor com os parametros:
     * @param nrPessoas
     * @param dataReserva
     * @param dataPartida
     * @param dataRegresso
     * @param cliente
     * @param taxa
     */
    public ReservaViagem(int nrPessoas, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente, int taxa) {
        this.codigoUnico = ++nrReservasViagem;
        this.nrPessoas = nrPessoas;

        this.dataReserva = new Data(dataPartida);
        this.dataPartida = new Data(dataPartida);
        this.dataRegresso = new Data(dataPartida);
        this.cliente = cliente;
        this.taxa = taxa;
    }
    /**
     * Metodo copia
     * @param rv 
     */
    public ReservaViagem(ReservaViagem rv) {
        this.codigoUnico = ++nrReservasViagem;
        this.nrPessoas = rv.nrPessoas;

        this.dataReserva = new Data(rv.dataPartida);
        this.dataPartida = new Data(rv.dataPartida);
        this.dataRegresso = new Data(rv.dataPartida);
        this.cliente = rv.cliente;
    }

    /**
     * Retorna o codigo da reserva
     * @return
     */
    public int getCodigoUnico() {
        return codigoUnico;
    }

    /**
     * Retorna a taxa associada a reserva
     * @return
     */
    public int getTaxa() {
        return taxa;
    }
    /**
     * Define o codigo da reserva
     * @param codigoUnico 
     */
    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    /**
     * Retorna o numero de pessoas associadas a reserva
     * @return
     */
    public int getNrPessoas() {
        return nrPessoas;
    }
    /**
     * Define o numero de pessoas associadas a reserva
     * @param nrPessoas 
     */
    public void setNrPessoas(int nrPessoas) {
        this.nrPessoas = nrPessoas;
    }

    /**
     * Retorna a data de reserva
     * @return
     */
    public Data getDataReserva() {
        return new Data(dataReserva);
    }

    /**
     * Retorna o Preco da reserva
     * @return
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Define o Preco da reserva
     * @param preco
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * Define a data de reserva
     * @param dataReserva
     */
    public void setDataReserva(Data dataReserva) {
        this.dataReserva = new Data(dataReserva);
    }

    /**
     * Retorna a data de partida
     * @return
     */
    public Data getDataPartida() {
        return new Data(dataReserva);
    }
    /**
     * Define a data de partida
     * @param dataPartida 
     */
    public void setDataPartida(Data dataPartida) {
        this.dataPartida = new Data(dataPartida);
    }

    /**
     * Define a taxa da reserva
     * @param taxa
     */
    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }
    /**
     * Retorna a data de regresso
     * @return 
     */
    public Data getDataRegresso() {
        return new Data(dataReserva);
    }
    /**
     * Define a data de regresso
     * @param dataRegresso 
     */
    public void setDataRegresso(Data dataRegresso) {
        this.dataRegresso = new Data(dataReserva);
    }
    /**
     * Retorna o cliente associado a reserva
     * @return 
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente associado a reserva
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Metodo equals
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        final ReservaViagem other = (ReservaViagem) obj;
        return this.codigoUnico == other.codigoUnico
                && this.nrPessoas == other.nrPessoas
                && this.dataReserva.equals(other.dataReserva)
                && this.dataPartida.equals(other.dataPartida)
                && this.dataRegresso.equals(other.dataRegresso)
                && this.cliente.equals(other.cliente)
                && this.taxa == other.taxa;
    }
    @Override
    public String toString() {
        return "\nReservaViagem{" + "codigoUnico=" + codigoUnico + ", nrPessoas=" + nrPessoas + ", dataReserva=" + dataReserva + ", dataPartida=" + dataPartida + ", dataRegresso=" + dataRegresso + ", cliente=" + cliente + ", Taxa = " + taxa + ", Preço total da reserva = " + preco +'}';
    }

//    @Override
//    public float obterCustoReservaHotel() {
//        
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
    /**
     * Comparaa as datas das reservas
     * @param o
     * @return 
     */
    @Override
    public int compareTo(ReservaViagem o) {
        if (this.getDataReserva().isMaior(o.getDataReserva()) == true)
        {
            return 1;
        } else if (this.getDataReserva().isMaior(o.getDataReserva()) == false)
        {
            return -1;
        } else
        {
            return 0;
        }
    }

}
