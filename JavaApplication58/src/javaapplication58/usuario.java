/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

import java.util.Date;

/**
 *
 * @author ricky
 */
public class usuario {
    private String usuario;
    private String contra;
    private Date fecha_nacimineto;
    private int numero_telef;
    private String correo;
    private String nombre;
    private String genero_lect;

    public usuario() {
    }

    public usuario(String usuario, String contra, Date fecha_nacimineto, int numero_telef, String correo, String nombre, String genero_lect) {
        this.usuario = usuario;
        this.contra = contra;
        this.fecha_nacimineto = fecha_nacimineto;
        this.numero_telef = numero_telef;
        this.correo = correo;
        this.nombre = nombre;
        this.genero_lect = genero_lect;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha_nacimineto() {
        return fecha_nacimineto;
    }

    public void setFecha_nacimineto(Date fecha_nacimineto) {
        this.fecha_nacimineto = fecha_nacimineto;
    }

    public int getNumero_telef() {
        return numero_telef;
    }

    public void setNumero_telef(int numero_telef) {
        this.numero_telef = numero_telef;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero_lect() {
        return genero_lect;
    }

    public void setGenero_lect(String genero_lect) {
        this.genero_lect = genero_lect;
    }

    @Override
    public String toString() {
        return "usuario{" + "usuario=" + usuario + ", contra=" + contra + ", fecha_nacimineto=" + fecha_nacimineto + ", numero_telef=" + numero_telef + ", correo=" + correo + ", nombre=" + nombre + ", genero_lect=" + genero_lect + '}';
    }
    
    
}
