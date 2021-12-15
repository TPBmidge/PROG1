
public class Hausaufgabe37 {

	public static void main(String[] args) {
		long[][] matrix = get2DimArr(4);
		print2DimArray(matrix);

		

	}
	
	static long[][] get2DimArr(final int n) {
		long[][] m = new long[n][n];
		for (int i = 0; i < m.length; i++) {
			m[i][0] = 1;
			m[0][i] = 1;
			for (int j = 0; j < m[i].length; j++) {
				if(i>0 && j>0) {
					m[i][j] = (m[i-1][j])+(m[i][j-1]);
				}
				
			}
		}
		return m;
	}
	
	static void print2DimArray(long[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Array["+i+"]["+j+"]: "+ m[i][j]);
			}
		}
	}
	


}
