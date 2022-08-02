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
public class Voo implements Serializable {

    private int codigoVoo;
    private String companhiaAerea;
    private int qtdTotalLugares;
    private int qtdLugaresDisponiveis;
    private Aeroporto aeroportoSaida;
    private Aeroporto aeroportoChegada;
    private DataHora dataHoraPartida;
    private int precobilhete;

    private static final String STRING_PREDEFINIDO = "Nao definido";
    private static final int INT_PREDEFINIDO = 0;
    private static final int PRECOBILHETE_OMISSAO = 150;

    /**
     * Construtor vazio
     */
    public Voo() {
        this.codigoVoo = INT_PREDEFINIDO;
        this.companhiaAerea = STRING_PREDEFINIDO;
        this.qtdTotalLugares = INT_PREDEFINIDO;
        this.qtdLugaresDisponiveis = INT_PREDEFINIDO;
        this.aeroportoSaida = new Aeroporto();
        this.aeroportoChegada = new Aeroporto();
        this.dataHoraPartida = new DataHora();
        this.precobilhete = PRECOBILHETE_OMISSAO;
    }

    /**
     * Construtor com os parametros:
     *
     * @param codigoVoo
     * @param companhiaAerea
     * @param qtdTotalLugares
     * @param aeroportoSaida
     * @param aeroportoChegada
     * @param dataHoraPartida
     */
    public Voo(int codigoVoo, String companhiaAerea, int qtdTotalLugares, Aeroporto aeroportoSaida, Aeroporto aeroportoChegada, DataHora dataHoraPartida) {
        this.codigoVoo = codigoVoo;
        this.companhiaAerea = companhiaAerea;
        this.qtdTotalLugares = qtdTotalLugares;
        this.qtdLugaresDisponiveis = qtdTotalLugares;
        this.aeroportoSaida = new Aeroporto(aeroportoSaida);
        this.aeroportoChegada = new Aeroporto(aeroportoChegada);
        this.dataHoraPartida = new DataHora(dataHoraPartida);
    }

    /**
     * Construtor com os parametros:
     *
     * @param codigoVoo
     * @param companhiaAerea
     * @param qtdTotalLugares
     * @param aeroportoSaida
     * @param aeroportoChegada
     * @param dataHoraPartida
     * @param precobilhete
     */
    public Voo(int codigoVoo, String companhiaAerea, int qtdTotalLugares, Aeroporto aeroportoSaida, Aeroporto aeroportoChegada, DataHora dataHoraPartida, int precobilhete) {
        this.codigoVoo = codigoVoo;
        this.companhiaAerea = companhiaAerea;
        this.qtdTotalLugares = qtdTotalLugares;
        this.qtdLugaresDisponiveis = qtdTotalLugares;
        this.aeroportoSaida = new Aeroporto(aeroportoSaida);
        this.aeroportoChegada = new Aeroporto(aeroportoChegada);
        this.dataHoraPartida = new DataHora(dataHoraPartida);
        this.precobilhete = precobilhete;
    }

    /**
     * Metodo copia
     *
     * @param iv
     */
    public Voo(Voo iv) {
        this.codigoVoo = iv.codigoVoo;
        this.companhiaAerea = iv.companhiaAerea;
        this.qtdTotalLugares = iv.qtdTotalLugares;
        this.qtdLugaresDisponiveis = iv.qtdLugaresDisponiveis;
        this.aeroportoSaida = new Aeroporto(iv.aeroportoSaida);
        this.aeroportoChegada = new Aeroporto(iv.aeroportoChegada);
        this.dataHoraPartida = new DataHora(iv.dataHoraPartida);
        this.precobilhete = iv.precobilhete;
    }

    /**
     * Retorna o codigo do voo
     *
     * @return
     */
    public int getCodigoVoo() {
        return codigoVoo;
    }

    /**
     * Define o codigo do voo
     *
     * @param codigoVoo
     */
    public void setCodigoVoo(int codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    /**
     * Retorna a companhia aerea
     *
     * @return
     */
    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    /**
     * Define a companhia aerea
     *
     * @param companhiaAerea
     */
    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    /**
     * Retorna a quantidade de lugares
     *
     * @return
     */
    public int getQtdTotalLugares() {
        return qtdTotalLugares;
    }

    /**
     * Retorna o preco do bilhete
     *
     * @return
     */
    public int getPrecobilhete() {
        return precobilhete;
    }

    /**
     * Define a quantidade de lugares
     *
     * @param qtdTotalLugares
     */
    public void setQtdTotalLugares(int qtdTotalLugares) {
        this.qtdTotalLugares = qtdTotalLugares;
    }

    /**
     * Retorna a quantidade de lugares disponiveis
     *
     * @return
     */
    public int getQtdLugaresDisponiveis() {
        return qtdLugaresDisponiveis;
    }

    /**
     * Define a quantidade de lugares disponiveis
     *
     * @param qtdLugaresDisponiveis
     */
    public void setQtdLugaresDisponiveis(int qtdLugaresDisponiveis) {
        this.qtdLugaresDisponiveis = qtdLugaresDisponiveis;
    }

    /**
     * Retorna o aeroporto de saida
     *
     * @return
     */
    public Aeroporto getAeroportoSaida() {
        return new Aeroporto(aeroportoSaida);
    }

    /**
     * Define o aeroporto de saida
     *
     * @param aeroportoSaida
     */
    public void setAeroportoSaida(Aeroporto aeroportoSaida) {
        this.aeroportoSaida = new Aeroporto(aeroportoSaida);
    }

    /**
     * Retorna o aeroporto de chegada
     *
     * @return
     */
    public Aeroporto getAeroportoChegada() {
        return new Aeroporto(aeroportoChegada);
    }

    /**
     * Define o aeroporto de chegada
     *
     * @param aeroportoChegada
     */
    public void setAeroportoChegada(Aeroporto aeroportoChegada) {
        this.aeroportoChegada = new Aeroporto(aeroportoChegada);
    }

    /**
     * Define o preco do bilhete
     *
     * @param precobilhete
     */
    public void setPrecobilhete(int precobilhete) {
        this.precobilhete = precobilhete;
    }

    /**
     * Retorna data e hora de partida
     *
     * @return
     */
    public DataHora getDataHoraPartida() {
        return new DataHora(dataHoraPartida);
    }

    /**
     * Define a data e hora de partida
     *
     * @param dataHoraPartida
     */
    public void setDataHoraPartida(DataHora dataHoraPartida) {
        this.dataHoraPartida = new DataHora(dataHoraPartida);
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
        final Voo other = (Voo) obj;
        return this.codigoVoo == other.codigoVoo
                && this.qtdTotalLugares == other.qtdTotalLugares
                && this.qtdLugaresDisponiveis == other.qtdLugaresDisponiveis
                && this.companhiaAerea.equals(other.companhiaAerea)
                && this.aeroportoSaida.equals(other.aeroportoSaida)
                && this.aeroportoChegada.equals(other.aeroportoChegada)
                && this.dataHoraPartida.equals(other.dataHoraPartida)
                && this.precobilhete == other.precobilhete;
    }
    /**
     * Retorna a informacao do Voo em string
     * @return 
     */
    @Override
    public String toString() {
        return "InfoVoo{" + "codigoVoo=" + codigoVoo + ", companhiaAerea=" + companhiaAerea + ", qtdTotalLugares=" + qtdTotalLugares + ", qtdLugaresDisponiveis=" + qtdLugaresDisponiveis + ", Preço do bilhete=" + precobilhete + ", aeroportoSaida=" + aeroportoSaida + ", aeroportoChegada=" + aeroportoChegada + ", dataHoraPartida=" + dataHoraPartida + '}';
    }

    /**
     * Atualiza os lugares disponiveis
     * @param update
     */
    public void atualizarLugaresDisponiveis(int update) {
        qtdLugaresDisponiveis += update;
    }

    /**
     *
     * @param de
     * @param para
     * @param di
     * @param df
     * @return
     */
    public boolean obedeceCondicoes(String de, String para, Data di, Data df) {
        return aeroportoSaida.getEndereco().equalsIgnoreCase(de)
                && aeroportoChegada.getEndereco().equalsIgnoreCase(para)
                && dataHoraPartida.isMaior(di)
                && !dataHoraPartida.isMaior(df);
    }
}
