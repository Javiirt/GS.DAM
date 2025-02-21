package EjerciciosHerencia;

public class Producto {

	// Atributos
	private String nombre;
	private double precio;

	// Constructor vacio
	public Producto() {

	}

	// Constructor de copia
	public Producto(Producto prod) {
		nombre = prod.nombre;
		precio = prod.precio;
	}

	//Constructor de parametros
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	/**
	 * Metodo que calcula el importe total de un número de productos que le pasemos, es decir, 
	 * multiplicar el precio del producto por la cantidad de productos pasados. 
	 * 
	 * @param cantidad - cantidad de productos
	 * @return importe total para ese numero de productos
	 */
	public double calcularImporteTotal(int cantidad) {
		double importe = 0;
		
		importe = precio * cantidad;
		
		return importe;
	}
	
}
