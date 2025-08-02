package TwoDArrays;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input rows m
        int m = sc.nextInt();
        //input cols n
        int n = sc.nextInt();
        //matrix of order(mxn)
        int matrix[][] = new int[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                matrix[r][c] = sc.nextInt();
            }
        }

        //initialise four variables
        int sRow = 0;
        int sCol = 0;
        int eRow = m - 1;
        int eCol = n - 1;
        while (eRow >= sRow && eCol >= sCol) {//agr hamari sRow>eRow ho gyi toh duplicate elements print hone lag jayenge...similarly scol ending col se badha nhi hona chahiye

            //reason for equal to-->even mei it doesn't matter but odd rows ya col ke time ek point aisa aayega jab e=s tab agr ye condition nhi hui toh wo row ya colm print hi nhi hoga.
            //top row
            for (int j = sCol; j <= eCol; j++) {
                System.out.println(matrix[sRow][j]);
            }
            sRow++;//hamari starting row neeche jaa rhi hai yaani badh rhi hai


            //right column
            for (int i = sRow ; i <= eRow; i++) {
                System.out.println(matrix[i][eCol]);
            }
            eCol--;


            //bottom row

            for (int j = eCol - 1; j >= sCol; j--) {
                System.out.println(matrix[eRow][j]);
            }
            eRow--;//hamari ending row upar jaa rhi hai yaani ghat rhi hai
            //left column
             for (int i = eRow ; i >= sRow + 1; i--) {
                System.out.println(matrix[i][sCol]);
             sCol++;

            }
        }


    }
}