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
        
        SuministroEmergencia envioInmediato = new SuministroEmergencia(); // [cite: 36]
        envioInmediato.setIdLote("ENV002");
        envioInmediato.setNombreInsumo("Mantas Térmicas");
        envioInmediato.setDescripcionUso("Refugio para damnificados");
        envioInmediato.setPesoKg(22.0);
        envioInmediato.setTipoAyuda("Herramientas");
        envioInmediato.setListoParaEnvio(true);
        
        // Declara e instancia un objeto pedidoEspecial (constructor paramétrico)
        SuministroEmergencia pedidoEspecial = new SuministroEmergencia(
            "MED004", "Antibióticos", "Uso hospitalario urgente", 8.5, true, "Medicina"
        ); // [cite: 36]
        
        // Llama a los métodos de interacción correspondientes
        envioInmediato.mostrarFichaLogistica(); // [cite: 37]
        pedidoEspecial.mostrarFichaLogistica(); // [cite: 37]
        
        // Simulación de liberación de memoria: Asigna explícitamente estas variables a null
        // para romper la referencia en el Stack y permitir que el Garbage Collector libere el Heap
        envioInmediato = null; // [cite: 38]
        pedidoEspecial = null; // [cite: 38]
        
        System.out.println(">> [GC] Referencias del Stack rotas de forma explícita (= null).");
        System.out.println(">> Espacio en el Heap marcado como elegible para el Garbage Collector.\n");
        System.out.println("=================================================");
        System.out.println("=== INICIANDO ENTORNO GRÁFICO (S.O.S. TÁCHIRA) ===");
        System.out.println("=================================================\n");

        // =================================================================
        // APERTURA DEL ENTORNO GRÁFICO (MVC)
        // =================================================================
        Login p1 = new Login();
        ControladorLogin controladorLogin = new ControladorLogin(p1);
        
        p1.setVisible(true);
        p1.setLocationRelativeTo(null);
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}