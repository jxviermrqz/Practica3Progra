package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.*;

public class ControladorLogin implements ActionListener {
    
    private final Login vistaLogin;
    private final Principal vistaPrincipal;
    public ControladorLogin(Login p1, Principal vistaPrevia) {
        this.vistaLogin = p1;
        this.vistaPrincipal = vistaPrevia; 
        this.vistaLogin.getBtnInicio().addActionListener(this);
        this.vistaLogin.getBtnSalir().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaLogin.getBtnInicio()) {
            comprobarUsuario();
        } else if (e.getSource() == vistaLogin.getBtnSalir()) {
            System.exit(0); 
        } 
    }

    private void comprobarUsuario() {
        String usuario = "admin";
        String contraseña = "123";
        String usuarioIngresado = vistaLogin.getTxtUsuario().getText().trim();
        String contraseñaIngresada = vistaLogin.getTxtContraseña().getText().trim();
        
        if (usuarioIngresado.isEmpty() || contraseñaIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(vistaLogin, 
                    "Complete todos los campos.", 
                    "Campos Vacíos", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (usuarioIngresado.equals(usuario) && contraseñaIngresada.equals(contraseña)) {
            JOptionPane.showMessageDialog(vistaLogin, 
                    "Ingresado con éxito", 
                    "Ingreso", 
                    JOptionPane.INFORMATION_MESSAGE);
            ControladorPrincipal controladorPrincipal = new ControladorPrincipal(vistaPrincipal);
            
            vistaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
            vistaPrincipal.setLocationRelativeTo(null);
            vistaPrincipal.setVisible(true);
            vistaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistaLogin.dispose(); 
        } else {
            JOptionPane.showMessageDialog(vistaLogin, 
                    "Usuario o contraseña incorrectos", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            vistaLogin.getTxtUsuario().setText("");
            vistaLogin.getTxtContraseña().setText("");
            vistaLogin.getTxtUsuario().requestFocusInWindow();
        }
    }
}