package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class write{
    Scanner scn = new Scanner(System.in);
    public void inputinput(){
        try{

            //Membuat objek dari class File
            //untuk mendapatkan properti dari file terkait
            File myFile =new File("FileRead-Write.txt"); //Hasil dapat dilihat di direktori D: anda dengan judul FileRead-Write.txt

            //Jika myfile.txt tidak ada, maka file baru akan dibuat
            if(!myFile.exists()){
                myFile.createNewFile();
            }

            //Membuat objek printWriter untuk menulis pada konten file
            PrintWriter tulis = new PrintWriter(myFile);
            String input;

            //Menambahkan string pada baris baru
            do {
                System.out.print("Masukan kata/kalimat anda :");
                tulis.println(scn.nextLine());
                System.out.println("Apakah anda ingin memasukan lagi ? (y/n)");
                input = scn.nextLine();
            } while (input.equalsIgnoreCase("y"));

            //Method close() harus dipanggil untuk menutup file untuk menghindari memory leak
            //Jika tidak, maka data mungkin tidak akan tersimpan dengan baik pada file
            tulis.close();

            System.out.println("Data berhasil ditambahkan pada konten file");

        }catch(Exception e){

        }

    }
}
