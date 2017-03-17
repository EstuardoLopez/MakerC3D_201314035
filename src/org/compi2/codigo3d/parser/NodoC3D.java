package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 * 
 */
public class NodoC3D {
    private String cad;
    private String etqV;
    private String etqF;

    public NodoC3D(String cad) {
        this.cad = cad;
        etqV = "";
        etqF = "";
    }
    
    public NodoC3D(String cad, String etqV, String etqF){
        this.cad = cad;
        this.etqV = etqV;
        this.etqF = etqF;
    }   
    
    public String getCad(){
        return cad;
    }

    public String getEtqV() {
        return etqV;
    }

    public void setEtqV(String etqV) {
        this.etqV = etqV;
    }

    public String getEtqF() {
        return etqF;
    }

    public void setEtqF(String etqF) {
        this.etqF = etqF;
    }
    
        
}
