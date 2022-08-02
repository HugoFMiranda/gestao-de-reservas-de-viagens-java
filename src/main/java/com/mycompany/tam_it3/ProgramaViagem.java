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
 * @author Catarina
 */
public class ProgramaViagem implements Serializable{
    /**
     * Retorna o numero de dias
     * @return 
     */
    public int getNrDias(){
        return programacaoDiaria.size();
    }
    
    private int codigoPrograma;
    private String descricao;
    private ArrayList<Data> datasEmQuePodeOcorrer;
    private ArrayList<String> programacaoDiaria;
    
    private static final String STRING_PREDEFINIDO = "Nao definido";
    private static final int INT_PREDEFINIDO = 0;
    /**
     * Construtor vazio
     */
    public ProgramaViagem() {
        this.codigoPrograma = INT_PREDEFINIDO;
        this.descricao = STRING_PREDEFINIDO;
        this.datasEmQuePodeOcorrer = new ArrayList<>();
        this.programacaoDiaria = new ArrayList<>();
    }
    /**
     * Construtor com os parametros:
     * @param codigoPrograma
     * @param descricao 
     */
    public ProgramaViagem(int codigoPrograma, String descricao) {
        this.codigoPrograma = codigoPrograma;
        this.descricao = descricao;
        this.datasEmQuePodeOcorrer = new ArrayList<>();
        this.programacaoDiaria = new ArrayList<>();
    }
    
    /**
     * Metodo copia
     * @param pv
     */
    public ProgramaViagem(ProgramaViagem pv) {
        this.codigoPrograma = pv.codigoPrograma;
        this.descricao = descricao;
        this.datasEmQuePodeOcorrer = new ArrayList<>(pv.datasEmQuePodeOcorrer);
        this.programacaoDiaria = new ArrayList<>(pv.programacaoDiaria);
    }

    /**
     * Retorna o codigo do programa
     * @return
     */
    public int getCodigoPrograma() {
        return codigoPrograma;
    }
    /**
     * Define o codigo do programa
     * @param codigoPrograma 
     */
    public void setCodigoPrograma(int codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    /**
     * Retorna a descricao do programa
     * @return
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * Define a descricao do programa
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a data em que pode ocorrer o programa
     * @return
     */
    public ArrayList<Data> getDatasEmQuePodeOcorrer() {
        return datasEmQuePodeOcorrer;
    }

    /**
     * Define as datas em que pode ocorrer o programa
     * @param datasEmQuePodeOcorrer
     */
    public void setDatasEmQuePodeOcorrer(ArrayList<Data> datasEmQuePodeOcorrer) {
        this.datasEmQuePodeOcorrer = datasEmQuePodeOcorrer;
    }
    /**
     * Retorna a programacao diaria
     * @return 
     */
    public ArrayList<String> getProgramacaoDiaria() {
        return programacaoDiaria;
    }
    /**
     * Define a programacao diaria
     * @param programacaoDiaria 
     */
    public void setProgramacaoDiaria(ArrayList<String> programacaoDiaria) {
        this.programacaoDiaria = programacaoDiaria;
    }
    /**
     * Metodo equals
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ProgramaViagem other = (ProgramaViagem) obj;
        return this.codigoPrograma == other.codigoPrograma
                && this.descricao.equals(other.descricao)
                && this.datasEmQuePodeOcorrer.equals(other.datasEmQuePodeOcorrer)
                && this.programacaoDiaria.equals(other.programacaoDiaria);
    }
    /**
     * Retorna o programa viagem em string
     * @return 
     */
    @Override
    public String toString() {
        return "ProgramaViagem{" + "codigoPrograma=" + codigoPrograma + ", descricao=" + descricao + ", datasEmQuePodeOcorrer=" + datasEmQuePodeOcorrer + ", programacaoDiaria=" + programacaoDiaria + '}';
    }
    /**
     * Adiciona datas ao programa
     * @param d 
     */
    public void adicionarData(Data d){
        datasEmQuePodeOcorrer.add(d);
    }
    /**
     * Adiciona eventos ao programa
     * @param evento 
     */
    public void adicionarEvento(String evento){
        programacaoDiaria.add(evento);
    }
}
