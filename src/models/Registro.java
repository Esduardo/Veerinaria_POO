package models;
import models.Exteds.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    private static float totalFull = 0;
    private static short opc;
    static ArrayList<Eventos> listaEventos =  new ArrayList<>();
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Historial> listaHistorial = new ArrayList<>();
    static ArrayList<Mascota> listaMascotas = new ArrayList<>();


    public static ArrayList<Accesorios> listaAcs(){
        ArrayList <Accesorios> listaAccesorios = new ArrayList(3
        );
        listaAccesorios.add(new Accesorios("shampoo",122, "Blancos", 12));
        listaAccesorios.add(new Accesorios("correa",321, "azul", 231));
        listaAccesorios.add(new Accesorios("collares unitallas para mascotas",5672, "Grises", 100));
        return listaAccesorios;
    }
    public static ArrayList<Alimentos> listaAli(){
        ArrayList<Alimentos> listaAlimentos = new ArrayList<>(3);
        listaAlimentos.add(new Alimentos("alimento en capsulas", 6677, 120, "Arizona"));
        listaAlimentos.add(new Alimentos("alimento en polvo",9921, 150, "Solaris"));
        listaAlimentos.add(new Alimentos("alimento en grano",9921, 232, "Amnesis"));
        return  listaAlimentos;
    }


    static Scanner entrada = new Scanner(System.in);

    public static void menuInicio() {
        do {
            System.out.println("::          1. Registrar Cliente          ::" +
                             "\n::          2. Buscar cliente por id      ::" +
                             "\n::          3. Ver total entradas         ::" +
                             "\n::          4. Salir                      ::");
            System.out.printf("            : ");
            opc = entrada.nextShort();
            switch (opc) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    buscarCliente();
                    break;
                case 3:
                        System.out.println("Total de clientes registrados: " + listaClientes.size());
                        System.out.printf("Total general: " + totalFull + "\n");
                        menuInicio();
                    break;
                case 4:
                    System.out.println("Adiooooooooooos");
                    break;
            }
        } while (opc != 4);
    }
//------------------------------------------------------------------------------------------------------------------------
    //                                          CLIENTE
    public static void registrarCliente() {
        String nombre;
        int id;
        System.out.println("::      Registrar CLIENTE       ::");
        System.out.print(">>>      nombre: ");
        nombre = entrada.next();
        System.out.print(">>>      ID: ");
        id = entrada.nextInt();
        listaClientes.add(new Cliente(nombre,id));
    }

    public static void buscarCliente() {
        int id;
        System.out.printf("Escriba el id  del cliente para buscar: ");
        id = entrada.nextInt();
        for(Cliente cliente: listaClientes)
         if (cliente.getId() == id){
             System.out.println("::     Nombre: " + cliente.getNombre());
             System.out.println("::         Id: " + cliente.getId());
                do {
                    System.out.println("::     1. Registrar mascotas           ::");
                    System.out.println("::     2. Ver mascotas registradas     ::");
                    System.out.println("::     3. Buscar mascota               ::");
                    System.out.println("::     4. Comprar (tienda)             ::");
                    System.out.println("::     5. Ver historial(eventos)       ::");
                    System.out.println("::     6. Salir                        ::");
                    System.out.printf("            : ");
                    opc = entrada.nextShort();
                    switch (opc) {
                        case 1:
                            registroMascota();
                            break;
                        case 2:
                            verMascotas();
                            break;
                        case 3:
                            buscarMascota();
                            break;
                        case 4:
                            verTienda();
                        case 5:

                            break;
                        case 6:
                            menuInicio();
                            break;
                        default:
                            System.out.printf("No existe :[");
                    }
                } while (opc != 4);
           }
    }

//_--------------------------------------------------------------------------------------------------------------------
    //                                              MASCOTAS
    public static void registroMascota() {
        int id;
        short pregunta;
        String nombreAnim, habitad, tipoAgua, tipoPlumas, colorPiel, tipoTierra;
        float peso;
        System.out.println("::          registro de mascota ");
        System.out.println("::          que tipo de mascota es  ");
        System.out.println("::              1) terrestre ");
        System.out.println("::              2) acuatico");
        System.out.println("::              3) volador");
        System.out.println("::              4) subterraneo");
        System.out.println("::              5)salir del registro");
        System.out.printf("            : ");
        pregunta = entrada.nextShort();
        switch (pregunta) {
            case 1:
                System.out.printf("ingrese el nombre de la mascota: ");
                nombreAnim = entrada.next();
                System.out.printf("peso: ");
                peso = entrada.nextFloat();
                System.out.printf("id: ");
                id =  entrada.nextInt();
                System.out.printf("habitad: ");
                habitad = entrada.next();
                listaMascotas.add(new Terrestres(nombreAnim, peso, id, habitad));
                break;
            case 2:
                System.out.printf("ingrese el nombre de la mascota: ");
                nombreAnim = entrada.next();
                System.out.printf("peso: ");
                peso = entrada.nextFloat();
                System.out.printf("id: ");
                id =  entrada.nextInt();
                System.out.printf("tipo de agua: ");
                tipoAgua =  entrada.next();
                listaMascotas.add(new Acuaticos(nombreAnim, peso, id, tipoAgua));
                break;
            case 3:
                System.out.printf("ingrese el nombre de la mascota: ");
                nombreAnim = entrada.next();
                System.out.printf("peso: ");
                peso = entrada.nextFloat();
                System.out.printf("id: ");
                id =  entrada.nextInt();
                System.out.printf("tipo de plumas:");
                tipoPlumas = entrada.next();
                System.out.printf("habitad: ");
                habitad =  entrada.next();
                listaMascotas.add(new Voladores(nombreAnim, peso, id, tipoPlumas, habitad));
                break;
            case 4:
                System.out.printf("ingrese el nombre de la mascota: ");
                nombreAnim = entrada.next();
                System.out.printf("peso: ");
                peso = entrada.nextFloat();
                System.out.printf("id: ");
                id =  entrada.nextInt();
                System.out.printf("color de piel: ");
                colorPiel =  entrada.next();
                System.out.printf("tipo de tierra: ");
                tipoTierra =  entrada.next();
                listaMascotas.add(new Subterraneo(nombreAnim, peso, id, colorPiel, tipoTierra));
                break;
            case 5:
                buscarCliente();
                break;
            default:
                System.out.println("opcion  no valida, inrenta de nuevo....");
        }
    }

    public static void verTienda(){
        int compra, id;
        System.out.println("::                 TIENDA                 ::");

        for(Producto producto : listaAli()){
            System.out.println("::       Nombre: " + Producto.getNombre());
            System.out.println("::           id: " + Producto.getId());

            for(Accesorios accesorios: listaAcs()){
                System.out.println("::          color : " + accesorios.getColor());
                System.out.println("::       cantidad : " + accesorios.getCantidad());
            }
        }

        for(Producto producto : listaAli()){
            System.out.println("::       Nombre: " + Producto.getNombre());
            System.out.println("::           id: " + Producto.getId());

            for(Alimentos alimentos: listaAli()){
                System.out.println("::           kilos: " + alimentos.getKilos());
                System.out.println("::           marca: " + alimentos.getMarca());
            }
        }

        do {
            System.out.println("   Desea comprar algo?     ");
            System.out.println("         1.(Si)            ");
            System.out.println("         2. No             ");
            System.out.printf("                 : ");
            opc =  entrada.nextShort();
            switch (opc){
                case 1:
                    System.out.printf("Dame el id del producto: ");
                    id =  entrada.nextInt();

                    break;
                case 2:
                    buscarCliente();
                    break;
                default:
                    System.out.println("no exixste :[");
            }
        }while (opc != 2);
    }

    public static void verMascotas(){
        Mascota mascota;
        String eleccion;
        for(int i = 0; i < listaMascotas.size(); i++){
            System.out.println("nombre: " + listaMascotas.get(i).getNombre());
            System.out.println("peso: " + listaMascotas.get(i).getPeso());
            System.out.println("id: " + listaMascotas.get(i).getId());
        }
    }
    public static void buscarMascota(){
        int numCosas, id; float preConsulta, pagSubTotal = 0, precio, total = 0;
        String nombre, nom, carac;
        System.out.printf("elejir mascota(id): ");
        id = entrada.nextInt();
        for(Mascota mascota : listaMascotas)
            if (mascota.getId() == id){
                System.out.println("::           nombre: " + mascota.getNombre());
                System.out.println("::             peso: " + mascota.getPeso());
                System.out.println("::               id: " + mascota.getId());
                do {
                    System.out.println("           MENU           ");
                    System.out.println(" 1. Consulta");
                    System.out.println(" 2. Regresar  ");
                    System.out.println(" 3. Ver historial medico");
                    System.out.printf("       : ");
                    opc = entrada.nextShort();
                    switch (opc){
                        case 1:
                            System.out.println("       Consulta        ");
                            System.out.printf("cosas que necesitará (cantidad): ");
                            numCosas =  entrada.nextInt();
                            for(int i = 1; i <= numCosas; i++){
                                System.out.printf("nombre         : ");
                                nom =  entrada.next();
                                System.out.printf("caracteristica: ");
                                carac =  entrada.next();
                                System.out.printf("precio: ");
                                precio =  entrada.nextFloat();
                                System.out.printf("precio de cosulta: ");
                                preConsulta =  entrada.nextFloat();
                                pagSubTotal =  precio + preConsulta;

                                System.out.println("\nSubtotal : " + pagSubTotal  + "\n");
                                Historial historial =  new Historial(nom, carac, preConsulta, pagSubTotal);
                                listaHistorial.add(historial);
                            }
                            total =  total + pagSubTotal;
                            totalFull = total + totalFull;
                            System.out.println("Total: " + total);
                            Eventos eventos = new Eventos(total);

                            break;
                        case 2:
                            menuInicio();
                            break;
                        case 3:
                            for(Historial historial : listaHistorial){
                                System.out.println("  Cosa necesaria: " + historial.getNomCosaNecesitada());
                                System.out.println("  caracteristica: " + historial.getCarac());
                                System.out.println("          precio: " + historial.getPrecioCon());
                                System.out.println(" precio consulta: " + historial.getPrecioCon());
                            }
                            break;
                    }
                }while(opc != 3);
            }
    }

    public static void menuMascota(){


    }
    //------------------------------------------------------------------------------------------------------------------

}

