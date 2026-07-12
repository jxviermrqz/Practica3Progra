package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.*;
import modelo.SuministroEmergencia;

public class ControladorPrincipal implements ActionListener {

    private final Principal vistaPrincipal;
    private SuministroEmergencia[] sectorAlimentos = new SuministroEmergencia[3];
    private int i = 0; 
    private SuministroEmergencia[] inventarioGeneral;
    private int tamañoLote = 0;
    private int indiceLote = 0;

    public ControladorPrincipal(Principal vista) {
        this.vistaPrincipal = vista; 
        
        this.vistaPrincipal.getBtnRegistrarLote().addActionListener(this);
        this.vistaPrincipal.getBtnMostrarFichaLote().addActionListener(this);
        this.vistaPrincipal.getBtnAceptar().addActionListener(this);
        
        this.vistaPrincipal.getTxtCantidadLotes().setVisible(false);
        this.vistaPrincipal.getBtnAceptar().setVisible(false);
        this.vistaPrincipal.getTextoCantidad().setVisible(false);
        this.vistaPrincipal.getTituloCantidad().setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaPrincipal.getBtnRegistrarLote()) {
            if (i < 3) {
                sectorAlimentos[i] = new SuministroEmergencia(); 
                sectorAlimentos[i].registrarLote(vistaPrincipal);
                sectorAlimentos[i].mostrarFichaLogistica(vistaPrincipal);
                
                i++;
                limpiarCamposFormulario();
                
                if (i == 3) {
                    JOptionPane.showMessageDialog(vistaPrincipal, "Sector Alimentos completado. Configure el Inventario General.");
                    
                    this.vistaPrincipal.getTxtCantidadLotes().setVisible(true);
                    this.vistaPrincipal.getBtnAceptar().setVisible(true);
                    this.vistaPrincipal.getTextoCantidad().setVisible(true);
                    this.vistaPrincipal.getTituloCantidad().setVisible(true);
                    this.vistaPrincipal.getTxtCantidadLotes().requestFocusInWindow();
                }
            } 
            else {
                if (inventarioGeneral == null) {
                    JOptionPane.showMessageDialog(vistaPrincipal, "Defina la cantidad de lotes y presione ACEPTAR.");
                    return;
                } 

                if (indiceLote < tamañoLote) {
                    inventarioGeneral[indiceLote] = new SuministroEmergencia();
                    inventarioGeneral[indiceLote].registrarLote(vistaPrincipal);
                    inventarioGeneral[indiceLote].mostrarFichaLogistica(vistaPrincipal);
                    
                    indiceLote++;
                    limpiarCamposFormulario();
                    if (indiceLote == tamañoLote) {
                        JOptionPane.showMessageDialog(vistaPrincipal, "Jornada de Inventario General Completada");
                        vistaPrincipal.getTxtIdLote().setVisible(false);
                        vistaPrincipal.getTxtNombreInsumo().setVisible(false);
                        vistaPrincipal.getTxtDescripcionUso().setVisible(false);
                        vistaPrincipal.getTxtTipoAyuda().setVisible(false);
                        vistaPrincipal.getTxtPesoKg().setVisible(false);
                        vistaPrincipal.getTxtListoParaEnvio().setVisible(false);
                        vistaPrincipal.getBtnRegistrarLote().setVisible(false);
                        vistaPrincipal.getBtnMostrarFichaLote().setVisible(true);
                        
                        JOptionPane.showMessageDialog(vistaPrincipal, "Seleccione cualquier fila en la tabla y presione 'Alternar Envío' para modificarla.");
                        return;
                    }
                }
                vistaPrincipal.txtIdLote.requestFocusInWindow();
            }
        } 
        
        else if (e.getSource() == vistaPrincipal.getBtnAceptar()) {
            String entradaCantidad = vistaPrincipal.getTxtCantidadLotes().getText().trim();
            if (!entradaCantidad.isEmpty()) {
                try {
                    tamañoLote = Integer.parseInt(entradaCantidad);
                    inventarioGeneral = new SuministroEmergencia[tamañoLote]; 
                    JOptionPane.showMessageDialog(vistaPrincipal, "Inventario General configurado. Registre los lotes.");
                    
                    this.vistaPrincipal.getTxtCantidadLotes().setVisible(false);
                    this.vistaPrincipal.getBtnAceptar().setVisible(false);
                    this.vistaPrincipal.getTextoCantidad().setVisible(false);
                    this.vistaPrincipal.getTituloCantidad().setVisible(false);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(vistaPrincipal, "Ingrese un número entero válido.");
                }
            }
            vistaPrincipal.txtIdLote.requestFocusInWindow();
        } 
        else if (e.getSource() == vistaPrincipal.getBtnMostrarFichaLote()) {
            int filaSeleccionada = vistaPrincipal.getTablaReporte().getSelectedRow();
            
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(vistaPrincipal, "Por favor, seleccione una fila de la tabla primero.");
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) vistaPrincipal.getTablaReporte().getModel();
            String nuevoEstadoTexto = "";
            boolean ejecutado = false;
            if (filaSeleccionada < 4) {
                String id = (String) model.getValueAt(filaSeleccionada, 0);
                String nombre = (String) model.getValueAt(filaSeleccionada, 1);
                String desc = (String) model.getValueAt(filaSeleccionada, 2);
                String tipo = (String) model.getValueAt(filaSeleccionada, 3);
                double peso = (double) model.getValueAt(filaSeleccionada, 4);
                String estadoStr = (String) model.getValueAt(filaSeleccionada, 5);
                boolean estadoActual = estadoStr.equalsIgnoreCase("si");
                
                SuministroEmergencia temporalMain = new SuministroEmergencia(id, nombre, desc, peso, estadoActual, tipo);
                temporalMain.setListoParaEnvio(!temporalMain.isListoParaEnvio()); 
                nuevoEstadoTexto = temporalMain.isListoParaEnvio() ? "si" : "no";
                
                ejecutado = true;
            } 
            else if (filaSeleccionada >= 4 && filaSeleccionada < 7) {
                int indiceSectorFijo = filaSeleccionada - 4;
                
                if (sectorAlimentos[indiceSectorFijo] != null) {
                    sectorAlimentos[indiceSectorFijo].setListoParaEnvio(!sectorAlimentos[indiceSectorFijo].isListoParaEnvio());
                    nuevoEstadoTexto = sectorAlimentos[indiceSectorFijo].isListoParaEnvio() ? "si" : "no";
                    ejecutado = true;
                }
            } 
            else {
                if (inventarioGeneral != null) {
                    int indiceDinamicoActual = filaSeleccionada - 7;
                    
                    if (indiceDinamicoActual < inventarioGeneral.length && inventarioGeneral[indiceDinamicoActual] != null) {
                        inventarioGeneral[indiceDinamicoActual].setListoParaEnvio(!inventarioGeneral[indiceDinamicoActual].isListoParaEnvio());
                        nuevoEstadoTexto = inventarioGeneral[indiceDinamicoActual].isListoParaEnvio() ? "si" : "no";
                        
                        ejecutado = true;
                    }
                }
            }
            if (ejecutado) {
                model.setValueAt(nuevoEstadoTexto, filaSeleccionada, 5); 
            }
        }
    }

    private void limpiarCamposFormulario() {
        vistaPrincipal.getTxtIdLote().setText("");
        vistaPrincipal.getTxtNombreInsumo().setText("");
        vistaPrincipal.getTxtDescripcionUso().setText("");
        vistaPrincipal.getTxtTipoAyuda().setText("");
        vistaPrincipal.getTxtPesoKg().setText("");
        vistaPrincipal.getTxtListoParaEnvio().setText("");
    }
}