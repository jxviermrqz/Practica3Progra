package controlador;

import javax.swing.JFrame;
import vista.*;

public class Main {

    public static void main(String[] args) {
        
        Login p1 = new Login();
        ControladorLogin controladorLogin = new ControladorLogin(p1);
        p1.setVisible(true);
        p1.setLocationRelativeTo(null);
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
