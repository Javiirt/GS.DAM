package EjerciciosComposicion;

public class Persona {
	
	//Atributos
	private String nombreCompleto;
	private String nif;
	private String direccion;
	
	//Getters & setters
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "\n      Nombre: "+ nombreCompleto + "\n      D.N.I: "+ nif + "\n      Direccion:" + direccion;
	}	

}
