package controlador;

import javax.swing.JFrame;
import vista.*;
import modelo.*;

public class Main {

    public static void main(String[] args) {
        
        Login p1 = new Login();
        ControladorLogin controladorLogin = new ControladorLogin(p1);
        p1.setVisible(true);
        p1.setLocationRelativeTo(null);
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SuministroEmergencia reservaInicial = new SuministroEmergencia();
        SuministroEmergencia lotePrioritario = new SuministroEmergencia(
                "LOT-001", 
                "Kits Primeros Auxilios", 
                "Vendas y alcohol", 
                5.6, 
                true, 
                "Medicina");
        SuministroEmergencia donacionReciente = new SuministroEmergencia();
        donacionReciente.registrarLote();
        donacionReciente.mostrarFichaLogistica();
        lotePrioritario.alternarEstadoEnvio();
        lotePrioritario.mostrarFichaLogistica();
        
        SuministroEmergencia envioInmediato = new SuministroEmergencia();

        SuministroEmergencia pedidoEspecial = new SuministroEmergencia(
                "LOT-999", 
                "Antibióticos de amplio espectro", 
                "Uso hospitalario urgente", 
                12.4, 
                true, 
                "Medicina"
        );
        
        envioInmediato.registrarLote();
        envioInmediato.mostrarFichaLogistica();
        pedidoEspecial.mostrarFichaLogistica();
        
        envioInmediato = null;
        pedidoEspecial = null;
    }
}
