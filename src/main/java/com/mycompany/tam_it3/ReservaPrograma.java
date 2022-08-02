/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Catarina
 */
public class ReservaPrograma extends ReservaViagem implements Serializable{
    private ProgramaViagem programa;
    private ArrayList<Hotel> alojamentosDiarios;
    private Data dataInicio;

    /**
     * Construtor vazio
     */
    public ReservaPrograma() {
        super();
        this.programa = new ProgramaViagem();
        this.alojamentosDiarios = new ArrayList<>();
        this.dataInicio = new Data();
    }
    
    /**
     * Construtor com os parametros:
     * @param nrPessoas
     * @param dataReserva
     * @param dataPartida
     * @param dataRegresso
     * @param cliente
     * @param programa
     * @param alojamentosDiarios
     * @param dataInicio
     */
    public ReservaPrograma(int nrPessoas, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente, ProgramaViagem programa, ArrayList<Hotel> alojamentosDiarios, Data dataInicio) {
        super(nrPessoas, dataReserva, dataPartida, dataRegresso, cliente);
        this.programa = programa;
        this.alojamentosDiarios = new ArrayList<>(alojamentosDiarios);
        this.dataInicio = new Data(dataInicio);
    }
    
    /**
     * Construtor com os parametros:
     * @param nrPessoas
     * @param dataReserva
     * @param dataPartida
     * @param dataRegresso
     * @param cliente
     * @param taxa
     * @param programa
     * @param alojamentosDiarios
     * @param dataInicio
     */
    public ReservaPrograma(int nrPessoas, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente,int taxa, ProgramaViagem programa, ArrayList<Hotel> alojamentosDiarios, Data dataInicio) {
        super(nrPessoas, dataReserva, dataPartida, dataRegresso, cliente,taxa);
        this.programa = programa;
        this.alojamentosDiarios = new ArrayList<>(alojamentosDiarios);
        this.dataInicio = new Data(dataInicio);
    }
        
    /**
     * Metodo copia
     * @param rp
     */
    public ReservaPrograma(ReservaPrograma rp) {
        super(rp);
        this.programa = rp.programa;
        this.alojamentosDiarios = new ArrayList<>(rp.alojamentosDiarios);
        this.dataInicio = new Data(rp.dataInicio);
    }

    /**
     * Retorna o programa associado a reserva programa
     * @return
     */
    public ProgramaViagem getPrograma() {
        return programa;
    }
    /**
     * Define o programa associado a reserva programa
     * @param programa 
     */
    public void setPrograma(ProgramaViagem programa) {
        this.programa = programa;
    }
    /**
     * Retorna os alojamentos associados a reserva programa
     * @return 
     */
    public ArrayList<Hotel> getAlojamentosDiarios() {
        return new ArrayList<>(alojamentosDiarios);
    }
    /**
     * Define os alojamentos associados a reserva programa
     * @param alojamentosDiarios 
     */
    public void setAlojamentosDiarios(ArrayList<Hotel> alojamentosDiarios) {
        this.alojamentosDiarios = new ArrayList<>(alojamentosDiarios);
    }
    /**
     * Retorna a data de inicio da reserva programa
     * @return 
     */
    public Data getDataInicio() {
        return new Data(dataInicio);
    }

    /**
     * Define a data de inicio da reserva programa
     * @param dataInicio
     */
    public void setDataInicio(Data dataInicio) {
        this.dataInicio = new Data(dataInicio);
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
        final ReservaPrograma other = (ReservaPrograma) obj;
        return this.programa.equals(other.programa)
                && this.alojamentosDiarios.equals(other.alojamentosDiarios)
                && this.dataInicio.equals(other.dataInicio);
    }
    /**
     * Obtem o custo da reserva do hotel
     * @return 
     */
    @Override
    public float obterCustoReservaHotel() {
        int noites = this.programa.getNrDias();
        int npessoas = this.getNrPessoas();
        int precquartos = 0;
        for (Hotel h: getAlojamentosDiarios()) {
            precquartos+=h.getPreconoite();
        }
        int n = npessoas/2;       
        float preco = precquartos*noites*n;    
        return preco;        
    }
    /**
     * Retorna as informacoes da reserva programa em string
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + " => ReservaPrograma{" + "programa=" + programa + ", alojamentosDiarios=" + alojamentosDiarios + ", dataInicio=" + dataInicio + '}';
    }
    
    
}
