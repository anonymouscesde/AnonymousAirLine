package org.example;

import org.example.clasesViaje.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        int opcion;

        do{
            System.out.println("MENU\n");
            System.out.println("1.registrar empleado \n2.ver todos los empleados \n3.ver todos los viajes del empleado \n4.registro empleado \n5.registro de viaje \n6.salir");

            System.out.println("Digite una opcion: ");
            opcion = entradaPorTeclado.nextInt();

            switch (opcion){
                case 1:
                    int registro;
                    System.out.println("tipo de empleado que desea registrar: ");
                    registro = entradaPorTeclado.nextInt();



            }

        }while (opcion!=6);

    }
}