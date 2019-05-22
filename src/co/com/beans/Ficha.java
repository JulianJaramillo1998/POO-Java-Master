package co.com.beans;

import java.util.ArrayList;
import java.util.HashMap;


public class Ficha {
    private String id;
    private ProgramaFormacion programaFormacion;
    private HashMap<String, Aprendiz> hash = new HashMap<String, Aprendiz>();

    public Ficha(String id, ProgramaFormacion programaFormacion, HashMap<String, Aprendiz> ap) {
        this.id = id;
        this.programaFormacion = programaFormacion;
        this.hash = ap;
    }
    
    
     public HashMap<String, Aprendiz> getHash() {
		return hash;
	}


	public void setHash(HashMap<String, Aprendiz> hash) {
		this.hash = hash;
	}


	public Ficha() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProgramaFormacion getProgramaFormacion() {
        return programaFormacion;
    }

    public void setProgramaFormacion(ProgramaFormacion programaFormacion) {
        this.programaFormacion = programaFormacion;
    }

}
