
public class ShellSorting extends SortingAlgorithms {
	
	private int[] array;
	
	// method = 0 é o padrão, caso method = 1, tamanhoSublista é dado pelo método de Knuth, h=((3^k)-1)/2
	public void sort(int method) {
		this.array = super.getUnsortedArray();
		
		int tamanhoSublista = this.array.length;
		
		while(tamanhoSublista >= 1) {
			if (method == 0) {
				tamanhoSublista /= 2;
			} else if (method == 1) {
				tamanhoSublista = knuthsMethod(tamanhoSublista);
			}
			
			for (int posicaoInicial = 0; posicaoInicial < tamanhoSublista; posicaoInicial++) {
				gapInsertionSort(this.array, posicaoInicial, tamanhoSublista);
			}
			
		}
		
		super.setSortedArray(this.array);
	}
	
	private int knuthsMethod(int tamanhoSublista) {
		return (3^( tamanhoSublista ) - 1) / 2;
	}
	
	
	private void gapInsertionSort(int[] array, int posicaoInicial, int gap) {
		for(int i = gap; i < array.length; i+=gap) {
			
			int valorAtual = array[i];
			int posicao = i;
			
			while (posicao >= gap && array[posicao-gap] > valorAtual) {
				array[posicao] = array[posicao-gap];
				posicao = posicao - gap;
			}
			
			array[posicao] = valorAtual;
		}
		
	}
	

}