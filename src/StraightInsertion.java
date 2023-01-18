
public class StraightInsertion extends SortingAlgorithms {

	private int[] array;
	
	public void sort() {
		
		this.array = super.getUnsortedArray();
		
		for(int i = 1 ; i < this.array.length ; i++) {
			
			int valorAtual = this.array[i];
			int posicao = i;
			
			while (posicao > 0 && this.array[posicao-1] > valorAtual) {
				this.array[posicao] = this.array[posicao-1];
				posicao = posicao - 1;
			}
			
			this.array[posicao] = valorAtual;	
		}
		
		super.setSortedArray(this.array);
	}
	
}