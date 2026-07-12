package modelo;
import vista.*;

public class SuministroEmergencia {
    private String idLote;
    private String nombreInsumo;
    private String descripcionUso;
    private double pesoKg;
    private boolean listoParaEnvio;
    private String tipoAyuda;
    
    //Constructores
    
    public SuministroEmergencia() {
        this.idLote = "";
        this.nombreInsumo = "";
        this.descripcionUso = "";
        this.pesoKg = 0.0;
        this.listoParaEnvio = false;
        this.tipoAyuda = "";
    }
    
    public SuministroEmergencia(String idLote, String nombreInsumo, String descripcionUso, double pesoKg, boolean listoParaEnvio, String tipoAyuda) {
        this.idLote = idLote;
        this.nombreInsumo = nombreInsumo;
        this.descripcionUso = descripcionUso;
        this.pesoKg = pesoKg;
        this.listoParaEnvio = listoParaEnvio;
        this.tipoAyuda = tipoAyuda;
    }
    
    //Metodos
    
    public void registrarLote(Principal vistaPrincipal){
        String StringListoParaEnvio = null;
        
        //demas cosas y guardar valores con getText
        
        if (StringListoParaEnvio.equalsIgnoreCase("Si")){
            this.listoParaEnvio=true;
        } else if (StringListoParaEnvio.equalsIgnoreCase("No")){
            this.listoParaEnvio=false;
        }
    }
    
    public void mostrarFichaLogistica(){
        
        //hacer todo jaja hola 
        
    }
    
    public boolean alternarEstadoEnvio(){
        this.listoParaEnvio= !this.listoParaEnvio;
        mostrarFichaLogistica();
        return this.listoParaEnvio;
    }
    
    //Getters y setter

    public String getIdLote() {
        return idLote;
    }

    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }

    public void setDescripcionUso(String descripcionUso) {
        this.descripcionUso = descripcionUso;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public boolean isListoParaEnvio() {
        return listoParaEnvio;
    }

    public void setListoParaEnvio(boolean listoParaEnvio) {
        this.listoParaEnvio = listoParaEnvio;
    }

    public String getTipoAyuda() {
        return tipoAyuda;
    }

    public void setTipoAyuda(String tipoAyuda) {
        this.tipoAyuda = tipoAyuda;
    }
    
    
}