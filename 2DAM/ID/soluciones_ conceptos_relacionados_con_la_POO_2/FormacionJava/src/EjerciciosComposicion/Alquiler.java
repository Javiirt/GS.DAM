package EjerciciosComposicion;

public class Alquiler {

	//Atributos
	private Persona cliente;
	private Vehiculo vehiculo;
	private String fechaAlquiler;
	
	//Constructores
	public Alquiler() {
		
	}

	public Alquiler(Alquiler a) {
		this.cliente = a.cliente;
		this.vehiculo = a.vehiculo;
		this.fechaAlquiler = a.fechaAlquiler;
	}
	
	public Alquiler(Persona cliente, Vehiculo vehiculo, String fechaAlquiler) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fechaAlquiler = fechaAlquiler;
	}

	//Getters & setters
	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	
	public void mostrarAlquiler() {
		String datos = "\nPersona: " + cliente +
					 "\nVehículo: " + vehiculo + 
					 "\nFecha alquiler: " + fechaAlquiler;
		System.out.println(datos);
	}
	
}

