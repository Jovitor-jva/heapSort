package ordenanceAlgorithms;

public class heapsort_interactive_main extends heapsort_interactive_implementation {
	public static void main(String args[]) {

		int vetor[] = { 10, 20, 15, 17, 9, 21 };
		int n = vetor.length;

		System.out.print("Números dados de entrada: ");
		imprime(vetor);

		heapSort(vetor, n);
		System.out.print("-----------------");
		System.out.print("\n");
		System.out.print("Números ordenados: ");

		imprime(vetor);
	}
}
