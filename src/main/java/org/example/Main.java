package org.example;

import org.example.clasesViaje.Empleado;
import org.example.clasesViaje.Viaje;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Viaje> viajes = new ArrayList<Viaje>();
        Empleado objetoEmpleado;
        Viaje objetoViaje;

        int opcion;

        do {
            System.out.println("MENU\n");
            System.out.println("1.registrar empleado \n2.registro de viaje \n3.ver todos los empleados \n4.ver todos los viajes del empleado \n5.salir");

            System.out.println("Digite una opcion: ");
            opcion = entradaPorTeclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ingrese su id: ");
                    String idEmpleado = entradaPorTeclado.next();

                    boolean validar = false;

                    for (Empleado empleado : empleados) {
                        if (empleado.getId().equals(idEmpleado)) {
                            validar = true;
                            break;

                        } else {
                            validar = false;
                        }

                    }
                    if (validar) {
                        System.out.println("este id ya existe");
                    } else {
                        objetoEmpleado = new Empleado();

                        objetoEmpleado.setId(idEmpleado);
                        System.out.print("Digite el nombre del empleado: ");
                        objetoEmpleado.setNombre(entradaPorTeclado.next());
                        System.out.print("Digite el apellido del empleado: ");
                        objetoEmpleado.setApellido(entradaPorTeclado.next());
                        System.out.print("Digite el tipo de empleado: ");
                        objetoEmpleado.setTipoDeEmpelado(entradaPorTeclado.next());
                        System.out.print("Digite la edad del empleado: ");
                        objetoEmpleado.setEdad(entradaPorTeclado.nextInt());
                        System.out.print("Digite el salario del empleado: ");
                        objetoEmpleado.setSalario(entradaPorTeclado.nextDouble());

                        empleados.add(objetoEmpleado);

                    }
                    break;

                case 2:
                    System.out.println("ingrese su numero de vuelo: ");
                    String numeroVuelo = entradaPorTeclado.next();

                    boolean verificar = false;

                    for (Viaje viaje : viajes) {
                        if (viaje.getNumeroViaje().equals(numeroVuelo)) {
                            verificar = true;
                            break;

                        } else {
                            verificar = false;
                        }

                    }
                    if (verificar) {
                        System.out.println("este numero de vuelo ya existe");
                    } else {
                        objetoViaje = new Viaje();

                        objetoViaje.setNumeroViaje(numeroVuelo);
                        System.out.print("Digite el origen del viaje: ");
                        objetoViaje.setOrigen(entradaPorTeclado.next());
                        System.out.print("Digite el destino del viaje: ");
                        objetoViaje.setDestino(entradaPorTeclado.next());
                        System.out.print("Digite la hora del viaje: ");
                        objetoViaje.setHora(entradaPorTeclado.next());
                        System.out.print("Digite la fecha del viaje: ");
                        objetoViaje.setFecha(entradaPorTeclado.next());
                        System.out.print("Digite el alojamiento: ");
                        objetoViaje.setAlojamiento(entradaPorTeclado.next());
                        System.out.print("Digite el tipo de transporte: ");
                        objetoViaje.setTipoTransporte(entradaPorTeclado.next());
                        System.out.print("Digite el costo del viaje: ");
                        objetoViaje.setCosto(entradaPorTeclado.nextDouble());

                        viajes.add(objetoViaje);

                    }
                case 3:
                    System.out.println("Listado de empleados: ");
                    for (Empleado empleado: empleados){
                        System.out.println("Informacion");
                        System.out.println("Nombre: " + empleado.getNombre());
                        System.out.println("Apellido: " + empleado.getApellido());
                        System.out.println("Tipo de empleado: " + empleado.getTipoDeEmpelado());
                        System.out.println("Edad: " + empleado.getEdad());
                        System.out.println("Salario: " + empleado.getSalario());
                    }break;

                case 4:
                    System.out.println("Listado de viajes: ");
                    for (Viaje viaje: viajes){
                        System.out.println("Informacion");
                        System.out.println("Origen: " + viaje.getOrigen());
                        System.out.println("Destino: " + viaje.getDestino());
                        System.out.println("Hora: " + viaje.getHora());
                        System.out.println("Fecha: " + viaje.getFecha());
                        System.out.println("Alojamiento: " + viaje.getAlojamiento());
                        System.out.println("Tipo de transporte: " + viaje.getTipoTransporte());
                        System.out.println("costo de viaje: " + viaje.getCosto());
                    }break;

                case 5:
                    System.out.println("Fin de la ejecucion");
                    break;

                default:
                    System.out.println("Opcion no valida");

            }

        }while (opcion != 5) ;

    }
}