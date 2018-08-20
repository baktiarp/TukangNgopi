/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LPBola;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LPBola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int r;
        double p=3.14;
        System.out.println("Masukkan panjang jari-jari");
        r = masukan.nextInt();
        System.out.println("Lluas Permukaan Bola adalah : "+(4*p*r*r));
        
    }
}
