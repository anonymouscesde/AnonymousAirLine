package org.example.clasesViaje;

public class Viaje {

    //atributos
    private String origen, destino, hora, fecha, alojamiento, tipoTransporte, numeroViaje;
    private double costo;


    //constructor

    public Viaje() {
    }

    public Viaje(String origen, String destino, String hora, String fecha, String alojamiento, String tipoTransporte, String numeroViaje, double costo) {
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.fecha = fecha;
        this.alojamiento = alojamiento;
        this.tipoTransporte = tipoTransporte;
        this.numeroViaje = numeroViaje;
        this.costo = costo;
    }

    //get and set

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(String alojamiento) {
        this.alojamiento = alojamiento;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getNumeroViaje() {
        return numeroViaje;
    }

    public void setNumeroViaje(String numeroViaje) {
        this.numeroViaje = numeroViaje;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
