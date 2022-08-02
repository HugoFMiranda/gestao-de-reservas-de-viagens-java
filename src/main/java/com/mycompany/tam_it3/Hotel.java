/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Catarina
 *
 * Em relação à informação do hotel, a aplicação necessita, por enquanto, de
 * conhecer o código do hotel, a sigla, a sua categoria e a localidade.
 */
public class Hotel implements ICategoriaEservico, Serializable {

    private int codigo;
    private String sigla;
    private String categoria;
    private String localidade;
    private String paginaWeb;
    private boolean transfer;
    private int preconoite;
    
    private static ArrayList<String> catlist = new ArrayList<>(); 
    

    private static int nrHoteis = 0;
    private static int PRECONOITE_OMISSAO = 150;
    private static final String STRING_PREDEFINIDO = "Nao definido";

    /**
     * Construtor vazio
     */
    public Hotel() {
        nrHoteis++;
        this.codigo = nrHoteis;
        this.sigla = STRING_PREDEFINIDO;
        this.categoria = CATEGORIA_POR_OMISSAO;
        this.localidade = STRING_PREDEFINIDO;
        this.paginaWeb = STRING_PREDEFINIDO;
        this.preconoite = PRECONOITE_OMISSAO;
        this.transfer = SERVICO_POR_OMISSAO;
    }
    /**
     * Construtor com os parametros:
     * @param sigla
     * @param categoria
     * @param localidade
     * @param paginaWeb
     * @throws ExceptionCatHotel 
     */
    public Hotel(String sigla, String categoria, String localidade, String paginaWeb)throws ExceptionCatHotel{
        nrHoteis++;
        this.codigo = nrHoteis;
        this.sigla = sigla;
        try{
            if (catlist.contains(categoria) == false)
            {
                throw new ExceptionCatHotel();
            }else{
                this.categoria = categoria;
            }
        } catch(ExceptionCatHotel e){
            System.out.println(e.getMessage());
            System.out.println("Irá ser usado o valor default como categoria do hotel.");
            this.categoria = CATEGORIA_POR_OMISSAO;
        }
        this.localidade = localidade;
        this.paginaWeb = paginaWeb;
    }
    /**
     * Construtor com os parametros:
     * @param sigla
     * @param categoria
     * @param localidade
     * @param paginaWeb
     * @param preconoite
     * @throws ExceptionHotel 
     */
    public Hotel(String sigla, String categoria, String localidade, String paginaWeb, int preconoite) throws ExceptionHotel{
        nrHoteis++;
        this.codigo = nrHoteis;
        this.sigla = sigla;
        this.localidade = localidade;
        this.paginaWeb = paginaWeb;
       try{
            if (catlist.contains(categoria) == false)
            {
                throw new ExceptionCatHotel();
            }else{
                this.categoria = categoria;
            }
            if (preconoite < 0)
            {
               throw new ExceptionHotel(); 
            }else{
                this.preconoite = preconoite;
            }
        } catch(ExceptionHotel e1){
            System.out.println(e1.getMessage());
            System.out.println("Irá ser usado o valor default como preço do quarto.");
            this.preconoite = PRECONOITE_OMISSAO;
        } catch(ExceptionCatHotel e2){
            System.out.println(e2.getMessage());
            System.out.println("Irá ser usado o valor default como categoria do hotel.");
            this.categoria = CATEGORIA_POR_OMISSAO;
        }
        
    }
    /**
     * Construtor com os parametros:
     * @param sigla
     * @param categoria
     * @param localidade
     * @param paginaWeb
     * @param preconoite
     * @param transfer
     * @throws ExceptionHotel
     * @throws ExceptionCatHotel 
     */
    public Hotel(String sigla, String categoria, String localidade, String paginaWeb, int preconoite, boolean transfer) throws ExceptionHotel,ExceptionCatHotel{
        nrHoteis++;
        this.codigo = nrHoteis;
        this.sigla = sigla;
        this.localidade = localidade;
        this.paginaWeb = paginaWeb;
        try{
            if (catlist.contains(categoria) == false)
            {
                throw new ExceptionCatHotel();
            }else{
                this.categoria = categoria;
            }
            if (preconoite < 0)
            {
               throw new ExceptionHotel(); 
            }else{
                this.preconoite = preconoite;
            }
        } catch(ExceptionHotel e1){
            System.out.println(e1.getMessage());
            System.out.println("Irá ser usado o valor default como preço do quarto.");
            this.preconoite = PRECONOITE_OMISSAO;
        } catch(ExceptionCatHotel e2){
            System.out.println(e2.getMessage());
            System.out.println("Irá ser usado o valor default como categoria do hotel.");
            this.categoria = CATEGORIA_POR_OMISSAO;
        }
        this.transfer = transfer;
    }
    /**
     * Metodo de copia
     * @param h 
     */
    public Hotel(Hotel h) {
        nrHoteis++;
        this.codigo = nrHoteis;
        this.sigla = h.sigla;
        this.categoria = h.categoria;
        this.localidade = h.localidade;
        this.paginaWeb = h.paginaWeb;
        this.preconoite = h.preconoite;
    }

    /**
     * Retorna o codigo do hotel
     * @return
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Retorna a sigla do hotel
     * @return 
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Retorna a categoria do hotel
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Retorna a localidade do hotel
     * @return
     */
    public String getLocalidade() {
        return localidade;
    }
    /**
     * Retorna o preco de um quarto por noite do hotel
     * @return 
     */
    public int getPreconoite() {
        return preconoite;
    }

    /**
     * Retorna a lista de categorias possiveis em um hotel
     * @return
     */
    public ArrayList<String> getCatlist() {
        return catlist;
    }

    /**
     * Define a arrayList das categorias possives em um hotel
     * @param catlist
     */
    public void setCatlist(ArrayList<String> catlist) {
        Hotel.catlist = catlist;
    }
    /**
     * Insere na arrayList todas as categorias possives em um hotel
     */
    public static void padraocatlist(){
        catlist.add(UMA_ESTRELA);
        catlist.add(DUAS_ESTRELAS);
        catlist.add(TRES_ESTRELAS);
        catlist.add(QUATRO_ESTRELAS);
        catlist.add(CINCO_ESTRELAS);
    }
    /**
     * Define o numero de hoteis
     * @param nrHoteis 
     */
    public static void setNrHoteis(int nrHoteis) {
        Hotel.nrHoteis = nrHoteis;
    }

    /**
     * Define se o hotel tem ou nao servico transfer
     * @param transfer
     */
    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }
    /**
     * Retorna verdadeiro se o hotel tiver servico transfer
     * @return 
     */
    public boolean isTransfer() {
        return transfer;
    }

    /**
     * Retorna o numero de hoteis
     * @return
     */
    public static int getNrHoteis() {
        return nrHoteis;
    }
    /**
     * Retorna a pagina web do hotel
     * @return 
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Retorna a categoria de uma estrela
     * @return
     */
    public static String getUMA_ESTRELA() {
        return UMA_ESTRELA;
    }

    /**
     * Retorna a categoria de duas estrelas
     * @return
     */
    public static String getDUAS_ESTRELAS() {
        return DUAS_ESTRELAS;
    }

    /**
     * Retorna a categoria de tres estrelas
     * @return
     */
    public static String getTRES_ESTRELAS() {
        return TRES_ESTRELAS;
    }

    /**
     * Retorna a categoria de quatro estrelas
     * @return
     */
    public static String getQUATRO_ESTRELAS() {
        return QUATRO_ESTRELAS;
    }

    /**
     * Retorna a categoria de cinco estrelas
     * @return
     */
    public static String getCINCO_ESTRELAS() {
        return CINCO_ESTRELAS;
    }

    /**
     * Define o codigo do hotel
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * define a sigla do hotel
     * @param sigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    /**
     * Define a categoria do hotel
     * @param categoria 
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /**
     * Define a localidade do hotel
     * @param localidade 
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    /**
     * Define o preco do quarto por noite
     * @param preconoite 
     */
    public void setPreconoite(int preconoite) {
        try{
            if (preconoite > 0)
            {
               throw new ExceptionHotel(); 
            }else{
                this.preconoite = preconoite;
            }
        } catch(ExceptionHotel e){
            System.out.println(e.getMessage());
            System.out.println("Irá ser usado o valor anterior.");
        }     
    }
    /**
     * Define a pagina web do hotel
     * @param paginaWeb 
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
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
        final Hotel other = (Hotel) obj;
        return this.codigo == other.codigo
                && this.sigla.equals(other.sigla)
                && this.categoria.equals(other.categoria)
                && this.localidade.equals(other.localidade)
                && this.paginaWeb.equals(other.paginaWeb)
                && this.preconoite == other.preconoite
                && this.transfer == other.transfer;
    }
    /**
     * Retorna o hotel em string
     * @return 
     */
    @Override
    public String toString() {
        String t = "Não";
        if (transfer == true){t = "Sim";}else{t = "Não";}
        return "\nHotel{" + "codigo=" + codigo + ", sigla=" + sigla + ", categoria=" + categoria + ", localidade=" + localidade + ", Preço por noite= " + preconoite + "€, paginaWeb=" + paginaWeb + ", Transfer:" + t + '}';
    }
    /**
     * Retorna true se o hotel tiver servico transfer
     * @return 
     */
    @Override
    public boolean oferecerTransfer() {
        if (this.transfer == true)
        {
            return true;
        }
        return false;
    }

}
