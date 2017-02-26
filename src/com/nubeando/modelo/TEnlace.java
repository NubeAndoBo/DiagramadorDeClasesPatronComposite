/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubeando.modelo;

import org.jgraph.graph.DefaultEdge;

/**
 *
 * @author Administrador
 */
public class TEnlace extends DefaultEdge implements TComponente {

    private String multiplicidadOrigen = "";
    private String multiplicidadDestino = "";

    public TEnlace() {
        super();
    }

    public String getMultiplicidadDestino() {
        return multiplicidadDestino;
    }

    public void setMultiplicidadDestino(String multiplicidadDestino) {
        this.multiplicidadDestino = multiplicidadDestino;
        setUserObject(toString());
    }

    public String getMultiplicidadOrigen() {
        return multiplicidadOrigen;
    }

    public void setMultiplicidadOrigen(String multiplicidadOrigen) {
        this.multiplicidadOrigen = multiplicidadOrigen;
        setUserObject(toString());
    }

    public void actualizarPintado() {
        TDiagrama.getInstancia().getGraph().getGraphLayoutCache().setVisible(this, false);
        TDiagrama.getInstancia().getGraph().getGraphLayoutCache().setVisible(this, true);
    }

    @Override
    public String toString() {
        if (multiplicidadDestino.trim().length() == 0
                && multiplicidadOrigen.trim().length() == 0) {
            return "";
        }
        int w = 16;//GraphConstants.getSize(getAttributes()).width;
        String space = "";
        for (int i = 0; i < w - 12; i++) {
            space = space + " ";
        }
        return "[" + this.multiplicidadOrigen + "]" + space + " [" + this.multiplicidadDestino + "]";
    }
  
}
