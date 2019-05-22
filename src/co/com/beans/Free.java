package co.com.beans;

import java.util.ArrayList;

public class Free {
	private int id;
    private String nombres;
    private String apellidos;
    private String cargo;
    private ArrayList<Free> Free;

    public Free(int id, String nombres, String apellidos, String cargo, ArrayList<Free> Free) {
        this.setId(id);
        this.setNombres(nombres);
        this.setApellidos(apellidos);
        this.setCargo(cargo);
    }

	public Free(String id, String nombres, String apellidos, String cargo) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public ArrayList<Free> getFree() {
		return Free;
	}

	public void setFree(ArrayList<Free> free) {
		Free = free;
	}
}
