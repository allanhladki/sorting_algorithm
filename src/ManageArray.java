// Classe criada como composição para impressão ou salvamento do array em string
public class ManageArray {
	
	private int[] array; // Variável que armazena o vetor com os dados númericos;
	
	ManageArray(int[] array){
		this.array = array;
	}
	
	// Método para escrever no console o array de forma agradável
	public void printArray() {
		System.out.print("[");
		for (int i = 0 ; i < this.array.length-1 ; i++) {
			System.out.print(this.array[i] + " , ");
		}
		System.out.println(this.array[this.array.length-1] + "]");
	}
	
	// Método para salvar o array em uma string
	public String stringArray() {
		String s = "[";
		
		for (int i = 0 ; i < this.array.length-1 ; i++) {
			s += (this.array[i] + " , ");
		}
		s += (this.array[this.array.length-1] + "]");
		
		return s;
	}

}
