public class MultipleTable {
	public static void main(String args[]){
		MultipleTable t = new MultipleTable();
		t.show(9);
	}
	public void show(int a){
		for (int i=1; i<=a; i++){
			for(int j=1; j<=a; j++){
				System.out.print(i*j + "   ");
			}
			System.out.println();
		}
	}
}