package com.company;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ipAdress  {
    public static void main() throws FileNotFoundException {


        int num;
        int[] ipSvoy = new int[4];
        System.out.println("Vvedite vash IP adress");
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<4; i++){
        num = scanner.nextInt();
        if (num > 0 && num <= 255) {
            ipSvoy[i]=num;

        } else {
            System.out.println("Недействительный ввод, используйте только числа от 0 до 255.");
            return;
        }
        }
        System.out.println("Vash IP= "+Arrays.toString(ipSvoy));


    }
}
 class ip{
    public int ipvoy;

    public ip () {


    }

}


