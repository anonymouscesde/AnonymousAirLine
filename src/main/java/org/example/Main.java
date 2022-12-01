package org.example;

import org.example.clasesViaje.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado objetoEmpleado;

        int opcion;

        do{
            System.out.println("MENU\n");
            System.out.println("1.registrar empleado \n2.ver todos los empleados \n3.ver todos los viajes del empleado \n4.registro empleado \n5.registro de viaje \n6.salir");

            System.out.println("Digite una opcion: ");
            opcion = entradaPorTeclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("ingrese su id: ");
                    String idEmpleado = entradaPorTeclado.next();

                    boolean validar = false;

                    for (Empleado empleado: empleados) {
                        if (empleado.getId().equals(idEmpleado)){
                            validar = true;
                            break;

                        }else {
                            validar = false;
                        }

                    }
                    if(validar){
                        System.out.println("este id ya existe");
                    }else {
                        objetoEmpleado = new Empleado();

                        objetoEmpleado.setId(idEmpleado);
                        System.out.print("Digite el nombre del jugador: ");
                        objetoEmpleado.setNombre(entradaPorTeclado.next());
                        System.out.print("Digite el apellido del jugador: ");
                        objetoEmpleado.setApellido(entradaPorTeclado.next());
                        System.out.print("Digite la posicion del jugador: ");
                        objetoEmpleado.setTipoDeEmpelado(entradaPorTeclado.next());

                    }





            }

        }while (opcion!=6);

    }
}