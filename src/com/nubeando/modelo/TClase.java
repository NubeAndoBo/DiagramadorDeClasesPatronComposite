/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubeando.modelo;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;

/**
 *
 * @author Administrador
 */
public class TClase extends DefaultGraphCell implements TComponente {

    private String nombre;
    private List<TAtributo> atributos = new ArrayList<TAtributo>();
    private List<TMetodo> metodos = new ArrayList<TMetodo>();

    public TClase(String nombre) {
        super(nombre);
        Map map = new Hashtable();
        GraphConstants.setEditable(map, false);
        this.getAttributes().applyMap(map);
        this.nombre = nombre;
    }

    public List<TAtributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<TAtributo> atributos) {
        this.atributos = atributos;
    }

    public List<TMetodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(List<TMetodo> metodos) {
        this.metodos = metodos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void actualizarPintado() {
        TDiagrama.getInstancia().getGraph().getGraphLayoutCache().setVisible(this, false);
        TDiagrama.getInstancia().getGraph().getGraphLayoutCache().setVisible(this, true);
    }
  
}
