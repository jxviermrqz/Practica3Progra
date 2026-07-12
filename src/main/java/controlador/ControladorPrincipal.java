package controlador;

import java.awt.event.*;
import vista.*;

public class ControladorPrincipal implements ActionListener{

    private final Principal vistaPrincipal;

    public ControladorPrincipal() {
        this.vistaPrincipal = null;
        this.vistaPrincipal.getBtnAceptar().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //hacer if por botones y llamar las funciones
    }
    
    //metodo salir
    //metodo mostrar ficha creo que se hace directo del if o despues del coso
    //metodo registrar que llama el registrar de la clase
    //hcer I global y do whiles otro con if y axuiliares para la ultima parte
    //estoy cansado no he hecho nada pero mañana en un momento se hace esto es muy rapido creo que no hace falta nada mas
    //si comente cosas es para que no se me olvide que pense hoy pero seguro mañana cambio toda mi logica
    //ver como hacer el alternar por numero de lote
}
