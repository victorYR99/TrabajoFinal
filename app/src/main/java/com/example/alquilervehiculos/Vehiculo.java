package com.example.alquilervehiculos;

import java.util.ArrayList;
import java.util.Date;

public class Vehiculo {

    private String idVehiculo;
    private String idPropietario;
    private String marca;
    private String modelo;
    private String plazas;
    private String puertas;
    private int kilonmetros;
    private int añoVehiculo;
    private int precioDia;
    private ArrayList<String> fotos;

    public Vehiculo(String idVehiculo, String idPropietario, String marca, String modelo, String plazas,
                    String puertas, int kilonmetros, int añoVehiculo, int precioDia, ArrayList<String> fotos) {
        this.idVehiculo = idVehiculo;
        this.idPropietario = idPropietario;
        this.marca = marca;
        this.modelo = modelo;
        this.plazas = plazas;
        this.puertas = puertas;
        this.kilonmetros = kilonmetros;
        this.añoVehiculo = añoVehiculo;
        this.precioDia = precioDia;
        this.fotos = fotos;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlazas() {
        return plazas;
    }

    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public int getKilonmetros() {
        return kilonmetros;
    }

    public void setKilonmetros(int kilonmetros) {
        this.kilonmetros = kilonmetros;
    }

    public int getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(int añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    public ArrayList<String> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<String> fotos) {
        this.fotos = fotos;
    }
}
