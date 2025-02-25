import java.util.Scanner;

public class benjaminbyuls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int index = 0; index * index<=n; index++) {
            System.out.println(index*index);
        }
        }
}
