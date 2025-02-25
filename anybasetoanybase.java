import java.util.*;

public class anybasetoanybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int f = anytoAny(n, b, b);
        System.out.println(f);
    }

    public static int getValueInDecimal(int n, int b) {
        int rv = 0;

        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;

            p = p * 10;

        }

        return rv;
    }

    public static int getvalueDecimaltoAny(int n, int b) {

        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }

    public static int anytoAny(int n, int b1, int b2) {
        int dec = getValueInDecimal(n, b1);
        int da = getvalueDecimaltoAny(dec, b2);
        return da;
    }
}
