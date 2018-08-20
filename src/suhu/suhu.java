/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class suhu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float R,F,K;
        System.out.println("Masukkan nilai suhu dari Celcius");
        float C = masukan.nextInt();
        System.out.println("pilih konversi ke K, R , F : ");
        String pilihan = masukan.next();
        switch (pilihan) {
            case "K" :
                System.out.println("Hasil : " + (K = C+273));
            case "R" :
                System.out.println("Hasil : " + (R = C*4/5));
            case "F" :
                System.out.println("Hasil : " + (F = C+9/5+32));
                
          
    
        }
        
    }
}
