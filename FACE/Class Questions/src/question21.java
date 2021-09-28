//Pattern Printing
import java.util.Scanner;

public class question21 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        * * *
//        * *
//        *
//        for (int i=3; i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//            *
//          *   *
//        *   *   *
        for (int i=0; i<3; i++)
        {
            for (int j=3-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
