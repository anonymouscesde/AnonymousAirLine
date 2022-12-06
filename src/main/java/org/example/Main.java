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
                    System.out.println("ingrese el id del empleado");
                    idEmpleado = entradaPorTeclado.next();
                    objetoEmpleado = new Empleado();
                    Empleado trabajador = objetoEmpleado.buscarEmpleado(empleados, idEmpleado);

                    if (trabajador != null) {
                        objetoViaje = new Viaje();
                        objetoViaje.setIdEmpleado(idEmpleado);

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
                        System.out.print("Digite el tipo de transporte(nacional o internacional): ");
                        objetoViaje.setTipoTransporte(entradaPorTeclado.next());
                        System.out.print("Digite el costo del viaje: ");
                        objetoViaje.setCosto(entradaPorTeclado.nextDouble());

                        viajes.add(objetoViaje);

                        if (trabajador.getTipoDeEmpelado().equals("senior") && objetoViaje.getTipoTransporte().equals("nacional")) {
                            trabajador.setSalario(trabajador.getSalario()+(trabajador.getSalario())*0.3);

                        } else if (trabajador.getTipoDeEmpelado().equals("senior") && objetoViaje.getTipoTransporte().equals("internacional")) {
                            trabajador.setSalario(trabajador.getSalario()+(trabajador.getSalario())*0.5);
                        }else if (trabajador.getTipoDeEmpelado().equals("junior") && objetoViaje.getTipoTransporte().equals("nacional")){
                            trabajador.setSalario(trabajador.getSalario()+(trabajador.getSalario())*0.2);
                        }else if (trabajador.getTipoDeEmpelado().equals("junior") && objetoViaje.getTipoTransporte().equals("internacional")) {
                            trabajador.setSalario(trabajador.getSalario() + (trabajador.getSalario()) * 0.4);
                        }

                    } else {
                        System.out.println("este empleado no existe");
                    }

                    break;
                case 3:
                    System.out.println("Listado de empleados: ");
                    for (Empleado empleado : empleados) {
                        System.out.println("Informacion");
                        System.out.println("Nombre: " + empleado.getNombre());
                        System.out.println("Apellido: " + empleado.getApellido());
                        System.out.println("Tipo de empleado: " + empleado.getTipoDeEmpelado());
                        System.out.println("Edad: " + empleado.getEdad());
                        System.out.println("Salario: " + empleado.getSalario());
                    }
                    break;

                case 4:
                    objetoViaje = new Viaje();
                    System.out.println("ingrese el id del empleado a mostrar el viaje");
                    idEmpleado = entradaPorTeclado.next();
                    Viaje viajeEncontrado = objetoViaje.buscarViaje(viajes, idEmpleado);
                    if (viajeEncontrado != null) {
                        System.out.println("Listado de viajes: ");
                        for (Viaje viaje : viajes) {
                            if (viaje.getIdEmpleado().equals(viajeEncontrado.getIdEmpleado())) {
                                System.out.println("Origen: " + viaje.getOrigen());
                                System.out.println("Destino: " + viaje.getDestino());
                                System.out.println("Hora: " + viaje.getHora());
                                System.out.println("Fecha: " + viaje.getFecha());
                                System.out.println("Alojamiento: " + viaje.getAlojamiento());
                                System.out.println("Tipo de transporte: " + viaje.getTipoTransporte());
                                System.out.println("costo de viaje: " + viaje.getCosto());
                            }
                        }


                    } else {
                        System.out.println("el empleado no tiene viajes");
                    }

                    break;

                case 5:
                    System.out.println("Fin de la ejecucion");
                    break;

                default:
                    System.out.println("Opcion no valida");

            }

        } while (opcion != 5);

    }
}