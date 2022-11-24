package org.example.clasesViaje;

public class Empresa {

    //atributos
    private String nombre, barrio, direccion, tipoEmpresa;

    //constructor


    public Empresa() {
    }

    public Empresa(String nombre, String barrio, String direccion, String tipoEmpresa) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.direccion = direccion;
        this.tipoEmpresa = tipoEmpresa;
    }
    //get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }
}
