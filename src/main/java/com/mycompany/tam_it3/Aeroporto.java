/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import java.io.Serializable;


/**
 *
 * @author Catarina
 */
public class Aeroporto implements Serializable {

    private int codigoAeroporto;
    private String endereco;
    private String paginaWeb;

    private static final String STRING_PREDEFINIDO = "Nao definido";
    private static final int INT_PREDEFINIDO = 0;

    /**
     * Construtor vazio
     */
    public Aeroporto() {
        this.codigoAeroporto = INT_PREDEFINIDO;
        this.endereco = STRING_PREDEFINIDO;
        this.paginaWeb = STRING_PREDEFINIDO;
    }
    /**
     * Construtor com os parametros:
     * @param codigoAeroporto
     * @param endereco
     * @param paginaWeb
     */
    public Aeroporto(int codigoAeroporto, String endereco, String paginaWeb) {
        this.codigoAeroporto = codigoAeroporto;
        this.endereco = endereco;
        this.paginaWeb = paginaWeb;
    }
    /**
     * Método cópia 
     * @param a
     */
    public Aeroporto(Aeroporto a) {
        this.codigoAeroporto = a.codigoAeroporto;
        this.endereco = a.endereco;
        this.paginaWeb = a.paginaWeb;
    }
    /**
     * Retorna o codigo do aeroporto
     * @return 
     */
    public int getCodigoAeroporto() {
        return codigoAeroporto;
    }
    /**
     * Define ao valor do codigo do aeroporto
     * @param codigoAeroporto 
     */
    public void setCodigoAeroporto(int codigoAeroporto) {
        this.codigoAeroporto = codigoAeroporto;
    }
    /**
     * Retorna o endereco do aeroporto
     * @return 
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * Define o endereço do aeroporto
     * @param endereco 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * Retrona a pagina web do aeroporto
     * @return 
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }
    /**
     * Define a pagina web do aeroporto
     * @param paginaWeb 
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    /**
     * Metodo que compara 2 aeroportos entre si
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
        final Aeroporto other = (Aeroporto) obj;
        return this.codigoAeroporto == other.codigoAeroporto
                && this.endereco.equalsIgnoreCase(other.endereco)
                && this.paginaWeb.equalsIgnoreCase(other.paginaWeb);
    }
    /**
     * Metodo que retorna o aeroporto em String
     * @return 
     */
    @Override
    public String toString() {
        return "Aeroporto{" + "codigoAeroporto=" + codigoAeroporto + ", endereco=" + endereco + ", paginaWeb=" + paginaWeb + '}';
    }
}
