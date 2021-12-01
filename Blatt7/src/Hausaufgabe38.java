
public class Hausaufgabe38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = genMatrix(5,6);
		
		
		

		matrix = genMatrix(5, 5);
		print2DimArray(matrix);
		generateMeanMat(matrix);

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
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int sum = 0;
				int count = 0;
				//links
				if(i-1 >= 0) {
					sum = sum+mat[i-1][j];
					count ++;
				}
				//oben
				if(j-1 >= 0) {
					sum = sum+mat[i][j-1];
					count++;
				}
				//rechts
				if(i+1 < mat.length) {
					sum = sum+mat[i+1][j];
					count ++;
				}
				//unten
				if(j+1 < mat[0].length) {
					sum = sum+mat[i][j+1];
					count ++;
				}
				//oben-links
				if(i-1 >= 0 && j-1 >= 0) {
					sum = sum+mat[i-1][j-1];
					count ++;
				}
				//oben-rechts
				if(j-1 >= 0 && i+1 < mat.length) {
					sum = sum+mat[i+1][j-1];
					count ++;
				}
				//unten-links
				if(j+1 < mat[0].length && i-1 >= 0) {
					sum = sum+mat[i-1][j+1];
					count ++;
				}
				//unten-rechts
				if(j+1 < mat[0].length && i+1 < mat.length) {
					sum = sum+mat[i+1][j+1];
					count ++;
				}
				count++;
				mat2[i][j] += sum / count;
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
