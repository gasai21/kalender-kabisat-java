/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalenderkabisat;

import javax.swing.JOptionPane;

/**
 *
 * @author Pangling
 */
public class KalenderKabisat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String thn,tgl28,tgl29;
        int tahun;
        thn = JOptionPane.showInputDialog("Masukkan Tahun yang ingin anda ketahui Tahun Kabisatnya : ");
        tahun = Integer.parseInt(thn);
        tgl29= new String ("\nJumlah hari bulan februari adalah 29");
        tgl28= new String ("\nJumlah hari bulan februari adalah 28");


        //tahun habis dibagi 400 = kabisat
        if(tahun%400==0){

            //tahun tidak habis dibagi 400 tetapi habis dibagi 100 = bukan kabisat.
            if(tahun%400!=0 && tahun%100 ==0){
                JOptionPane.showMessageDialog(null,tahun + " Adalah Bukan Tahun Kabisat" + " "+ tgl28);
            }else {
                JOptionPane.showMessageDialog(null,tahun + " Adalah Tahun Kabisat"+ " " + tgl29); 
                }

        //tahun tidak habis dibagi 400, tidak habis dibagi 100 tetapi habis dibagi 4 = kabisat.
        }else if (tahun%400!=0 && tahun%100!=0 && tahun%4 == 0) {
            JOptionPane.showMessageDialog(null,tahun + "Adalah Tahun Kabisat" + " " + tgl29);
        }
        else{
        //tahun tidak habis dibagi 400, tidak habis dibagi 100, dan tidak habis dibagi 4 = bukan tahun kabisat
            JOptionPane.showMessageDialog(null,tahun + "Adalah Bukan Tahun Kabisat" + " " + tgl28);
        }
    }
}
