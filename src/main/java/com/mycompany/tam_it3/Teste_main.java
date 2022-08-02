/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tam_it3;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Catarina
 */
public class Teste_main implements Serializable {

    private static Agencia tam = new Agencia();
    private static DataHora getDataHoraAtual() {
        LocalDateTime now = LocalDateTime.now();
        return new DataHora(new Data(now.getYear(), now.getMonthValue(), now.getDayOfMonth()), now.getHour(), now.getMinute());
    }

    /**
     *
     * @param args
     * @throws ExceptionClientes
     * @throws ExceptionHotel
     * @throws ExceptionCatHotel
     */
    public static void main(String[] args) throws ExceptionClientes, ExceptionHotel, ExceptionCatHotel {

        Scanner sc = new Scanner(System.in);
        if (perguntaruserler() == false)
        {
            // 6 voos
            Aeroporto aeroportoPorto = new Aeroporto(1, "Porto", "www.porto.pt");
            Aeroporto aeroportoLisboa = new Aeroporto(2, "Lisboa", "www.lisboa.pt");
            Aeroporto aeroportoFaro = new Aeroporto(3, "Faro", "www.faro.pt");
            tam.adicionarVoo(1, "TAP P L", 100, aeroportoPorto, aeroportoLisboa, new DataHora(2021, 06, 1, 12, 0), 200);
            tam.adicionarVoo(2, "TAP L P", 100, aeroportoLisboa, aeroportoPorto, new DataHora(2021, 06, 2, 13, 0), 300);
            tam.adicionarVoo(3, "TAP P F", 100, aeroportoPorto, aeroportoFaro, new DataHora(2021, 06, 3, 14, 0), 400);
            tam.adicionarVoo(3, "TAP F P", 100, aeroportoFaro, aeroportoPorto, new DataHora(2021, 06, 4, 15, 0), 250);
            tam.adicionarVoo(5, "TAP F L", 100, aeroportoFaro, aeroportoLisboa, new DataHora(2021, 06, 5, 16, 0), 350);
            tam.adicionarVoo(6, "TAP L F", 100, aeroportoLisboa, aeroportoFaro, new DataHora(2021, 06, 6, 17, 0), 450);
            // 5 clientes
            tam.adicionarCliente("Ana", new Data(1951, 1, 1), "cc111111111", "nif111111111", "np111111111", "tel111111111", "ana@ana.ana");
            tam.adicionarCliente("Bruno", new Data(1952, 2, 2), "cc222222222", "nif222222222", "np222222222", "tel222222222", "bruno@bruno.bruno");
            tam.adicionarCliente("Carla", new Data(1953, 3, 3), "cc333333333", "nif333333333", "np333333333", "tel333333333", "carla@carla.carla");
            tam.adicionarCliente("Diogo", new Data(1954, 4, 4), "cc444444444", "nif444444444", "np444444444", "tel444444444", "diogo@diogo.diogo");
            tam.adicionarCliente("Elsa", new Data(1955, 5, 5), "cc555555555", "nif555555555", "np555555555", "tel555555555", "elsa@elsa.elsa");
            // 3 destinos
            tam.adicionarDestino("Porto", "Portugal", "Europa");
            tam.adicionarDestino("Lisboa", "Portugal", "Europa");
            tam.adicionarDestino("Faro", "Portugal", "Europa");
            // 3 hoteis
            Hotel.padraocatlist();
            tam.adicionarHotel("HP", "***", "Porto", "www.hp.pt", 150, true);
            tam.adicionarHotel("HL", "****", "Lisboa", "www.hl.pt", 200, false);
            tam.adicionarHotel("HF", "*****", "Faro", "www.hf.pt", 350, true);
            // 4 programas de viagem
            tam.adicionarPrograma(1, "Porto - 2 dias");
            tam.adicionarDatasPrograma(1, new Data(2021, 06, 14));
            tam.adicionarDatasPrograma(1, new Data(2021, 06, 15));
            tam.adicionarEventosPrograma(1, "Baixa");
            tam.adicionarEventosPrograma(1, "Foz");

            tam.adicionarPrograma(2, "Porto - 3 dias");
            tam.adicionarDatasPrograma(2, new Data(2021, 06, 16));
            tam.adicionarDatasPrograma(2, new Data(2021, 06, 17));
            tam.adicionarEventosPrograma(2, "Baixa");
            tam.adicionarEventosPrograma(2, "Ribeira");
            tam.adicionarEventosPrograma(2, "Foz");

            tam.adicionarPrograma(3, "Lisboa - 2 dias");
            tam.adicionarDatasPrograma(3, new Data(2021, 06, 13));
            tam.adicionarDatasPrograma(3, new Data(2021, 06, 17));
            tam.adicionarEventosPrograma(3, "Centro histórico");
            tam.adicionarEventosPrograma(3, "Zona industrial");

            tam.adicionarPrograma(4, "Faro - 2 dias");
            tam.adicionarDatasPrograma(4, new Data(2021, 06, 15));
            tam.adicionarDatasPrograma(4, new Data(2021, 06, 18));
            tam.adicionarEventosPrograma(4, "Praia");
            tam.adicionarEventosPrograma(4, "Monte");

            ProgramaViagem pv = new ProgramaViagem(5, "Lisboa 3 dias");
            pv.adicionarData(new Data(2021, 6, 14));
            pv.adicionarEvento("Centro histórico");
            pv.adicionarEvento("Zona industrial");
            pv.adicionarEvento("Bairros");
            tam.adicionarPrograma(pv);

//        System.out.println("=== Segunda listagem ===\n" + tam.listarInformacaoCompleta());
//            adicionarReservaSingularSemVoo(sc, tam);
            Data data1 = new Data(2021, 10, 14);
            Data data2 = new Data(2021, 10, 19);
            Data data3 = new Data(2021, 10, 28);
            Data data4 = new Data(2021, 11, 03);
            Data data5 = new Data(2021, 03, 20);
            Data data6 = new Data(2021, 03, 30);
            Data data7 = new Data(2021, 12, 24);
            Data data8 = new Data(2021, 12, 28);
            Data data9 = new Data(2022, 1, 5);
            Data data10 = new Data(2021, 3, 25);
            
            ProgramaViagem pv1 = new ProgramaViagem(1, "Lisboa-2dias");
            ArrayList<Hotel> hh1 = new ArrayList<>();
            hh1.add(tam.getHoteis().get(0));
            hh1.add(tam.getHoteis().get(1));
            pv1.adicionarData(data9);
            pv1.adicionarEvento("Andar de bike");
            pv1.adicionarEvento("Andar de ponei");
            tam.adicionarPrograma(pv1);

            ProgramaViagem pv2 = new ProgramaViagem(2, "Porto-3dias");
            ArrayList<Hotel> hh2 = new ArrayList<>();
            hh2.add(tam.getHoteis().get(0));
            hh2.add(tam.getHoteis().get(1));
            hh2.add(tam.getHoteis().get(2));
            pv2.adicionarData(data1);
            pv2.adicionarData(data2);
            pv2.adicionarData(data3);
            pv2.adicionarEvento("andar de barco");
            pv2.adicionarEvento("visitar torre clerigos");
            pv2.adicionarEvento("comer francesinha");
            tam.adicionarPrograma(pv2);

            ProgramaViagem pv3 = new ProgramaViagem(3, "Lisboa-2dias");
            ArrayList<Hotel> hh3 = new ArrayList<>();
            hh3.add(tam.getHoteis().get(0));
            hh3.add(tam.getHoteis().get(1));
            pv3.adicionarData(data3);
            pv3.adicionarEvento("ser roubado");
            pv3.adicionarEvento("voltar para casa");
            tam.adicionarPrograma(pv3);

            ProgramaViagem pv4 = new ProgramaViagem(4, "ibiza-2dias");
            ArrayList<Hotel> hh4 = new ArrayList<>();
            hh4.add(tam.getHoteis().get(0));
            hh4.add(tam.getHoteis().get(1));
            pv4.adicionarData(data6);
            pv4.adicionarEvento("Praia");
            pv4.adicionarEvento("Festa no hotel");
            tam.adicionarPrograma(pv4);
            tam.adicionarReservaSingular(3, getDataHoraAtual(), data1, data2, tam.getClientes().get(0),20, tam.getDestinos().get(0), tam.getHoteis().get(0));
//        System.out.println("=== Terceira listagem: após adicionarReservaSingularSemVoo ===\n" + tam.listarInformacaoCompleta());

//            adicionarReservaSingularComVoo(sc, tam);
            tam.adicionarReservaSingularVoo(3, tam.getVoos().get(0), tam.getVoos().get(1), getDataHoraAtual(), data3, data4, tam.getClientes().get(1),15, tam.getDestinos().get(1), tam.getHoteis().get(1));
//        System.out.println("=== Quarta listagem: após adicionarReservaSingularComVoo ===\n" + tam.listarInformacaoCompleta());

//            adicionarReservaTipoProgramaSemVoo(sc, tam);
            tam.adicionarReservaPrograma(3, getDataHoraAtual(), data5, data6, tam.getClientes().get(2),35, pv1, hh1, pv1.getDatasEmQuePodeOcorrer().get(0));
//        System.out.println("=== Quinta listagem: após adicionarReservaTipoProgramaSemVoo ===\n" + tam.listarInformacaoCompleta());

//            adicionarReservaTipoProgramaComVoo(sc, tam);
            tam.adicionarReservaProgramaVoo(3, tam.getVoos().get(0), tam.getVoos().get(1), getDataHoraAtual(), data7, data8, tam.getClientes().get(3),25, pv2, hh2, pv2.getDatasEmQuePodeOcorrer().get(0));
//        System.out.println("=== Quinta listagem: após adicionarReservaTipoProgramaComVoo ===\n" + tam.listarInformacaoCompleta());

//        System.out.println(tam.listarReservasSingularesComVoo());
//        System.out.println(tam.listarReservasTipoProgramaSemVoo());
//        mostrarVoosCondicoes(tam, sc);
//        System.out.println(tam.listarClientesComReservaPrograma());
//        eliminarReserva(sc, tam);
//        alterarVoo(sc, tam);
        }
        
//      2. Criação de métodos para listar, para o ecrã
//          a. as reservas ordenadas por data de reserva
        for (ReservaViagem r : tam.getReservas())
        {
            r.setPreco(tam.calcularCustoReserva(r.getCodigoUnico()));
        }
        System.out.println("=== Primeira listagem: Lista de reservas ordenadas por data de reserva ===");
        System.out.println(tam.ordernarReservas() + "\n");

//          b. a lista de clientes ordenada por nome.
        System.out.println("=== Segunda listagem: Lista de clientes ordenada por nome ===");
        System.out.println(tam.ordernarClientes()+ "\n");
        
//      3. Criação de um método para mostrar para o ecrã, todos os hotéis que têm serviço de transfer
        System.out.println("=== Terceira listagem: Lista de hoteis com serviço transfer ===");
        System.out.println(tam.listarHoteisComTransfer()+ "\n");


//      4. Criação de métodos para ler e gravar a informação da agência para ficheiro
        String nomeficheiro = "data";
        Ficheiro.gravarInformacaoAgencia(nomeficheiro, tam);
        Ficheiro.lerInformacaoAgencia(nomeficheiro);

//      5. Antes da aplicação terminar, deverá ser perguntado ao utilizador se deseja que seja gravada a
//      informação da agência para ficheiro. No caso afirmativo, deverá ser requerido o nome do ficheiro, e em
//      seguida guardada a informação no disco.
        perguntaruserguardar();
    }
/**
 * Pergunta ao utilizador se deseja ler a informacao atravez de um ficheiro
 * @return 
 */
    private static boolean perguntaruserler() {
        int i = JOptionPane.showConfirmDialog(null, "Deseja ler informações através de um ficheiro?", "Carregar ficheiro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (i == 0)
        {
            String j = JOptionPane.showInputDialog(null, "Insira o nome do ficheiro", "Nome do ficheiro", JOptionPane.QUESTION_MESSAGE);
            if (j != null)
            {
                if (Ficheiro.lerInformacaoAgencia(j) != null)
                {
                     tam = Ficheiro.lerInformacaoAgencia(j);
                     return true;
                }             
            }
        }
        System.out.println("->Operação cancelada");
        return false;
    }
    /**
     * Pergunta ao utilizador se deseja guardar a informacao em um ficheiro
     * @return 
     */
    private static boolean perguntaruserguardar() {
        System.out.println("\n\nDeseja guardar as informações da agencia em um ficheiro?(s/n)");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
//        int i = JOptionPane.showConfirmDialog(null, "Deseja guardar as informações da agencia em um ficheiro?", "Guardar para ficheiro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op.equals("s"))
        {
            String j = JOptionPane.showInputDialog(null, "Insira o nome do ficheiro", "Nome do ficheiro", JOptionPane.QUESTION_MESSAGE);
            if (j != null)
            {
                Ficheiro.gravarInformacaoAgencia(j, tam);
                return true;
            }else{
                        System.out.println("->Operação cancelada");
            }
        }
        return false;
    }

    private static void adicionarReservaSingularSemVoo(Scanner sc, Agencia tam) {
        System.out.println("Adicionar reserva singular sem voo:");
        Data dp = perguntarData(sc, "Partida");
        Data dr = perguntarData(sc, "Regresso");
        Cliente c = perguntarCliente(tam, sc);
        System.out.println("Insira a taxa associada a reserva:");
        int taxa = sc.nextInt();
        Destino d = perguntarDestino(tam, sc);
        Hotel h = perguntarHotel(tam, sc);
        tam.adicionarReservaSingular(3, getDataHoraAtual(), dp, dr, c,taxa, d, h);
    }

    private static void adicionarReservaSingularComVoo(Scanner sc, Agencia tam) {
        System.out.println("Adicionar reserva singular com voo:");
        Voo vi = perguntarVoo(tam, sc, "Ida");
        Voo vr = perguntarVoo(tam, sc, "Regresso");
        Data dp = (Data) vi.getDataHoraPartida();
        Data dr = (Data) vr.getDataHoraPartida();
        Cliente c = perguntarCliente(tam, sc);
        System.out.println("Insira a taxa associada a reserva:");
        int taxa = sc.nextInt();
        Destino d = perguntarDestino(tam, sc);
        Hotel h = perguntarHotel(tam, sc);
        tam.adicionarReservaSingularVoo(3, vi, vr, getDataHoraAtual(), dp, dr, c,taxa, d, h);
    }

    /**
     *
     * @param sc
     * @param tam
     */
    public static void adicionarReservaTipoProgramaSemVoo(Scanner sc, Agencia tam) {
        System.out.println("Adicionar reserva tipo programa sem voo:");
        Data dp = perguntarData(sc, "Partida");
        Data dr = perguntarData(sc, "Regresso");
        Cliente c = perguntarCliente(tam, sc);
        System.out.println("Insira a taxa associada a reserva:");
        int taxa = sc.nextInt();
        Hotel h;
        ProgramaViagem pv = perguntarPrograma(tam, sc);
        ArrayList<Hotel> hs = new ArrayList<>();
        for (int i = 0; i < pv.getNrDias(); i++)
        {
            System.out.println("Dia " + (i + 1));
            h = perguntarHotel(tam, sc);
            hs.add(h);
        }
        System.out.println("Escolher data de início: ");
        for (int i = 0; i < pv.getDatasEmQuePodeOcorrer().size(); i++)
        {
            System.out.println(i + ": " + pv.getDatasEmQuePodeOcorrer().get(i));
        }
        int idxData = sc.nextInt();
        tam.adicionarReservaPrograma(3, getDataHoraAtual(), dp, dr, c,taxa, pv, hs, pv.getDatasEmQuePodeOcorrer().get(idxData));
    }

    /**
     *
     * @param sc
     * @param tam
     */
    public static void adicionarReservaTipoProgramaComVoo(Scanner sc, Agencia tam) {
        System.out.println("Adicionar reserva tipo programa sem voo:");
        Voo vi = perguntarVoo(tam, sc, "Ida");
        Voo vr = perguntarVoo(tam, sc, "Regresso");
        Data dp = (Data) vi.getDataHoraPartida();
        Data dr = (Data) vr.getDataHoraPartida();
        Cliente c = perguntarCliente(tam, sc);
        System.out.println("Insira a taxa associada a reserva:");
        int taxa = sc.nextInt();
        Hotel h;
        ProgramaViagem pv = perguntarPrograma(tam, sc);
        ArrayList<Hotel> hs = new ArrayList<>();
        for (int i = 0; i < pv.getNrDias(); i++)
        {
            System.out.println("Dia " + (i + 1));
            h = perguntarHotel(tam, sc);
            hs.add(h);
        }
        System.out.println("Escolher data de início: ");
        for (int i = 0; i < pv.getDatasEmQuePodeOcorrer().size(); i++)
        {
            System.out.println(i + ": " + pv.getDatasEmQuePodeOcorrer().get(i));
        }
        int idxData = sc.nextInt();
        tam.adicionarReservaProgramaVoo(3, vi, vr, getDataHoraAtual(), dp, dr, c,taxa, pv, hs, pv.getDatasEmQuePodeOcorrer().get(idxData));
    }

    private static Data perguntarData(Scanner sc, String tipo) {
        System.out.println(tipo + " - Introduzir data no formato aaaa mm dd:");
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        return new Data(a, m, d);
    }

    private static Cliente perguntarCliente(Agencia tam, Scanner sc) {
        System.out.println("Clientes disponíveis:");
        System.out.println(tam.listarClientes());
        Cliente c = null;
        while (c == null)
        {
            System.out.println("Introduzir codigoUnico do cliente: ");
            int codCliente = sc.nextInt();
            c = tam.procurarCliente(codCliente);
            if (c == null)
            {
                System.out.println("Código de cliente inválido");
            } else
            {
                System.out.println("Escolhido cliente: " + c);
                return c;
            }
        }
        return null;
    }

    private static Destino perguntarDestino(Agencia tam, Scanner sc) {
        System.out.println("Destinos disponíveis:");
        System.out.println(tam.listarDestinos());
        Destino d = null;
        while (d == null)
        {
            System.out.println("Introduzir cidade do destino: ");
            String cidade = sc.next();
            d = tam.procurarDestino(cidade);
            if (d == null)
            {
                System.out.println("Destino inválido");
            } else
            {
                System.out.println("Escolhido destino: " + d);
                return d;
            }
        }
        return null;
    }

    private static Hotel perguntarHotel(Agencia tam, Scanner sc) {
        System.out.println("Destinos disponíveis:");
        System.out.println(tam.listarHoteis());
        Hotel h = null;
        while (h == null)
        {
            System.out.println("Introduzir codigo do hotel: ");
            int codigo = sc.nextInt();
            h = tam.procurarHotel(codigo);
            if (h == null)
            {
                System.out.println("Hotel inválido");
            } else
            {
                System.out.println("Escolhido hotel: " + h);
                return h;
            }
        }
        return null;
    }

    private static Voo perguntarVoo(Agencia tam, Scanner sc, String tipo) {
        System.out.println("Voos disponíveis:");
        System.out.println(tam.listarVoos());
        Voo v = null;
        while (v == null)
        {
            System.out.println(tipo + ": Introduzir codigo do voo: ");
            int codigo = sc.nextInt();
            v = tam.procurarVoo(codigo);
            if (v == null)
            {
                System.out.println("Voo inválido");
            } else
            {
                System.out.println("Escolhido voo: " + v);
                return v;
            }
        }
        return null;
    }

    private static ProgramaViagem perguntarPrograma(Agencia tam, Scanner sc) {
        System.out.println("Programas disponíveis:");
        System.out.println(tam.listarProgramas());
        ProgramaViagem p = null;
        while (p == null)
        {
            System.out.println("Introduzir codigoPrograma: ");
            int codPrograma = sc.nextInt();
            p = tam.procurarPrograma(codPrograma);
            if (p == null)
            {
                System.out.println("Código de programa inválido");
            } else
            {
                System.out.println("Escolhido programa: " + p);
                return p;
            }
        }
        return null;
    }

    private static void mostrarVoosCondicoes(Agencia tam, Scanner sc) {
        System.out.println("Introduzir aeroporto de partida:");
        String de = sc.next();
        System.out.println("Introduzir aeroporto de chegada:");
        String para = sc.next();
        Data di = perguntarData(sc, "Data inicial");
        Data df = perguntarData(sc, "Data final");
        System.out.println(tam.listarVooCondicoes(de, para, di, df));
    }

    private static ReservaViagem perguntarReserva(Agencia tam, Scanner sc, Cliente c) {
        System.out.println(tam.listarReservas(c));
        ReservaViagem r = null;
        while (r == null)
        {
            System.out.println("Introduzir codigoReserva: ");
            int codReserva = sc.nextInt();
            r = tam.procurarReserva(codReserva);
            if (r == null)
            {
                System.out.println("Código de programa inválido");
            } else
            {
                System.out.println("Escolhida reserva: " + r);
                return r;
            }
        }
        return null;
    }

    private static int perguntarCodigoReserva(Agencia tam, Scanner sc) {
        System.out.println(tam.listarReservasVoo());
        ReservaViagem r = null;
        int codReserva;
        while (r == null)
        {
            System.out.println("Introduzir codigoReserva: ");
            codReserva = sc.nextInt();
            r = tam.procurarReserva(codReserva);
            if (r == null)
            {
                System.out.println("Código de programa inválido");
            } else
            {
                System.out.println("Escolhida reserva: " + r);
                return codReserva;
            }
        }
        return -1;
    }

    private static void eliminarReserva(Scanner sc, Agencia tam) {
        Cliente c = perguntarCliente(tam, sc);
        ReservaViagem r = perguntarReserva(tam, sc, c);
        tam.eliminarReserva(r);
        System.out.println("Após remoção");
        System.out.println(tam.listarReservas(c));
    }

    private static void alterarVoo(Scanner sc, Agencia tam) {
        int reserva = perguntarCodigoReserva(tam, sc);
        System.out.println("Dados da reserva:");
        System.out.println(tam.mostraReserva(reserva));

        System.out.println("Pretende alterar voo de ida (1) ou de regresso (2)?");
        int tipoVoo = sc.nextInt();

        Voo novoVoo = perguntarVoo(tam, sc, "Novo voo");
        if (tipoVoo == 1)
        {
            tam.alterarVooIda(reserva, novoVoo);
        } else if (tipoVoo == 2)
        {
            tam.alterarVooRegresso(reserva, novoVoo);
        }

        System.out.println("Novos dados da reserva:");
        System.out.println(tam.mostraReserva(reserva));
    }
}
