

package com.nubeando.modelo;

import java.util.Hashtable;
import java.util.Map;
import org.jgraph.graph.GraphConstants;

/**
 *
 * @author Administrador
 */
public class THerencia extends TEnlace{

    public THerencia() {
        //super(origen,destino);
        Map map = new Hashtable();
        GraphConstants.setLineBegin(map, GraphConstants.ARROW_NONE);
        GraphConstants.setLineEnd(map, GraphConstants.ARROW_TECHNICAL);
        GraphConstants.setLabelAlongEdge(map, true);
        getAttributes().applyMap(map);
    }

}
