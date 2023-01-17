public class SortingTest {
	
	// Algoritmo principal para o teste dos métodos de ordenamento

	public static void main(String[] args) {
		
		int[] array = {3,1,2,5,4,6,8,7};	// criação do array
		
		SortingAlgorithms sortArray = new SortingAlgorithms(); // criação de um objeto do tipo SortingAlgorithms
		
		sortArray.setArrayEntrada(array);
		
		System.out.println("IMPLEMENTAÇÃO INICIAL COM NÚMEROS INTEIROS");
		System.out.println("O vetor tem " + sortArray.arrayLength() + " números");
		System.out.print("1 - De forma não ordenada ele é ");
		sortArray.printArray(); // Uma outra forma de mostrar esse vetor é a seguinte
		System.out.print("2 - De forma não ordenada ele é " + sortArray.stringArray());
		
	}
	
}
