package controlador;

import javax.swing.JFrame;
import vista.*;
import modelo.*;

public class Main {

    public static void main(String[] args) {
        
        SuministroEmergencia reservaInicial = new SuministroEmergencia(); 
        SuministroEmergencia lotePrioritario = new SuministroEmergencia(
            "MED003", "Kits Primeros Auxilios", "Vendas y alcohol", 5.2, true, "Medicina"
        ); 
        
        SuministroEmergencia donacionReciente = new SuministroEmergencia();
        /*
        donacionReciente.setIdLote("DON001");
        donacionReciente.setNombreInsumo("Agua Mineral");
        donacionReciente.setDescripcionUso("Botellas de 1L para consumo inmediato");
        donacionReciente.setPesoKg(14.5);
        donacionReciente.setTipoAyuda("Alimentos");
        donacionReciente.setListoParaEnvio(false);
        */
        donacionReciente.mostrarFichaLogistica();
        
        lotePrioritario.alternarEstadoEnvio(); 
        
        SuministroEmergencia envioInmediato = new SuministroEmergencia(); 
        /*
        envioInmediato.setIdLote("ENV002");
        envioInmediato.setNombreInsumo("Mantas Térmicas");
        envioInmediato.setDescripcionUso("Refugio para damnificados");
        envioInmediato.setPesoKg(22.0);
        envioInmediato.setTipoAyuda("Herramientas");
        envioInmediato.setListoParaEnvio(true);
        */

        SuministroEmergencia pedidoEspecial = new SuministroEmergencia(
            "MED004", "Antibióticos", "Uso hospitalario urgente", 8.5, true, "Medicina"
        ); 
        
        envioInmediato.mostrarFichaLogistica(); 
        pedidoEspecial.mostrarFichaLogistica(); 
        
        envioInmediato = null;
        pedidoEspecial = null;
        
        Login p1 = new Login();
        ControladorLogin controladorLogin = new ControladorLogin(p1);
        
        p1.setVisible(true);
        p1.setLocationRelativeTo(null);
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}