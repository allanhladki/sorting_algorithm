//O construtor recebe um booleano
//false ou vazio inicia com o método de tamanho padrão de sublista
//true inicia com o método de Knuth, h = (3^k - 1) / 2


public class ShellSorting extends SortingAlgorithms {
	
	private int[] array;
	
	// method = 0 é o padrão, caso method = 1, tamanhoSublista é dado pelo método de Knuth, h=((3^k)-1)/2
	public void sort(boolean kmethod) {
		this.array = super.getUnsortedArray();
		
		int tamanhoSublista = this.array.length;
		
		tamanhoSublista = getTamanhoSublista(kmethod, tamanhoSublista);
		
		while (tamanhoSublista >= 1){
			
			for (int posicaoInicial = 0; posicaoInicial < tamanhoSublista; posicaoInicial++) {
				gapInsertionSort(this.array, posicaoInicial, tamanhoSublista);
			}
			
			tamanhoSublista = getTamanhoSublista(kmethod, tamanhoSublista);
			
		}
		
		super.setSortedArray(this.array);
	}
	
	public void sort() {
		boolean kmethod = false;
		sort(kmethod);
	}
	
	private int knuthsMethod(int h) {
		Double k = (Math.log( (2*h) + 1)/Math.log(3));
		return k.intValue();
	}
	
	private int getTamanhoSublista(boolean kmethod, int t) {
		if (kmethod == true && t > 1) {
			t = knuthsMethod(t);
			return t;
		}
		return t/2;
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