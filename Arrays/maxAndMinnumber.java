package Arrays;
import java.util.*;
public class maxAndMinnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int number[]= new int[size];

        for (int i = 0; i <size ; i++) {
            number[i]=sc.nextInt();
        }

        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
//This is like saying:
//“My smallest toy is the biggest thing in the world” (so any toy will be smaller than it)
//“My biggest toy is the tiniest thing in the world” (so any toy will be bigger than it)
        for (int i = 0; i < number.length; i++) {
            if (number[i]>max){
                max=number[i];
            }
            if (number[i]<min){
                min=number[i];
            }
        }
        //Now you're going through all your toys one by one and saying:
        //“Hmm… is this one smaller than the smallest I’ve seen? Then this one is my new smallest!”
        //“Is this one bigger than the biggest I’ve seen? Then this one is my new biggest!”
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

    }
}
