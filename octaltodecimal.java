import java.util.Scanner;

public class octaltodecimal {
    public static int getdecimal(int n, int b) {
        int sum = 0;
        int i = 0;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            sum += dig * (Math.pow(b, i));
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int decimal = getdecimal(n, b);
        System.out.println(decimal);
    }
}
