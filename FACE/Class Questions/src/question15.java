import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e'||ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else if(ch >= 97 && ch <= 122){
            System.out.println("Consonent");
        }
        else
            System.out.println("Not an alphabet");
    }
}
