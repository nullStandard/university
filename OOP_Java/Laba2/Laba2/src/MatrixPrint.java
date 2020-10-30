
public class MatrixPrint {
	 public static void main(String args[]){
		   String matrixA[][];
		   matrixA = new String[5][5];
		   
		   matrixA[0][0] = " *";
		   matrixA[0][1] = " 2";
		   matrixA[0][2] = " 3";
		   matrixA[0][3] = " 4";
		   matrixA[0][4] = " *";
		   matrixA[1][0] = " 6";
		   matrixA[1][1] = " *";
		   matrixA[1][2] = " 8";
		   matrixA[1][3] = " *";
		   matrixA[1][4] = "10";
		   matrixA[2][0] = "11";
		   matrixA[2][1] = "12";
		   matrixA[2][2] = " *";
		   matrixA[2][3] = "14";
		   matrixA[2][4] = "15";
		   matrixA[3][0] = "16";
		   matrixA[3][1] = " *";
		   matrixA[3][2] = "18";
		   matrixA[3][3] = " *";
		   matrixA[3][4] = "20";
		   matrixA[4][0] = " *";
		   matrixA[4][1] = "22";
		   matrixA[4][2] = "23";
		   matrixA[4][3] = "24";
		   matrixA[4][4] = " *";
		   for (int i = 0; i < 5; i++) {
		                     for (int j = 0; j < 5; j++) {
		                      System.out.print(matrixA[i][j] + " ");
		                     }
		                     System.out.println();
		                 }
		 }

}
