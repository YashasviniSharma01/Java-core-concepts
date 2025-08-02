package loops.JavaPattern;

public class hollow_rectangle_pattern {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                if(j==1 || j==m || i==n || i==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    }
}
