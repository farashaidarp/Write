package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //ScannerObjek
        write in = new write(); //InputKataObjek
        cek ip = new cek(); //CekKataObjek
        String inputUlang;

        do{
            //Method InputKata
            in.inputinput();
            System.out.println();

            do{
                //Method CekKata
               ip.cekk();
                System.out.println();
                System.out.println("Apakah anda ingin mengulangi mencari kata ? (y/n)");
                inputUlang = scn.nextLine();

            } while (inputUlang.equals("y"));

            System.out.println();
            System.out.println("Apakah anda ingin mengulangi dari awal ? (y/n)");
            inputUlang = scn.nextLine();

        } while (inputUlang.equalsIgnoreCase("y"));

    }
}
