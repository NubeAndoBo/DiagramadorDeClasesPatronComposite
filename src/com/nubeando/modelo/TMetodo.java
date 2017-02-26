package com.nubeando.modelo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
public class TMetodo {

    public static final String PROTECTED = "#";
    public static final String PRIVATE = "-";
    public static final String PUBLIC = "+";
    public static final String VOID = "void";
    private String visibilidad;
    private String nombre;
    private String parametros;
    private String retorno;

    public TMetodo() {
        retorno = VOID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    @Override
    public String toString() {
        return visibilidad + " " + nombre + "(" + parametros + "):" + retorno;
    }

    public int getIntVisibilidad() {
        if (visibilidad.equals(PRIVATE)) {
            return 1;
        }
        if (visibilidad.equals(PROTECTED)) {
            return 2;
        }
        if (visibilidad.equals(PUBLIC)) {
            return 0;
        }
        return 3;
    }

    public void setIntVisibilidad(int n) {
        switch (n) {
            case 0:
                setVisibilidad(PUBLIC);
                break;
            case 1:
                setVisibilidad(PRIVATE);
                break;
            case 2:
                setVisibilidad(PROTECTED);
                break;
            default:
                setVisibilidad("?");
        }
    }
}
