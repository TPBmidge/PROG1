
public class Hausaufgabe38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = genMatrix(5,6);
		
		System.out.println(getMinValue(matrix));
		
		setMinValue(matrix, 33);
		print2DimArray(matrix);

	}
	
	static int[][] genMatrix(int n, int m){
		int[][] matrix = new int[n][m];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(j+1==matrix[i].length || i+1==matrix.length) {
					matrix[i][j] = 100;
				}else {
					matrix[i][j] = 1;
				}
			}
		}
		return matrix;
	}
	
	static int getMinValue(int[][] mat) {
		return Hausaufgabe36.getMin(mat);
	}
	
	static int [][] generateMeanMat(int[][] mat){
		int[][] mat2 = new int[mat.length][mat[0].length];
		
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				//ecke links oben
				if(i == 0 && j == 0) {
					
				}
				//ecke links unten
				else if(i == mat.length && j == 0) {
					
				}
				//ecke rechts oben
				else if(i == 0 && j == mat[i].length-1) {
					
				}
				//ecke rechts unten
				else if(i == mat.length-1 && j == mat[i].length-1) {
					
				}
				//erste Zeile
				else if(i == 0) {
					
				}
				//letzte Zeile
				else if(i == mat.length-1) {
					
				}
				//erste Spalte
				else if(j == 0) {
					
				}
				//letzte Spalte
				else if(j == mat[i].length-1) {
					
				}
				//mittel
				
				
				
				
				//mat2[i][j] = mat[i][j]+mat[i][j]+mat[i][j]+mat[i][j]+mat[i][j]+mat[i][j]+mat[i][j]+mat[i][j]+mat[i][j];
			}
		}
		return mat2;
	}
	
	static int getCount(int[][] mat, int value) {
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]==value)
					count++;
			}
		}
		return count;
	}
	
	static int setMinValue(int[][] mat, int newValue) {
		int min = getMinValue(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = mat[i].length-1; j >= 0; j--) {
				if(mat[i][j] == min) {
					mat[i][j] = newValue;
					return min;
				}
			}
		}
		return min;
	}
	
	static void print2DimArray(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Array["+i+"]["+j+"]: "+ m[i][j]);
			}
		}
	}

}
