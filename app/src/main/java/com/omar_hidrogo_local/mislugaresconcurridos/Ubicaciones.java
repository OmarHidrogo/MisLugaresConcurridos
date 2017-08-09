package com.omar_hidrogo_local.mislugaresconcurridos;

/**
 * Created by tmhidrooma on 09/08/2017.
 */

public class Ubicaciones {

    private String nombre;
    private double lat;
    private double lng;
    private String title;
    private String msj;

    public Ubicaciones(String nombre, double lat, double lng, String title, String msj) {
        this.nombre = nombre;
        this.lat = lat;
        this.lng = lng;
        this.title = title;
        this.msj = msj;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
}
