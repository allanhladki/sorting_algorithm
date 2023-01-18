public class SortingTest {
	
	// Algoritmo principal para o teste dos métodos de ordenamento

	public static void main(String[] args) {
		
		int[] array = {3,1,2,5,4,6,8,7};	// criação do array
		
		StraightInsertion sortArray = new StraightInsertion(); // criação de um objeto do tipo SortingAlgorithms
		
		sortArray.setUnsortedArray(array);
		
		System.out.println("IMPLEMENTAÇÃO INICIAL COM NÚMEROS INTEIROS");
		System.out.println("O vetor tem " + sortArray.arrayLength() + " números");
		
		System.out.print("1 - De forma NÃO ORDENADA ele é ");
		sortArray.printUnsortedArray(); // Uma outra forma de mostrar esse vetor é a seguinte
		System.out.println("2 - De forma NÃO ORDENADA ele é " + sortArray.stringUnsortedArray());
		
		sortArray.sort();
		System.out.println("3 - De forma ORDENADA ele é " + sortArray.stringSortedArray());
		
	}
	
}
