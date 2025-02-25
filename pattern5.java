import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 1; i<=n ; i++) {
            for (int sp = 1; sp<=(n-i); sp++) {
                System.out.print("\t");
            }
            for(int st = 1; st <=(2*i-1); st++) {
                System.out.print("*\t");
            } 
            System.out.println();
        }
        
        for ( int i = n-1; i>=1; i--) {
            for (int sp = 1; sp<=(n-i); sp++) {
                System.out.print("\t");
            }
            for(int st = 1; st <=(2*i-1); st++) {
                System.out.print("*\t");
            } 
            System.out.println();
        }
    }}