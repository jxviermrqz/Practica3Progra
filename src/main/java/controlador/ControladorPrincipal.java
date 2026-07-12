package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Principal;
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaPrincipal.getBtnRegistrarLote()) {
            
            if (i < 3) {
                
                sectorAlimentos[i] = new SuministroEmergencia(); 
                
                sectorAlimentos[i].registrarLote(vistaPrincipal);
                i++;
                limpiarCamposFormulario();
                
                if (i == 3) {
                    for (int j = 0; j < sectorAlimentos.length; j++) {
                        sectorAlimentos[j].mostrarFichaLogistica();
                    }
                    
                    this.vistaPrincipal.getTxtCantidadLotes().setVisible(true);
                    this.vistaPrincipal.getBtnAceptar().setVisible(true);
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
                    
                    indiceLote++;
                    limpiarCamposFormulario();

                    if (indiceLote == tamañoLote) {
                        for (int j = 0; j < inventarioGeneral.length; j++) {
                            inventarioGeneral[j].mostrarFichaLogistica();
                        }
                        
                        String inputIndice = JOptionPane.showInputDialog(vistaPrincipal, "Seleccione un índice del inventario general (0 a " + (tamañoLote - 1) + "):");
                        if (inputIndice != null && !inputIndice.isEmpty()) {
                            int idx = Integer.parseInt(inputIndice);
                            if (idx >= 0 && idx < inventarioGeneral.length) {
                                inventarioGeneral[idx].alternarEstadoEnvio();
                            }
                        }
                    }
                }
            }
        } else if (e.getSource() == vistaPrincipal.getBtnAceptar()) {
            String entradaCantidad = vistaPrincipal.getTxtCantidadLotes().getText().trim();
            if (!entradaCantidad.isEmpty()) {
                tamañoLote = Integer.parseInt(entradaCantidad);
                inventarioGeneral = new SuministroEmergencia[tamañoLote]; 
                JOptionPane.showMessageDialog(vistaPrincipal, "Inventario General configurado. Registre los lotes.");
            }
        } else if (e.getSource() == vistaPrincipal.getBtnMostrarFichaLote()) {
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