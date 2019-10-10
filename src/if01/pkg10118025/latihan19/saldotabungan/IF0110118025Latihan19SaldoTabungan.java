/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan19.saldotabungan;

import java.text.DecimalFormat;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 1018025
 * Kelas    : IF01
 * 
 */
public class IF0110118025Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, saldo;
        
        DecimalFormat satuan = new DecimalFormat();
        
        i = 1;
        saldo = 2500000;
        while(i<=6){
            saldo += saldo*0.15;
            System.out.println("Saldo di bulan ke-"+ i +" Rp. " + satuan.format(saldo));
            i++;
        }
                
    }
    
}
