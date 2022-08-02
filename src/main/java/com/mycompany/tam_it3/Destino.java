/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Catarina
 * 
 * Um destino é caracterizado por um nome de uma cidade, país e continente.
 */
public class Destino implements Serializable{
    private String cidade;
    private String pais;
    private String continente;
    /**
     * 
     */
    public static final String PREDEFINIDO = "Nao definido";

    /**
     * Construtor vazio
     */
    public Destino() {
        this.cidade = PREDEFINIDO;
        this.pais = PREDEFINIDO;
        this.continente = PREDEFINIDO;
    }
    /**
     * Construtor com os parametros:
     * @param cidade
     * @param pais 
     * @param continente 
     */
    public Destino(String cidade, String pais, String continente) {
        this.cidade = cidade;
        this.pais = pais;
        this.continente = continente;
    }
    
    /**
     * Metodo copia
     * @param d
     */
    public Destino(Destino d) {
        this.cidade = d.cidade;
        this.pais = d.pais;
        this.continente = d.continente;
    }
    /**
     * Retorna a cidade do destino
     * @return 
     */
    public String getCidade() {
        return cidade;
    }
    /**
     * Retorna o Pais do destino
     * @return 
     */
    public String getPais() {
        return pais;
    }
    /**
     * Retorna o continente do destino
     * @return 
     */
    public String getContinente() {
        return continente;
    }

    /**
     * Define a cidade do destino
     * @param cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    /**
     * Define o pais do destino
     * @param pais 
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    /**
     * Define o continente do destino
     * @param continente 
     */
    public void setContinente(String continente) {
        this.continente = continente;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Destino other = (Destino) obj;
        return this.cidade.equals(other.cidade)
                && this.pais.equals(other.pais)
                && this.continente.equals(other.continente);
    }
    /**
     * Retorna o destino em string
     * @return 
     */
    @Override
    public String toString() {
        return "Destino{" + "cidade=" + cidade + ", pais=" + pais + ", continente=" + continente + '}';
    }
}
