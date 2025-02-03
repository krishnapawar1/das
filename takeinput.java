import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String name  = sc.nextLine();
        System.out.println("dear " +name +  " 5 6here is counting");
        for (int index = 0; index <= n; index++) {
            System.out.println(index);
        }
    }
}
