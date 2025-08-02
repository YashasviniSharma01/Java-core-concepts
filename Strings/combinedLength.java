package Strings;

import java.util.Scanner;

public class combinedLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many strings would you liked to add?");
        int size = sc.nextInt();
        String array[]= new String[size];
        int totLength = 0;

        //input strings
        for (int i = 0; i <array.length ; i++) {
            array[i]= sc.next();
            totLength += array[i].length();
        }
        //print length
        System.out.println(totLength);
    }
}
