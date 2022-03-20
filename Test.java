 import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur

        Scanner input = new Scanner(System.in);
        int sayi, n, k, total, say;
        total = 0;

        do{
            System.out.println("Sayi giriniz : ");
            n = input.nextInt();
            if (n%2 == 0 || n%4 == 0){
                total += n;
            }
        }while( n%2 == 0 && n > 0);

        System.out.println("Toplam : " + total);

    }
}