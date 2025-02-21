package EjerciciosGenericos;

public class MetodosGenericosArrays {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("intArray contiene: ");
		mostrarElemenosArray(intArray);
		System.out.println();
		System.out.println(contarElementosArray(intArray));
		System.out.println();

		Double[] dblArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		System.out.println("dblArray contiene: ");
		mostrarElemenosArray(dblArray);
		System.out.println();
		System.out.println(contarElementosArray(dblArray));
		System.out.println();

		Character[] chrArray = { 'A', 'B', 'C', 'D' };
		System.out.println("chrArray contiene: ");
		mostrarElemenosArray(chrArray);
		System.out.println();
		System.out.println(contarElementosArray(chrArray));
		System.out.println();

		String[] nombresArray = { "Juan", "Pedro", "Lola", "Valeria", "Alex", "Erik" };
		System.out.println("nombresArray contiene: ");
		mostrarElemenosArray(nombresArray);
		System.out.println();
		System.out.println(contarElementosArray(nombresArray));
	}

	public static <E> void mostrarElemenosArray(E[] inputArray) {
		for (E elemento : inputArray) {
			System.out.printf("%s, ", elemento);
		}
	}

	public static <T> String contarElementosArray(T[] inputArray) {
		return "El array tiene " + inputArray.length + " elementos.";
	}
}
