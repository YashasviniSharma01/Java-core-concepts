package loops.JavaPattern;

import java.util.*;
public class solid_rectangle_pattern {
    public static void main(String[] args) {
 //for(initialisation;condition;updation){}
//        for(int counter=0; counter<100;counter = counter+1){
//            System.out.println("Hello World");
//        }
//        -----print no. from 0 to 10----
//        for(int i=0;i<11;i++){
//            System.out.print(i+" ");
//        }
//===========using while loop==========================
//     int i=0;//initialisation
//     while (i<11){
//         System.out.println(i);
//         i++;
//     }

//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<11);



        //----print sum of first n natural number---
        //if n=4
//        int a=0;
//        int i = 1;
//        do{
//            a=a+i;
//            i++;
//        }while(i<5);
//        System.out.println(a);
// if n is to be taken as input
//        Scanner sc =new Scanner(System.in);
//        int num= sc.nextInt();
//        int a=0;
//        int i = 1;
//        do{
//            a=a+i;
//            i++;
//        }while(i<=num);
//        System.out.println(a);

        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        int i = 1;
        do{
            int product=num*i;
            System.out.println(product);
            i++;
        }while(i<=10);
    }
}
