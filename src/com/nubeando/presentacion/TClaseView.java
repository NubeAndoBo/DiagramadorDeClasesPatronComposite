package com.nubeando.presentacion;

import java.awt.Component;
import com.nubeando.modelo.TClase;
import org.jgraph.JGraph;
import org.jgraph.graph.CellView;
import org.jgraph.graph.CellViewRenderer;
import org.jgraph.graph.VertexRenderer;
import org.jgraph.graph.VertexView;

/**
 *
 * @author Administrador
 */
public class TClaseView extends VertexView {

    private static CompViewRenderer _renderer = new CompViewRenderer();

    private static class CompViewRenderer extends VertexRenderer {

        public CompViewRenderer() {
            super();
        }

        @Override
        public Component getRendererComponent(JGraph jGraph, CellView cellView, boolean selected, boolean focused, boolean preview) {
            PanelClase comp = new PanelClase();
            TClase cell = (TClase) cellView.getCell();
            comp.setCell(cell);
            return comp;
        }
    }

    public TClaseView(Object cell) {
        super(cell);
    }

    @Override
    public CellViewRenderer getRenderer() {
        return _renderer;
    }
}
