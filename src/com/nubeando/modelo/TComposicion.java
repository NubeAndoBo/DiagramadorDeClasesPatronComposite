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
public class TComposicion extends TEnlace{

    public TComposicion() {
       super();
        Map map = new Hashtable();
        GraphConstants.setLineBegin(map, GraphConstants.ARROW_NONE);
        GraphConstants.setLineEnd(map, GraphConstants.ARROW_DIAMOND);
        GraphConstants.setEndFill(map,true);
        GraphConstants.setLabelAlongEdge(map, true);
        getAttributes().applyMap(map);
    }
   
}
