package day01;

import java.util.Scanner;

public class IQ2 {
    /*
     * Print prime numbers which are less than the given number
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        printPrime(sayi);

        scan.close();
    }
    private static boolean isPrime(int sayi) {
        if (sayi<=1){
            return false;
        }
        for (int i=2; i<sayi;i++){
            if (sayi%i==0){
                return false;
            }
        }
        return true;
    }

    private static void printPrime(int sayi) {
        for (int i=2; i<sayi;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }


}
