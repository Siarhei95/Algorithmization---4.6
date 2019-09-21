package Question_6;

import java.util.*;

public class question_6 {
    public static void main(String[] args) {
        question_6 finder = new question_6();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        finder.SearchForPrimeNumbers(a,b,c);

    }

    static int nod1(int b, int c) {
        while (b != 0 && c != 0) {
            int k = c;
            c = b % c;
            b = k;
        }
        return b + c;
    }

    static int nod2(int a, int c) {
        while (a != 0 && c != 0) {
            int z = c;
            c = a % c;
            a = z;
        }
        return a + c;
    }

    static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            int m = b;
            b = a % b;
            a = m;
        }
        return a + b;
    }

    public static void SearchForPrimeNumbers(int a, int b, int c){
        if((nod(a,b)==1)&&((nod1(b,c)==1))&&(nod2(a,c)==1)){
            System.out.println("These numbers are prime: " + a +", "+ b +", "+c);
        }else{
            System.out.println("There are no primes");
        }
    }
}


