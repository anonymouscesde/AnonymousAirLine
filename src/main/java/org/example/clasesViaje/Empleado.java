package org.example.clasesViaje;

import java.util.Scanner;

public class Empleado {
    Scanner entradaPorTeclado = new Scanner(System.in);
    //atributos
    private String nombre, apellido, id, tipoDeEmpelado;
    private int edad;
    private double salario;

    //constructor

    public Empleado() {
    }

    public Empleado(Scanner entradaPorTeclado, String nombre, String apellido, String id, String tipoDeEmpelado, int edad, double salario) {
        this.entradaPorTeclado = entradaPorTeclado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.tipoDeEmpelado = tipoDeEmpelado;
        this.edad = edad;
        this.salario = salario;
    }


    public Scanner getEntradaPorTeclado() {
        return entradaPorTeclado;
    }

    public void setEntradaPorTeclado(Scanner entradaPorTeclado) {
        this.entradaPorTeclado = entradaPorTeclado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoDeEmpelado() {
        return tipoDeEmpelado;
    }

    public void setTipoDeEmpelado(String tipoDeEmpelado) {
        this.tipoDeEmpelado = tipoDeEmpelado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        while (edad<=17){
            System.out.println("la edad debe ser mayor de 18, ingrese la edad nuevamente: ");
            edad=entradaPorTeclado.nextInt();
        }this.edad=edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
