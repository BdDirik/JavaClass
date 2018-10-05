// инициализация двухмерного массива.
class Matrix {
	public static void main(String args[]) {
		double m [] [] = {
			{ 0*0, 1*00, 2*00, 3*00 },
			{ 0*1, 1*01, 2*01, 3*01 },
			{ 0*2, 1*02, 2*02, 3*02 },
			{ 0*3, 1*03, 2*03, 3*03 },
		};

		int i, j;
		

		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) 
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
}