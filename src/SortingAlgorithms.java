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
	
	// Método para escrever no console o array de forma agradável
	public void printArray() {
		System.out.print("[");
		for (int i = 0 ; i < arrayLength()-1 ; i++) {
			System.out.print(this.unsortedArray[i] + " , ");
		}
		System.out.println(this.unsortedArray[arrayLength()-1] + "]");
	}
	
	// Método para salvar o array em uma string
	public String stringArray() {
		String s = "[";
		
		for (int i = 0 ; i < arrayLength()-1 ; i++) {
			s += (this.unsortedArray[i] + " , ");
		}
		s += (this.unsortedArray[arrayLength()-1] + "]");
		
		return s;
	}

}
