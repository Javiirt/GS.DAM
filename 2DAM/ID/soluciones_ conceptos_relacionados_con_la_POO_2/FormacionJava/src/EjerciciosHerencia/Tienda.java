package EjerciciosHerencia;

public class Tienda {

	public static void main(String[] args) {
		// Creamos un array de tipo Producto
		Producto[] listaProductos = new Producto[5];

		// Creamos las instancias de los tipos de producto Perecedero y NoPerecedero
		Perecedero yogurt = new Perecedero();
		yogurt.setNombre("Yogurt");
		yogurt.setPrecio(0.50);
		yogurt.setDiasACaducar(1);
		Perecedero leche = new Perecedero("Leche", 1.20, 2);
		Perecedero queso = new Perecedero("Queso", 5.70, 25);

		NoPerecedero esponja = new NoPerecedero("Esponja", 0.90, "Limpieza & hogar");
		NoPerecedero jabon = new NoPerecedero("Jabon", 1.90, "Limpieza & hogar");

		// Guardamos las instancias en el array
		listaProductos[0] = yogurt;
		listaProductos[1] = leche;
		listaProductos[2] = queso;
		listaProductos[3] = esponja;
		listaProductos[4] = jabon;
		
		//Creamos una variable para ir sumando el precio total de todos los productos
		double precioTotal = 0;
		
		//Ahora vamos a calcular el precio para todos los productos del array usando el método calcularImporteTotal, 
		//donde la cantidad de productos será 2. Y además, iremos mostrando la información del producto junto el precio total calculado.
		for (Producto producto : listaProductos) {
			System.out.println(producto);
			System.out.println("Precio: " + producto.calcularImporteTotal(2));
			precioTotal = precioTotal + producto.calcularImporteTotal(2);
		}
		System.out.println();
		
		//Por último, debemos mostrar el precio total de todos los productos, es decir, 
		//la suma de todos los precios calculados anteriormente.
		System.out.println("El precio total de todos los productos es " + precioTotal);
		
	}

}
