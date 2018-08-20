/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biodata;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Biodata {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama, tempat, jenis, alamat, motto, tanggal;
        int nis;
        System.out.print("Masukkan Nama : ");
        nama = masukan.next();
        System.out.print("Masukkan NIS : ");
        nis = masukan.nextByte();
        System.out.print("Masukkan Tempat Lahir : ");
        tempat = masukan.next();
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggal = masukan.next();
        System.out.print("Masukkan Jenis Kelamin : ");
        jenis = masukan.next();
        System.out.print("Alamat : ");
        alamat = masukan.next();
        System.out.print("Masukkan motto hidup : ");
        motto = masukan.next();
        
        System.out.println("=====================");
        System.out.println("Biodata");
        System.out.println("=====================");
        System.out.println("Nama : "+nama);
        System.out.println("NIS : "+nis);
        System.out.println("Tempat Lahir : "+tempat);
        System.out.println("Tanggal Lahir : "+tanggal);
        System.out.println("Jenis Kelamin : "+jenis);
        System.out.println("Alamat : "+alamat);
        System.out.println("Motto hidup : "+motto);
    }
}
