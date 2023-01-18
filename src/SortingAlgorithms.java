// Classe mãe que servirá como base na implementação dos algoritmos
public class SortingAlgorithms {
	
	private int[] unsortedArray; // Variável que armazena o vetor com os dados númericos;

	public int[] getArrayEntrada() {
		return this.unsortedArray;
	}

	public void setArrayEntrada(int[] array) {
		this.unsortedArray = array;
	}
	
	public int arrayLength() {
		return this.unsortedArray.length;
	}
	
	// Composição com ManageArray para imprimir string desordenada
	public void printUnsortedArray() {
		ManageArray array = new ManageArray(unsortedArray);
		array.printArray();
	}
	
	// Composição para salvar o array desordenado em uma string
	public String stringUnsortedArray() {
		ManageArray array = new ManageArray(unsortedArray);
		return array.stringArray();
	}

}
