// Classe mãe que servirá como base na implementação dos algoritmos
public class SortingAlgorithms {
	
	private int[] unsortedArray; // Variável que armazena o vetor com os dados númericos;
	private int[] sortedArray; // Variávle que armazena o vetor ordenado;s

	public int[] getUnsortedArray() {
		return this.unsortedArray;
	}
	
	public int[] getSortedArray() {
		return this.sortedArray;
	}

	public void setUnsortedArray(int[] array) {
		this.unsortedArray = array;
	}
	
	protected void setSortedArray(int[] array) {
		this.sortedArray = array;
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
	
	// Composição com ManageArray para imprimir string ordenada
	public void printSortedArray() {
		ManageArray array = new ManageArray(sortedArray);
		array.printArray();
	}
		
	// Composição para salvar o array sordenado em uma string
	public String stringSortedArray() {
		ManageArray array = new ManageArray(sortedArray);
		return array.stringArray();
	}

}
