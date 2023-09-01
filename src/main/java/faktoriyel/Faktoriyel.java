package faktoriyel;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println( "Lütfen bir sayı giriniz");
        int num = scan.nextInt();
        int faktoriyel =1;

        for (int i = num; i >0; i--) {

            faktoriyel*=i;
        }

        System.out.println("faktoriyel = "+faktoriyel);

    }


}
