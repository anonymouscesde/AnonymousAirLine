package org.example.clasesViaje;

public class Alimento {

    //atributos
    private String tipo, lugar, hora;
    private double valor;

    //constructor


    public Alimento() {
    }

    public Alimento(String tipo, String lugar, String hora, double valor) {
        this.tipo = tipo;
        this.lugar = lugar;
        this.hora = hora;
        this.valor = valor;
    }

    //det and set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
