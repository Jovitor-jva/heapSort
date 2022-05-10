package ordenanceAlgorithms;
public class heapsort_recursive_implementation {
	public void ordenar(int vetor[]) {
		int n = vetor.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			empilhar(vetor, n, i);
		}
		for (int i = n - 1; i >= 0; i--) {
			int temp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = temp;
			empilhar(vetor, i, 0);
		}
	}
	void empilhar(int vetor[], int n, int i) {
		int maior = i;
		int esquerda = 2 * i + 1;
		int direita = 2 * i + 2;
		if (esquerda < n && vetor[esquerda] > vetor[maior])
			maior = esquerda;
		if (direita < n && vetor[direita] > vetor[maior])
			maior = direita;
		if (maior != i) {
			int trocar = vetor[i];
			vetor[i] = vetor[maior];
			vetor[maior] = trocar;
			empilhar(vetor, n, maior);
		}
	}
	public static void imprimeVetorOrdenado (int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public void empilharLogica (int vetor[], int tamanho, int i) {
		int maior = i, filhoEsquerda = 2 * i + 1, filhoDireita = 
				2 * i + 2;
		if (filhoEsquerda < tamanho && vetor[filhoEsquerda] > vetor[maior])
			maior = filhoEsquerda;
		if (filhoDireita < tamanho && vetor[filhoDireita] > vetor[maior])
			maior = filhoDireita;
		if (maior != i) {
			int swap = vetor[i];
			vetor[i] = vetor[maior];
			vetor[maior] = swap;
			empilhar(vetor, tamanho, maior);
		}
	}

}
