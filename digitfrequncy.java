import java.util.Scanner;

public class digitfrequncy {

    public static int digitfrequncy(int n, int d) {
        int rv = 0;
        while (n > 0) {
            n = n / 10;
            int dig = n%10;

            if (dig == d) {
                rv++;
            }

        }
        return rv;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = digitfrequncy(n, d);
        System.out.println(f);
    }
}


