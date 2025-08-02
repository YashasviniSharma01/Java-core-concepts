package Arrays;
import java.util.*;
//take array as input.Search for a given number n and print it's index
public class SearchForANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //size
        int size= sc.nextInt();
        int numbers[]= new int[size];
        //elements
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        //searchNumber
        int n= sc.nextInt();
        for (int i=0;i<numbers.length; i++){
            if (numbers[i]==n){
                System.out.println(i);
            }
        }
    }
}
