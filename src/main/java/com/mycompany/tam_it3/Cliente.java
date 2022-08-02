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
 *
 * Relativamente aos clientes, a agência pretende saber o código único, o nome,
 * data de nascimento, o número do cartão de cidadão, o número de contribuinte,
 * o número do passaporte, um contacto telefónico e um email.
 */
public class Cliente implements Comparable<Cliente>, Serializable {

    /**
     *
     * @return
     */
    public static int getNrClientes() {
        return nrClientes;
    }

    private int codigoUnico;
    private String nome;
    private Data dataNascimento;
    private String cartaoCidadao;
    private String nif;
    private String nrPassaporte;
    private String telefone;
    private String email;

    private static int nrClientes = 0;

    private static final String NOME_PREDEFINIDO = "Nao definido";
    private static final String CC_PREDEFINIDO = "00000000";
    private static final String NIF_PREDEFINIDO = "000000000";
    private static final String NP_PREDEFINIDO = "000000000";
    private static final String TEL_PREDEFINIDO = "000000000";
    private static final String EMAIL_PREDEFINIDO = "a@b.c";

    /**
     * Construtor vazio
     */
    public Cliente() {
        nrClientes++;
        this.codigoUnico = nrClientes;
        this.nome = NOME_PREDEFINIDO;
        this.dataNascimento = new Data();
        this.cartaoCidadao = CC_PREDEFINIDO;
        this.nif = NIF_PREDEFINIDO;
        this.nrPassaporte = NP_PREDEFINIDO;
        this.telefone = TEL_PREDEFINIDO;
        this.email = EMAIL_PREDEFINIDO;
    }

    /**
     * 
     * Construtor com os parametros:
     *
     * @param nome
     * @param dataNascimento
     * @param cartaoCidadao
     * @param nif
     * @param nrPassaporte
     * @param telefone
     * @param email
     * @throws ExceptionClientes
     */
    public Cliente(String nome, Data dataNascimento, String cartaoCidadao, String nif, String nrPassaporte, String telefone, String email) throws ExceptionClientes {
        nrClientes++;
        this.codigoUnico = nrClientes;
        try
        {
            if (nome.matches("[a-zA-Z\\s\'\"]+") == false)
            {
                throw new ExceptionClientes();
            } else
            {
                this.nome = nome;
            }

        } catch (ExceptionClientes e)
        {
            System.out.println(e.getMessage());
            System.out.println("Será usado o valor default para o nome");
            this.nome = NOME_PREDEFINIDO;
        }
        this.dataNascimento = new Data(dataNascimento);
        this.cartaoCidadao = cartaoCidadao;
        this.nif = nif;
        this.nrPassaporte = nrPassaporte;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * Metodo de copia
     *
     * @param c
     */
    public Cliente(Cliente c) {
        nrClientes++;
        this.codigoUnico = nrClientes;
        this.nome = c.nome;
        this.dataNascimento = new Data(c.dataNascimento);
        this.cartaoCidadao = c.cartaoCidadao;
        this.nif = c.nif;
        this.nrPassaporte = c.nrPassaporte;
        this.telefone = c.telefone;
        this.email = c.email;
    }

    /**
     * Retorna o codigo unico do cliente
     *
     * @return
     */
    public int getCodigoUnico() {
        return codigoUnico;
    }

    /**
     * Retorna o nome do cliente
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a data de nascimento do cliente
     *
     * @return
     */
    public Data getDataNascimento() {
        return new Data(dataNascimento);
    }
    /**
     * Retorna o cartao de cidadao do cliente
     * @return 
     */
    public String getCartaoCidadao() {
        return cartaoCidadao;
    }
    /**
     * Retorna o Nif do cliente
     * @return 
     */
    public String getNif() {
        return nif;
    }

    /**
     * Retorna o numero de passaporte do cliente
     * @return
     */
    public String getNrPassaporte() {
        return nrPassaporte;
    }

    /**
     * Retorna o numero de telefone do cliente
     * @return
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * Retorna o email do cliente
     * @return 
     */
    public String getEmail() {
        return email;
    }
    /**
     * Define o nome do cliente com as esceções 
     * @param nome 
     */
    public void setNome(String nome) {
        try
        {
            if (nome.matches("[a-zA-Z\\s\'\"]+") == false)
            {
                throw new ExceptionClientes();
            } else
            {
                this.nome = nome;
            }

        } catch (ExceptionClientes e)
        {
            System.out.println(e.getMessage());
            System.out.println("Irá ser mantido o nome anterior.");
        }

    }
    /**
     * Define a data de nascimento do cliente
     * @param dataNascimento 
     */
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = new Data(dataNascimento);
    }

    /**
     * Define o cartao de cidadao do cliente
     * @param cartaoCidadao
     */
    public void setCartaoCidadao(String cartaoCidadao) {
        this.cartaoCidadao = cartaoCidadao;
    }
    /**
     * Define o Nif do cliente
     * @param nif 
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Define o numero de passaporte do cliente
     * @param nrPassaporte
     */
    public void setNrPassaporte(String nrPassaporte) {
        this.nrPassaporte = nrPassaporte;
    }

    /**
     * Define o numero de telefone do cliente
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    /**
     * Define o email do cliente
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
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
        final Cliente other = (Cliente) obj;
        return this.cartaoCidadao.equals(other.cartaoCidadao)
                && this.codigoUnico == other.codigoUnico
                && this.dataNascimento.equals(other.dataNascimento)
                && this.email.equals(other.email)
                && this.nif.equals(other.nif)
                && this.nome.equals(other.nome)
                && this.nrPassaporte.equals(other.nrPassaporte)
                && this.telefone.equals(other.telefone);

    }
    /**
     * Retorna o cliente em string
     * @return 
     */
    @Override
    public String toString() {
        return "\nCliente{" + "codigoUnico=" + codigoUnico + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cartaoCidadao=" + cartaoCidadao + ", nif=" + nif + ", nrPassaporte=" + nrPassaporte + ", telefone=" + telefone + ", email=" + email + '}';
    }

    /**
     * Retorna a idade do cliente
     * @param hoje
     * @return
     */
    public int getIdade(Data hoje) {
        if (dataNascimento.getMes() < hoje.getMes() || (dataNascimento.getMes() == hoje.getMes() && dataNascimento.getDia() < hoje.getDia()))
        {
            return hoje.getAno() - dataNascimento.getAno();
        } else
        {
            return hoje.getAno() - dataNascimento.getAno() - 1;
        }
    }
    /**
     * Compara o nome do cliente com outro cliente
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Cliente o) {
        return this.getNome().compareToIgnoreCase(o.getNome());

    }
}
