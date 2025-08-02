package Arrays;

import java.util.Scanner;

public class names {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //size
        int size= sc.nextInt();
        String names[]= new String[size];
        //elements
        for (int i=0;i<size;i++){
            names[i]=sc.next();
        }
        for (int i=0;i<size;i++){
            System.out.println(names[i]);
        }
    }
}
