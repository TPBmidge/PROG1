import static jsTools.Input.*;

public class Hausaufgabe36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix;
		matrix = new int[3][4];
		fill2DimArray(matrix);
		System.out.println("Min value: " + getMin(matrix));
		System.out.println("Index: " + getFirstMinIndex(matrix, getMin(matrix)));
		System.out.println("Index: " + getLastMinIndex(matrix, getMin(matrix)));
		
	}
	
	static void fill2DimArray(int[][] matrix) {
		//C:\Users\Manu\eclipse-workspace\Blatt7\src\input.txt | java C:\Users\Manu\eclipse-workspace\Blatt7\src\Hausaufgabe36.java
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] =readInt("matrix["+i+"]["+j+"]: ");
			}
		}
	}
	
	static String getFirstMinIndex(int[][] matrix, int min){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j]==min) {
					return "["+i+"]["+j+"]";
				}
			}
		}
		return "";
	}
	
	static String getLastMinIndex(int[][] matrix, int min){
		String index = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j]==min) {
					index = "["+i+"]["+j+"]";
				}
			}
		}
		return index;
	}
	
	public static int getMin(int[][] matrix) {
		int min = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(min == 0 || matrix[i][j]<min) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

}
