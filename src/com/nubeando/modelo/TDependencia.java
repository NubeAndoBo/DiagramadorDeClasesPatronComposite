/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nubeando.modelo;

import java.util.Hashtable;
import java.util.Map;
import org.jgraph.graph.GraphConstants;

/**
 *
 * @author Administrador
 */
public class TDependencia extends TEnlace{

    public TDependencia() {
        //super(origen,destino);
        Map map = new Hashtable();
        GraphConstants.setLineBegin(map, GraphConstants.ARROW_NONE);
        GraphConstants.setLineEnd(map, GraphConstants.ARROW_SIMPLE);
        GraphConstants.setEndFill(map, true);
        GraphConstants.setLineStyle(map,GraphConstants.STYLE_ORTHOGONAL );
       
        getAttributes().applyMap(map);
    }

}
