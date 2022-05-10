package ordenanceAlgorithms;
/*
 * Versão iterativa, método que não chama a si próprio
 */
public class heapsort_interactive_implementation {
	static void heapMaximo(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[(i - 1) / 2]) {
				int j = i;
				while (arr[j] > arr[(j - 1) / 2]) {
					mudarPosicao(arr, j, (j - 1) / 2);
					j = (j - 1) / 2;
				}
			}
		}
	}

	static void heapSort(int vetor[], int n) {
		heapMaximo(vetor, n);
		for (int i = n - 1; i > 0; i--) {
			mudarPosicao(vetor, 0, i);
			int j = 0, indice;
			do {
				indice = (2 * j + 1);
				if (indice < (i - 1) && vetor[indice] < vetor[indice + 1])
					indice++;
				if (indice < i && vetor[j] < vetor[indice])
					mudarPosicao(vetor, j, indice);
				j = indice;

			} while (indice < i);
		}
	}

	public static void mudarPosicao(int[] a, int i, int j) {
		int posicao = a[i];
		a[i] = a[j];
		a[j] = posicao;
	}

	static void imprime(int vetor[]) {
		int n = vetor.length;
		for (int i = 0; i < n; i++)
			System.out.print(vetor[i] + " ");
		System.out.println();
	}

}
/*
 * private static int[] a; private static int n; private static int left;
 * private static int right; private static int largest;
 * 
 * // Build-Heap Function public static void buildheap(int []a){ n=a.length-1;
 * for(int i=n/2;i>=0;i--){ System.out.println(i); maxheap(a,i); } }
 * 
 * // Max-Heap Function public static void maxheap(int[] a, int i){ left=2*i;
 * right=2*i+1; System.out.println(i + " " + left + " " + right); if(left <= n
 * && a[left] > a[i]){ largest=left; } else{ largest=i; }
 * 
 * if(right <= n && a[right] > a[largest]){ largest=right; } if(largest!=i){
 * exchange(i,largest); maxheap(a, largest); } }
 * 
 * // Exchange Function public static void exchange(int i, int j){ int t=a[i];
 * a[i]=a[j]; a[j]=t; }
 * 
 * // Sort Function public static void sort(int []a0){ a=a0; buildheap(a);
 * 
 * for(int i=n;i>0;i--){ exchange(0, i); n=n-1; maxheap(a, 0); } } }
 */

/*
 * void buildMaxHeap(int arr[], int n) { for (int i = 1; i < n; i++) { if
 * (arr[i] > arr[(i - 1) / 2]) { int j = i; while (arr[j] > arr[(j - 1) / 2]) {
 * swap(arr, j, (j - 1) / 2); j = (j - 1) / 2; } } } }
 * 
 * static void heapSort(int arr[], int n) { buildMaxHeap(arr, n);
 * 
 * for (int i = n - 1; i > 0; i--) { int j = 0, index;
 * 
 * do { index = (2 * j + 1); if (index < (i - 1) && arr[index] < arr[index + 1])
 * index++; if (index < i && arr[j] < arr[index]) swap(arr, j, index);
 * 
 * j = index;
 * 
 * } while (index < i); } }
 * 
 * public static void swap(int[] a, int i, int j) { int temp = a[i]; a[i] =
 * a[j]; a[j] = temp; } static void printArray(int arr[]) { int n = arr.length;
 * for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
 * System.out.println(); } }
 */
