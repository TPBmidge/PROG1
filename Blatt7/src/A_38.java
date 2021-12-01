package Blatt7;

import static jsTools.Input.*;
import javax.net.ssl.SNIMatcher;

public class A_38 {

	public static void main(String[] args) {
//		int[][] iMatrix = genMatrix(readInt("N: "), readInt("M: "));
		System.out.println();
		int[][]MeanMat = generateMeanMat(genMatrix(5, 5));
		for(int i = 0; i < MeanMat.length; i++) {
			for(int j = 0; j<MeanMat[0].length;j++) {
				System.out.print(MeanMat[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static int[][] genMatrix(int n, int m) {
		int[][] iMatrix = new int[n][m];
		for (int i = 0; i < iMatrix.length; i++) {
			for (int j = 0; j < iMatrix[0].length; j++) {
				if (i == iMatrix.length - 1 || j == iMatrix[0].length - 1) {
					iMatrix[i][j] = 100;
					 System.out.print(iMatrix[i][j]+ "\t");
				} else {
					iMatrix[i][j] = 1;
					 System.out.print(iMatrix[i][j]+ "\t");
				}
			} System.out.println();
		}
		return iMatrix;
	}

	static int getMinValue(int[][] iMat) {
		int iMin = iMat[0][0];
		for (int i = 0; i < iMat.length; i++) {
			for (int j = 0; j < iMat[0].length; j++) {
				if (iMin > iMat[i][j]) {
					iMin = iMat[i][j];
				}
			}
		}
		return iMin;
	}

	static int setMinValue(int[][] mat, int newValue) {
		int iMin = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = mat[0].length; j > 0; j--) {
				if (mat[i][j] == getMinValue(mat)) {
					iMin = getMinValue(mat);
					mat[i][j] = newValue;
				}
			}
		}
		return iMin;
	}

	static int getCount(int[][] iMat, int value) {
		int iCount = 0;
		for (int i = 0; i < iMat.length; i++) {
			for (int j = 0; j < iMat[0].length; j++) {
				if (value == iMat[i][j]) {
					iCount += 1;
				}
			}
		}
		return iCount;
	}

	static int[][] generateMeanMat(int[][] iMat) {
		int[][] iMeanMat = new int[iMat.length][iMat[0].length];
		int iSumme = 0;
		int iCount = 0;
		for (int i = 0; i < iMat.length; i++) {
			for (int j = 0; j < iMat[0].length; j++) {
				if(search(iMat, i - 1, j - 1)!=0) {
					iSumme += search(iMat, i - 1, j - 1);
					iCount += 1;
				}
				if(search(iMat, i - 1, j)!=0) {
					iSumme += search(iMat, i - 1, j);
					iCount += 1;
				}
				if(search(iMat, i - 1, j + 1)!=0) {
					iSumme += search(iMat, i - 1, j + 1);
					iCount += 1;
				}
				if(search(iMat, i, j - 1)!=0) {
					iSumme += search(iMat, i, j - 1);


					iCount += 1;
				}
				if(search(iMat, i, j)!=0) {
					iSumme += search(iMat, i, j);
					iCount += 1;
				}
				if(search(iMat, i, j + 1)!=0) {
					iSumme += search(iMat, i, j + 1);
					iCount += 1;
				}
				if(search(iMat, i + 1, j - 1)!=0) {
					iSumme += search(iMat, i + 1, j - 1);
					iCount += 1;
				}
				if(search(iMat, i + 1, j)!=0) {
					iSumme += search(iMat, i + 1, j);
					iCount += 1;
				}
				if(search(iMat, i + 1, j + 1)!=0) {
					iSumme += search(iMat, i + 1, j + 1);
					iCount += 1;
				}
				iMeanMat[i][j] = iSumme / iCount;
				iSumme = 0;
				iCount = 0;
			}
		}
		return iMeanMat;
	}

	static int search(int[][] matrix, int i, int j) {
		int iSumme = 0;
		int iRow = matrix.length;
		int iCol = matrix[0].length;
		if (i < 0 || j < 0 || i >= iRow || j >= iCol) {
			return 0;
		} else {
			return matrix[i][j];
		}



	}
}
