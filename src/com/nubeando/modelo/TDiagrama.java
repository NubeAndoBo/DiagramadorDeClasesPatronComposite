package com.nubeando.modelo;

import java.awt.Color;
import org.jgraph.JGraph;
import org.jgraph.graph.CellView;
import org.jgraph.graph.DefaultGraphModel;

public class TDiagrama implements TComponente {

    private DefaultGraphModel model;
    private JGraph graph;
    private static TDiagrama diagrama = new TDiagrama();

    private TDiagrama() {
        model = new DefaultGraphModel();
        graph = new JGraph(model);
        initGraph();
    }    

    public static TDiagrama getInstancia() {
        return diagrama;
    }

    private void initGraph() {
        graph.setGridColor(Color.BLUE);
        graph.setGridSize(20);
        graph.setGridEnabled(true);
        graph.setGridVisible(true);
        graph.setHandleColor(Color.GREEN);
        graph.setSelectionEnabled(true);
    }

    public JGraph getGraph() {
        return graph;
    }

    public void setGraph(JGraph graph) {
        this.graph = graph;
        initGraph();
    }

    public void actualizarPintado() {
        CellView cells[] = graph.getGraphLayoutCache().getAllViews();
        for (int i = 0; i < cells.length; i++) {
            CellView cellView = cells[i];
            Object o = cellView.getCell();
            if (o != null && o instanceof TComponente) {
                ((TComponente) o).actualizarPintado();
            }
        }
    }

   
}
