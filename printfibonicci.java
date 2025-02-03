import java.util.Scanner;

public class printfibonicci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int index = 0; index < n; index++) {

            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;

        }
    }
}