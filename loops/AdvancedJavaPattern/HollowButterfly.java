package loops.AdvancedJavaPattern;

public class HollowButterfly {
    public static void main(String[] args) {
        int n=5;
        //upper wing
        for (int i=1;i<=n;i++){
            //left upper wing
            for (int j=1;j<=i;j++){
                if (i==j|| j==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            //spaces b/w wings
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //right upper wing
            for (int j=i;j>=1;j--){
                if (i==j || j==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower wing
        for (int i=n;i>=1;i--){
            //left lower wing
            for (int j=1;j<=i;j++){
                if (i==j|| j==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            //spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //right lower wing
            for (int j=i;j>=1;j--){
                if (i==j || j==1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
