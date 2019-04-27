package com.company;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class cek {
        public void cekk(){
            Scanner scn = new Scanner(System.in);
            try{
                FileInputStream fstream = new FileInputStream("FileRead-Write.txt");

                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));

                String cek;
                String cari;

                System.out.print("Masukkan kata yang ingin anda cari jumlahnya : ");
                cari = scn.nextLine();
                int jumlah = 0;   // jumlah kata awal
                int indeks = -1;  // posisi indeks awal

                while ((cek = br.readLine()) != null) {
                    indeks = cek.indexOf(cari);
                    while (indeks >= 0)
                    {
                        ++ jumlah;
                        indeks += cari.length();
                        indeks = cek.indexOf(cari, indeks);
                    }
                }
                System.out.println("Jumlah teks yang berisi kata "+cari+" dalam 1 file ini berjumlah = " + jumlah);

                in.close();
            } catch (Exception e){

            }

        }


}
