package co.com.bussnineslogic;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import co.com.beans.Free;
import co.com.beans.ProgramaFormacion;


public class MainClass {
	
    public static void main(String[] args) {
        ProgramaFormacion programaFormacion = new ProgramaFormacion(); 

      
        Free basesDeDatos = new Free("1", "3 meses", "Bases de datos", "Normalizar bases de datos");

        Free java = new Free("", "3 meses", "Inicio de la programacion con Java", "Conocer los conceptos basicos  de la programacion con Java ");
    

        ArrayList<Free> Free = new ArrayList<Free>();

        Free.add(basesDeDatos); 
        Free.add(java);

        programaFormacion.setFree(Free);

       
        Aprendiz daniel = new Aprendiz(3, "Justin", "Echavarria", "3194758236");
        Aprendiz jonathan = new Aprendiz(2, "Jaime", "Echavarria", "12345678"); 
        Aprendiz esteban = new Aprendiz(1, "Jonathan", "Diosa", "098765432"); 

       

        HashMap<String, Aprendiz> lista = new HashMap<String, Aprendiz>();
        lista.put("roros",esteban);
        lista.put("Diosa",daniel);
        lista.put("Jojo", jonathan);
    
        Ficha adsi = new Ficha("1598765", programaFormacion, lista); 

        JOptionPane.showMessageDialog(null, adsi.getHash().get("roro").getNombres());
        JOptionPane.showMessageDialog(null, adsi.getHash().get("Diosa").getNombres());
        JOptionPane.showMessageDialog(null, adsi.getHash().get("Jojo").getNombres());
        
        for (int i = 0; i < adsi.getProgramaFormacion().getCompetencias().size(); i++) {
        	JOptionPane.showMessageDialog(null,adsi.getProgramaFormacion().getCompetencias().get(i).getNombre());
		}
        
        

     
    }
}
