package com.nubeando.modelo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
public class TAtributo {

    public static final String PROTECTED = "#";
    public static final String PRIVATE = "-";
    public static final String PUBLIC = "+";
    private String visibilidad;
    private String variable;
    private String tipo;

    public TAtributo() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    @Override
    public String toString() {
        return visibilidad + " " + variable + ":" + tipo;
    }

    public int getIntVisibilidad() {
        if(visibilidad.equals(PRIVATE))
            return 1;
        if(visibilidad.equals(PROTECTED))
            return 2;
        if(visibilidad.equals(PUBLIC))
            return 0;
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
