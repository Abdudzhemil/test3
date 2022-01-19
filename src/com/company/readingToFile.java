package com.company;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class readingToFile {
    public static void main(String[] args) throws IOException {

        dddd();

    }
    public static void dddd() throws IOException{

        int num;

        int[] ipSvoy = new int[4];
        System.out.println("kk");
        System.out.println("Vvedite vash IP adress");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            num = scanner.nextInt();
            if (num > 0 && num <= 255) {
                ipSvoy[i] = num;

            } else {
                System.out.println("Недействительный ввод, используйте только числа от 0 до 255.");
                 dddd();
            }
        }
        Scanner cs =new Scanner(System.in);
        System.out.println("Vash IP= " + Arrays.toString(ipSvoy));
        String path = "/Users/Edit/Desktop/blacklist.txt";
        File file = new File(path);
        Scanner scanner1 = new Scanner(file);

        PrintWriter pw = new PrintWriter(file);
        int chet = 0;
        int[] ip1 = new int[4];
        while (scanner1.hasNextLine()) {
            int f=1;
            chet++;
            String line = scanner1.nextLine();
            String[] numbersString = line.split("\\.");
            int counter = 0;
            //System.out.println(Arrays.toString(numbersString));
            for (String number : numbersString) {

                if(f>4){
                   System.out.println(Arrays.toString(numbersString));
                   System.out.println("V chernom sriske ne pravilnoe IP!!!!!");
                    return;
                }
                f++;
                if (Integer.parseInt(number) <= 255 && Integer.parseInt(number) > 0) {

                    ip1[counter++] = Integer.parseInt(number);

                } else {
                    System.out.println("Neverniy IP adress na stroke " + chet);
                    return;
                }


                if (ipSvoy[0] == ip1[0] && ipSvoy[1] == ip1[1] && ipSvoy[2] == ip1[2] && ipSvoy[3] == ip1[3]) {
                    System.out.println("Ip Adres NAHODITSYA V CHERNOM SPISKE!!!!!!!!");
                    System.out.println("Vvesti drugoy IP adress? yes/no");
                    String otvet1 = cs.nextLine();
                    switch (otvet1){
                        case("yes"):dddd();
                        case ("no"):scanner.close();return;
                        default:
                            System.out.println("VVedite pravilniy otvet");
                            System.out.println("Vvesti drugoy IP adress? yes/no");
                            otvet1 = cs.nextLine();
                            switch (otvet1){
                                case("yes"):dddd();
                                case ("no"):scanner.close();break;
                                default:
                                    System.out.println("VVedite pravilniy otvet");


                            }

                    }
               }
            }

        }

        System.out.println("VVVvesti drugoy IP adress? yes/no");
        String otvet1 = cs.nextLine();
        switch (otvet1){
            case("yes"):
                dddd();
            case ("no"):scanner.close();
                return;
            default:
                System.out.println("VVedite pravilniy otvet");
                System.out.println("Vvesti drugoy IP adress? yes/no");
                 otvet1 = cs.nextLine();
                switch (otvet1){
                    case("yes"):dddd();
                    case ("no"):scanner.close();
                        break;
                    default:
                        System.out.println("VVedite pravilniy otvet");System.out.println("Vvesti drugoy IP adress? yes/no");
                        otvet1 = cs.nextLine();
                        switch (otvet1){
                            case("yes"):dddd();
                            case ("no"):scanner.close();break;
                            default:
                                System.out.println("VVedite pravilniy otvet");

                        }

                }

        }



scanner.close();
        pw.close();
    }
}

