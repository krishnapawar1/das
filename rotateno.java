import java.util.Scanner;

public class rotateno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;

        }

        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }
        int div = 0;
        int mult = 0;
        for (int index = 0; index <= nod; index++) {
            if (index <= k) {
                div = div * 10;

            } else {
                mult = mult * 10;
            }
        }
        int q = n / div;
        int r = n % div;
        int rotate = r * mult + q;
        System.out.println(rotate);

    }
}
