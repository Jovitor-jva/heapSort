package ordenanceAlgorithms;

public class heapsort_recursive_main extends heapsort_recursive_implementation{
	public static void main(String args[]) {
	      int arr[] = { 40 , 20, 1 , 10 , 30, 20 , 25, 3 };
	  
	      heapsort_recursive_implementation hs = new heapsort_recursive_implementation();
	      hs.ordenar(arr);
	  
	      System.out.println("Heapsorted ordenation");
	      imprimeVetorOrdenado(arr);
	}
}
