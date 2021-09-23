import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if(x - (y*12) >0)
            System.out.println("Loss : Rs." + (double)(x - (y*12)));
        else if((y*12)-x >0)
            System.out.println("Gain : Rs." + (double)((y*12)-x));
        else
            System.out.println("Break Even");
    }
}
