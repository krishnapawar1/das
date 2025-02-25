// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();

//         int nfac = 1;
//         for (int  i = 1; i<= n; i++) {
//             nfac*=i;

//         }
//         int  rfac = 1;
//         for (int i = 1;i<=n-r; i++) {
//             rfac*=i;
//         }
//         int npr = nfac/rfac;
//         System.out.println(n + "p" + r +"=" + npr);
//     }}

// givencode modification

import java.util.Scanner;

public class basic {

    public static void display(int n,int r,int npr) {
        System.out.println(n + "p"+ r+ " =" +npr);
        
    }

    public static int fact(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv = rv * i;

        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfactorial = fact(n);
        int pfactorial = fact(n - r);
        int  npr = nfactorial / pfactorial;
        display(n,r,npr);
    }
}