import java.util.*;;

public class printprimeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int index = low; index <= high; index++) {

            int count = 0;
            for (int div = 2; div * div <= index; div++) {
                if (index % div == 0) {

                    count++;
                    break;

                }}
                if (count == 0) {
                    System.out.println(index);
                
            }
        }
    }
}