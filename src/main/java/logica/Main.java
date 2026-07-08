package logica;

import javax.swing.WindowConstants;
import vista.*;

public class Main {

    public static void main(String[] args) {
        login p1 = new login();
        p1.setVisible(true);
        p1.setLocationRelativeTo(null);
        p1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
}
