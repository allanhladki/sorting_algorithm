import java.util.Random;

public class SortingTest {
	
	// Algoritmo principal para o teste dos métodos de ordenamento

	public static void main(String[] args) {
		
		
		Random random = new Random(1540);
		
		//int[] array = {3,1,2,5,4,6,8,7};

		int[] array2 = new int[1000000];
		
		for(int i = 0 ; i <1000000; i++) {
			array2[i] = random.nextInt(999999);
		}
		
		//StraightInsertion sortArray = new StraightInsertion(); // criação de um objeto do tipo StraightInsertion
		StraightInsertion sortArray2 = new StraightInsertion(); // criação de um objeto do tipo ShellSorting
		
		//sortArray.setUnsortedArray(array);
		sortArray2.setUnsortedArray(array2);
		
		//System.out.println("IMPLEMENTAÇÃO INICIAL COM NÚMEROS INTEIROS");
		//System.out.println("O vetor tem " + sortArray.arrayLength() + " números");
		
		//System.out.print("1 - De forma NÃO ORDENADA ele é ");
		//sortArray.printUnsortedArray(); // Uma outra forma de mostrar esse vetor é a seguinte
		//System.out.println("2 - De forma NÃO ORDENADA ele é " + sortArray2.stringUnsortedArray());
		
		//sortArray.sort();
		//System.out.println("1 - De forma ORDENADA por StraightInsertion ele é " + sortArray.stringSortedArray());
		
		long tempoInicial = System.currentTimeMillis();
		
		sortArray2.sort();
		//System.out.println("2 - De forma ORDENADA por ShellSorting ele é " + sortArray2.stringSortedArray());
		
		long tempoFinal = System.currentTimeMillis();
		 
		System.out.println("Tempo de execucação: " + (tempoFinal - tempoInicial) + "ms");
		
	}
	
}
