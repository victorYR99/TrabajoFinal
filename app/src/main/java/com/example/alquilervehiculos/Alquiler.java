package com.example.alquilervehiculos;

import java.util.Date;

public class Alquiler {

    private String idVehiculo;
    private String idUsuario;
    private Date fechaInicio;
    private Date fechaFin;
    private int precio;

    public Alquiler(String idVehiculo, String idUsuario, Date fechaInicio, Date fechaFin, int precio) {
        this.idVehiculo = idVehiculo;
        this.idUsuario = idUsuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = calcularPrecio(precio);
    }

    public int calcularPrecio(int precio){

        int dias=(int) ((fechaInicio.getTime()-fechaFin.getTime())/86400000);

        return dias * precio;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
