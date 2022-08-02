/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Catarina
 */
public class Agencia implements Serializable{

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Hotel> hoteis = new ArrayList<>();
    private ArrayList<ReservaViagem> reservas = new ArrayList<>();
    private ArrayList<ProgramaViagem> programas = new ArrayList<>();
    private ArrayList<Destino> destinos = new ArrayList<>();
    private ArrayList<Voo> voos = new ArrayList<>();

    /**
     * Construtor vazio da agencia
     */
    public Agencia() {
        this.clientes = new ArrayList<>();
        this.hoteis = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.programas = new ArrayList<>();
        this.destinos = new ArrayList<>();
        this.voos = new ArrayList<>();
    }

    /**
     * Adiciona clientes a array list com os parametros:
     * @param nome
     * @param dataNascimento
     * @param cartaoCidadao
     * @param nif
     * @param nrPassaporte
     * @param telefone
     * @param email
     * @throws ExceptionClientes
     */
    public void adicionarCliente(String nome, Data dataNascimento, String cartaoCidadao, String nif, String nrPassaporte, String telefone, String email) throws ExceptionClientes {
        clientes.add(new Cliente(nome, dataNascimento, cartaoCidadao, nif, nrPassaporte, telefone, email));
    }

    /**
     * Adiciona Hoteis a array list com os parametros:
     * @param sigla
     * @param categoria
     * @param localidade
     * @param paginaWeb
     * @throws ExceptionCatHotel
     */
    public void adicionarHotel(String sigla, String categoria, String localidade, String paginaWeb) throws ExceptionCatHotel {
        hoteis.add(new Hotel(sigla, categoria, localidade, paginaWeb));
    }

    /**
     *  Adiciona Hoteis a array list com os parametros:
     * @param sigla
     * @param categoria
     * @param localidade
     * @param paginaWeb
     * @param preconoite
     * @param transfer
     * @throws ExceptionHotel
     * @throws ExceptionCatHotel
     */
    public void adicionarHotel(String sigla, String categoria, String localidade, String paginaWeb, int preconoite,boolean transfer) throws ExceptionHotel,ExceptionCatHotel {
        hoteis.add(new Hotel(sigla, categoria, localidade, paginaWeb, preconoite,transfer));
    }

    /**
     * Adiciona uma reserva do tipo Programa sem voo
     *
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
    public void adicionarReservaPrograma(int nrPessoas, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente,int taxa, ProgramaViagem programa, ArrayList<Hotel> alojamentosDiarios, Data dataInicio) {
        reservas.add(new ReservaPrograma(nrPessoas, dataReserva, dataPartida, dataRegresso, cliente,taxa, programa, alojamentosDiarios, dataInicio));
    }

    /**
     * Adiciona uma reserva do tipo Programa com voo
     *
     * @param nrPessoas
     * @param vooIda
     * @param vooRegresso
     * @param dataReserva
     * @param dataPartida
     * @param dataRegresso
     * @param cliente
     * @param taxa
     * @param programa
     * @param alojamentosDiarios
     * @param dataInicio
     */
    public void adicionarReservaProgramaVoo(int nrPessoas, Voo vooIda, Voo vooRegresso, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente,int taxa, ProgramaViagem programa, ArrayList<Hotel> alojamentosDiarios, Data dataInicio) {
        reservas.add(new ReservaProgramaVoo(nrPessoas, vooIda.getCodigoVoo(), vooRegresso.getCodigoVoo(), dataReserva, dataPartida, dataRegresso, cliente,taxa, programa, alojamentosDiarios, dataInicio));
        vooIda.atualizarLugaresDisponiveis(-nrPessoas);
        vooRegresso.atualizarLugaresDisponiveis(-nrPessoas);
    }

    /**
     * Adiciona uma reserva do tipo Singualar sem voo
     *
     * @param nrPessoas
     * @param dataReserva
     * @param dataPartida
     * @param dataRegresso
     * @param cliente
     * @param taxa
     * @param destino
     * @param alojamento
     */
    public void adicionarReservaSingular(int nrPessoas, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente,int taxa, Destino destino, Hotel alojamento) {
        reservas.add(new ReservaSingular(nrPessoas, dataReserva, dataPartida, dataRegresso, cliente, taxa,destino, alojamento));
    }

    /**
     * Adiciona uma reserva do tipo Singualar com voo
     *
     * @param nrPessoas
     * @param vooIda
     * @param vooRegresso
     * @param dataReserva
     * @param dataPartida
     * @param dataRegresso
     * @param cliente
     * @param taxa
     * @param destino
     * @param alojamento
     */
    public void adicionarReservaSingularVoo(int nrPessoas, Voo vooIda, Voo vooRegresso, Data dataReserva, Data dataPartida, Data dataRegresso, Cliente cliente,int taxa, Destino destino, Hotel alojamento) {
        reservas.add(new ReservaSingularVoo(nrPessoas, vooIda.getCodigoVoo(), vooRegresso.getCodigoVoo(), dataReserva, dataPartida, dataRegresso, cliente,taxa, destino, alojamento));
        vooIda.atualizarLugaresDisponiveis(-nrPessoas);
        vooRegresso.atualizarLugaresDisponiveis(-nrPessoas);
    }

    /**
     * Adiciona um programa a agencia
     * @param codigoPrograma
     * @param descricao
     */
    public void adicionarPrograma(int codigoPrograma, String descricao) {
        programas.add(new ProgramaViagem(codigoPrograma, descricao));
    }

    /**
     * Adiciona um programa a agencia
     * @param pv
     */
    public void adicionarPrograma(ProgramaViagem pv) {
        programas.add(new ProgramaViagem(pv));
    }

    /**
     *  Adiciona datas ao programa
     * @param codigoPrograma
     * @param d
     */
    public void adicionarDatasPrograma(int codigoPrograma, Data d) {
        for (ProgramaViagem pv : programas)
        {
            if (pv.getCodigoPrograma() == codigoPrograma)
            {
                pv.adicionarData(d);
            }
        }
    }

    /**
     * Adiciona eventos ao programa
     * @param codigoPrograma
     * @param evento
     */
    public void adicionarEventosPrograma(int codigoPrograma, String evento) {
        for (ProgramaViagem pv : programas)
        {
            if (pv.getCodigoPrograma() == codigoPrograma)
            {
                pv.adicionarEvento(evento);
            }
        }
    }

    /**
     * Retorna a arrayList dos clientes
     * @return
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Retorna a arrayList dos Hoteis
     * @return
     */
    public ArrayList<Hotel> getHoteis() {
        return hoteis;
    }

    /**
     * Retorna a arrayList das Reservas
     * @return
     */
    public ArrayList<ReservaViagem> getReservas() {
        return reservas;
    }

    /**
     * Retorna a arrayList dos Programas
     * @return
     */
    public ArrayList<ProgramaViagem> getProgramas() {
        return programas;
    }

    /**
     * Retorna a arrayList dos Destinos
     * @return
     */
    public ArrayList<Destino> getDestinos() {
        return destinos;
    }

    /**
     * Retorna a arrayList dos Voos
     * @return
     */
    public ArrayList<Voo> getVoos() {
        return voos;
    }

    /**
     * Adiciona Destinos a arrayList dos Destinos
     * @param cidade
     * @param pais
     * @param continente
     */
    public void adicionarDestino(String cidade, String pais, String continente) {
        destinos.add(new Destino(cidade, pais, continente));
    }

    /**
     * Adiciona Voos a arrayList dos Voos
     * @param codigoVoo
     * @param companhiaAerea
     * @param qtdTotalLugares
     * @param aeroportoSaida
     * @param aeroportoChegada
     * @param dataHoraPartida
     * @param prec
     */
    public void adicionarVoo(int codigoVoo, String companhiaAerea, int qtdTotalLugares, Aeroporto aeroportoSaida, Aeroporto aeroportoChegada, DataHora dataHoraPartida, int prec) {
        voos.add(new Voo(codigoVoo, companhiaAerea, qtdTotalLugares, aeroportoSaida, aeroportoChegada, dataHoraPartida,prec));
    }

    /**
     * Elimina uma reserva recebendo o parametro:
     * @param codigoReserva
     */
    public void eliminarReserva(int codigoReserva) {
        for (ReservaViagem rv : reservas)
        {
            if (rv.getCodigoUnico() == codigoReserva)
            {
                reservas.remove(rv);
            }
        }
    }

    /**
     * Elimina uma reserva recebendo o parametro:
     * @param rv
     */
    public void eliminarReserva(ReservaViagem rv) {
        reservas.remove(rv);
    }

    /**
     * Altera o voo de ida recebendo os parametros:
     * @param codigoReserva
     * @param voo
     * @return
     */
    public boolean alterarVooIda(int codigoReserva, Voo voo) {
        boolean sair = false;
        for (int i = 0; i < reservas.size() && sair == false; i++)
        {
            ReservaViagem rv = reservas.get(i);
            if (rv.getCodigoUnico() == codigoReserva)
            {
                if (rv instanceof ReservaSingularVoo)
                {
                    ReservaSingularVoo rsv = (ReservaSingularVoo) rv;

                    //Atualização de lugares de voo anterior e do voo atual
                    int cod = rsv.getCodVooIda();
                    Voo vAnterior = procurarVoo(cod);
                    vAnterior.atualizarLugaresDisponiveis(rsv.getNrPessoas());
                    voo.atualizarLugaresDisponiveis(rsv.getNrPessoas());
                    //Alterar o voo da reserva
                    rsv.setCodVooIda(voo.getCodigoVoo());
                } else if (rv instanceof ReservaProgramaVoo)
                {
                    ReservaProgramaVoo rpv = (ReservaProgramaVoo) rv;
                    //Atualização de lugares de voo anterior e do voo atual
                    int cod = rpv.getCodVooIda();
                    Voo vAnterior = procurarVoo(cod);
                    vAnterior.atualizarLugaresDisponiveis(rpv.getNrPessoas());
                    voo.atualizarLugaresDisponiveis(rpv.getNrPessoas());
                    //Alterar o voo da reserva
                    rpv.setCodVooIda(voo.getCodigoVoo());
                }
                sair = true;
            }
        }
        return sair;
    }

    /**
     * Altera o voo de regresso recebendo os parametros:
     * @param codigoReserva
     * @param voo
     * @return
     */
    public boolean alterarVooRegresso(int codigoReserva, Voo voo) {
        boolean sair = false;
        for (int i = 0; i < reservas.size() && sair == false; i++)
        {
            ReservaViagem rv = reservas.get(i);
            if (rv.getCodigoUnico() == codigoReserva)
            {
                if (rv instanceof ReservaSingularVoo)
                {
                    ReservaSingularVoo rsv = (ReservaSingularVoo) rv;

                    //Atualização de lugares de voo anterior e do voo atual
                    int cod = rsv.getCodVooRegresso();
                    Voo vAnterior = procurarVoo(cod);
                    vAnterior.atualizarLugaresDisponiveis(rsv.getNrPessoas());
                    voo.atualizarLugaresDisponiveis(-rsv.getNrPessoas());
                    //Alterar o voo da reserva
                    rsv.setCodVooRegresso(voo.getCodigoVoo());
                } else if (rv instanceof ReservaProgramaVoo)
                {
                    ReservaProgramaVoo rpv = (ReservaProgramaVoo) rv;

                    //Atualização de lugares de voo anterior e do voo atual
                    int cod = rpv.getCodVooRegresso();
                    Voo vAnterior = procurarVoo(cod);
                    vAnterior.atualizarLugaresDisponiveis(rpv.getNrPessoas());
                    voo.atualizarLugaresDisponiveis(-rpv.getNrPessoas());
                    //Alterar o voo da reserva
                    rpv.setCodVooRegresso(voo.getCodigoVoo());
                }
                sair = true;
            }
        }
        return sair;
    }

    /**
     * Retorna a lista de todos os clientes
     * @return
     */
    public String listarClientes() {
        String res = "\nCLIENTES:(" + clientes.size() + ")\n";
        for (Cliente c : clientes)
        {
            res += c + "\n";
        }
        return res;
    }

    /**
     * Retorna a lista de todos os clientes com reserva programa
     * @return
     */
    public String listarClientesComReservaPrograma() {
        ArrayList<Cliente> clientesPrograma = new ArrayList<>();
        for (ReservaViagem r : reservas)
        {
            if (r instanceof ReservaPrograma && !clientesPrograma.contains(r.getCliente()))
            {
                clientesPrograma.add(r.getCliente());
            }
        }
        String res = "\nCLIENTES COM RESERVA PROGRAMA:(" + clientesPrograma.size() + ")\n";
        for (Cliente c : clientesPrograma)
        {
            res += "Cliente: " + c.getNome() + " - email: " + c.getEmail() + "\n";
        }
        return res;
    }

    /**
     * Retorna a lista de todos os Hoteis
     * @return
     */
    public String listarHoteis() {
        String res = "\nHOTEIS:(" + hoteis.size() + ")\n";
        for (Hotel h : hoteis)
        {
            res += h + "\n";
        }
        return res;
    }

    /**
     * Retorna a lista de todas as reservas
     * @return
     */
    public String listarReservas() {
        String res = "\nRESERVAS:(" + reservas.size() + ")\n";
        for (ReservaViagem r : reservas)
        {
            res += r + "\n";
        }
        return res;
    }

    /**
     * Retorna a lista de todas as reservas com Voo
     * @return
     */
    public String listarReservasVoo() {
        String res = "\nRESERVAS:(" + reservas.size() + ")\n";
        for (ReservaViagem r : reservas)
        {
            if (r instanceof ReservaProgramaVoo || r instanceof ReservaSingularVoo)
            {
                res += r + "\n";
            }
        }
        return res;
    }
    
    /**
     * Retorna a lista de todas as reservas singulares com Voo
     * @return
     */
    public String listarReservasSingularesComVoo() {
        String res = "\nRESERVAS SINGULARES COM VOO:\n";
        for (ReservaViagem r : reservas)
        {
            if (r instanceof ReservaSingularVoo)
            {
                res += r + "\n";
            }
        }
        return res;
    }

    /**
     * Retorna a lista de todas as reservas singulares sem Voo
     * @return
     */
    public String listarReservasSingularesSemVoo() {
        String res = "\nRESERVAS SINGULARES SEM VOO:\n";
        for (ReservaViagem r : reservas)
        {
            if (r instanceof ReservaSingular)
            {
                res += r + "\n";
            }
        }
        return res;
    }

    /**
//     * Retorna a lista de todas as reservas programa com Voo
     * @return
     */
    public String listarReservasTipoProgramaComVoo() {
        String res = "\nRESERVAS TIPO PROGRAMA COM VOO:\n";
        for (ReservaViagem r : reservas)
        {
            if (r instanceof ReservaProgramaVoo)
            {
                res += r + "\n";
            }
        }
        return res;
    }

    /**
     * Retorna a lista de todas as reservas programa sem Voo
     * @return
     */
    public String listarReservasTipoProgramaSemVoo() {
        String res = "\nRESERVAS TIPO PROGRAMA SEM VOO:\n";
        for (ReservaViagem r : reservas)
        {
            if (r instanceof ReservaPrograma)
            {
                res += r + "\n";
            }
        }
        return res;
    }

    /**
     * Retorna a lista de todas as reservas associadas a um cliente
     * @param c
     * @return
     */
    public String listarReservas(Cliente c) {
        String res = "Reservas do cliente " + c + ":\n";
        for (ReservaViagem r : reservas)
        {
            if (r.getCliente().equals(c))
            {
                res += r + "\n";
            }
        }
        return res;
    }

    /**
     * Retorna a lista de todos os programas
     * @return
     */
    public String listarProgramas() {
        String res = "\nPROGRAMAS:(" + programas.size() + ")\n";
        for (ProgramaViagem p : programas)
        {
            res += p + "\n";
        }
        return res;
    }

    /**
     * Retorna a lista de todos os destinos
     * @return
     */
    public String listarDestinos() {
        String res = "\nDESTINOS:(" + destinos.size() + ")\n";
        for (Destino d : destinos)
        {
            res += d + "\n";
        }
        return res;
    }

    /**
     * Retorna a lista de todos os Voos
     * @return
     */
    public String listarVoos() {
        String res = "\nVOOS:(" + voos.size() + ")\n";
        for (Voo v : voos)
        {
            res += v + "\n";
        }
        return res;
    }

    /**
     * Retorna a lista de todos os voos atraves dos parametros:
     * @param de
     * @param para
     * @param di
     * @param df
     * @return
     */
    public String listarVooCondicoes(String de, String para, Data di, Data df) {
        String res = "Voos de " + de + " para " + para + " entre as datas " + di + " e " + df + "\n";
        for (Voo v : voos)
        {
            if (v.obedeceCondicoes(de, para, di, df))
            {
                res += v + "\n";
            }
        }
        return res;
    }

    /**
     * Retorna a lista de todas as informações
     * @return
     */
    public String listarInformacaoCompleta() {
        return listarClientes() + listarDestinos() + listarHoteis() + listarProgramas() + listarReservas() + listarVoos();
    }

    /**
     * Retorna o cliente atraves do parametro:
     * @param codigo
     * @return
     */
    public Cliente procurarCliente(int codigo) {
        for (Cliente c : clientes)
        {
            if (c.getCodigoUnico() == codigo)
            {
                return c;
            }
        }
        return null;
    }

    /**
     * Retorna o destino atraves do parametro:
     * @param cidade
     * @return
     */
    public Destino procurarDestino(String cidade) {
        for (Destino d : destinos)
        {
            if (d.getCidade().equalsIgnoreCase(cidade))
            {
                return d;
            }
        }
        return null;
    }

    /**
     * Retorna o Hotel atraves do parametro:
     * @param codigo
     * @return
     */
    public Hotel procurarHotel(int codigo) {
        for (Hotel h : hoteis)
        {
            if (h.getCodigo() == codigo)
            {
                return h;
            }
        }
        return null;
    }

    /**
     * Retorna o Voo atraves do parametro:
     * @param codigo
     * @return
     */
    public Voo procurarVoo(int codigo) {
        for (Voo v : voos)
        {
            if (v.getCodigoVoo() == codigo)
            {
                return v;
            }
        }
        return null;
    }

    /**
     * Retorna o Programa atraves do parametro:
     * @param codigo
     * @return
     */
    public ProgramaViagem procurarPrograma(int codigo) {
        for (ProgramaViagem p : programas)
        {
            if (p.getCodigoPrograma() == codigo)
            {
                return p;
            }
        }
        return null;
    }

    /**
     * Retorna a Reserva atraves do parametro:
     * @param codigo
     * @return
     */
    public ReservaViagem procurarReserva(int codigo) {
        for (ReservaViagem r : reservas)
        {
            if (r.getCodigoUnico() == codigo)
            {
                return r;
            }
        }
        return null;
    }

    /**
     * Mostra todas as reservas
     * @param cod
     * @return
     */
    public String mostraReserva(int cod) {
        for (ReservaViagem rv : reservas)
        {
            if (rv.getCodigoUnico() == cod)
            {
                return rv.toString();
            }
        }
        return "";
    }

    /**
     * Calcula o custo das reservas atraves do parametro:
     * @param codReserva
     * @return
     */
    public float calcularCustoReserva(int codReserva) {
        ReservaViagem r = procurarReserva(codReserva);
        final int taxa = r.getTaxa();
        float custohotel = r.obterCustoReservaHotel();
        float custovoo = 0;
        float preco = 0;
        if (r instanceof IPagavelVoo)
        {
            IPagavelVoo p = (IPagavelVoo) r;
            custovoo = p.obterCustoVooIda() + p.obterCustoVooRegresso();
        }
        preco = custohotel + custovoo + taxa;
        return preco;
    }

    /**
     * Ordena as reservas por ordem crescente
     * @return
     */
    public String ordernarReservas() {
        Collections.sort(reservas);
        String str = "";
        for (int i = 0; i < reservas.size(); i++)
        {
            str += reservas.get(i) + "\n";
        }
        return str;
    }

    /**
     * Ordena os clientes por ordem crescente do nome
     * @return
     */
    public String ordernarClientes() {
        Collections.sort(clientes);
        String str = "";
        for (int i = 0; i < clientes.size(); i++)
        {
            str += clientes.get(i);
        }
        return str;
    }

    /**
     * Lista todos os hoteis com serviço transfer
     * @return
     */
    public String listarHoteisComTransfer(){
        String hot = "";
        for (Hotel h : hoteis)
        {
            if (h instanceof ICategoriaEservico)
            {
                if (h.oferecerTransfer() == true)
                {
                    hot+= h;
                }
            }
        }
        return hot;
    }

}
