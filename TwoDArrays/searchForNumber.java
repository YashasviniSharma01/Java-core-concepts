package TwoDArrays;

import java.util.Scanner;

public class searchForNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col= sc.nextInt();
        int [][]number= new int[row][col];
        //input
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j]=sc.nextInt();
            }
        }
        //search
        int num = sc.nextInt();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if (num == number[i][j]) {
                    System.out.println("Number was found as location (" + i + "," + j + ")");
                }
            }
        }
    }
}
