public class SortingTest {
	
	// Algoritmo principal para o teste dos métodos de ordenamento

	public static void main(String[] args) {
		
		int[] array = {3,1,2,5,4,6,8,7};	// criação do array
		int[] array2 = {3,1,2,5,4,6,8,7,27,14};
		
		StraightInsertion sortArray = new StraightInsertion(); // criação de um objeto do tipo StraightInsertion
		ShellSorting sortArray2 = new ShellSorting(); // criação de um objeto do tipo ShellSorting
		
		sortArray.setUnsortedArray(array);
		sortArray2.setUnsortedArray(array2);
		
		System.out.println("IMPLEMENTAÇÃO INICIAL COM NÚMEROS INTEIROS");
		System.out.println("O vetor tem " + sortArray.arrayLength() + " números");
		
		System.out.print("1 - De forma NÃO ORDENADA ele é ");
		sortArray.printUnsortedArray(); // Uma outra forma de mostrar esse vetor é a seguinte
		System.out.println("2 - De forma NÃO ORDENADA ele é " + sortArray2.stringUnsortedArray());
		
		sortArray.sort();
		System.out.println("3 - De forma ORDENADA por StraightInsertion ele é " + sortArray.stringSortedArray());
		
		sortArray2.sort(1);
		System.out.println("4 - De forma ORDENADA por ShellSorting ele é " + sortArray2.stringSortedArray());
		
	}
	
}
