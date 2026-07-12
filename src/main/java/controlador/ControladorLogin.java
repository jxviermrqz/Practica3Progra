package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.*;

public class ControladorLogin implements ActionListener{
    
    private final Login vistaLogin;
    
    public ControladorLogin(Login p1) {
        this.vistaLogin = p1;
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
        
        if (usuarioIngresado.isEmpty() || contraseñaIngresada.isEmpty()){
            JOptionPane.showMessageDialog(vistaLogin, 
                    "Complete todos los campos.", 
                    "Campos Vacíos", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (usuarioIngresado.equals(usuario) && contraseñaIngresada.equals(contraseña)){
            JOptionPane.showMessageDialog(vistaLogin, 
                    "Ingresado con éxito", 
                    "Ingreso", 
                    JOptionPane.INFORMATION_MESSAGE);
            
            Principal p2 = new Principal();
            
            ControladorPrincipal controladorPrincipal = new ControladorPrincipal(p2);
            
            p2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            p2.setLocationRelativeTo(null);
            p2.setVisible(true);
            p2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
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