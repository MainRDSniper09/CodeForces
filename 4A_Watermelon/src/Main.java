import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sandia = sc.nextInt();
        if (sandia > 2) {
            if (sandia % 2 == 0) {
                System.out.print("YES");
            } else
                System.out.println("NO");
        }else
            System.out.println("NO");
    }
}