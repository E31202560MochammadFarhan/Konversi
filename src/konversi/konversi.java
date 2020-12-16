/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;
import java.util.Scanner;
/**
 *
 * @author Farhansetyo
 */
public class konversi {
     public static void main(String[] args){
        System.out.println("Piliha Konversi:\n" + "1. Jam -> Menit\n" + "2. Detik -> Hari, jam, menit dan detik");
        System.out.println("\nMasukkan pilihan");
        try (Scanner option =  new Scanner(System.in)) {
            if(!option.hasNextInt()){
                System.out.println("Itu Alfabet, anda salah!");
            }else{
                if(option.nextInt() == 1){
                    System.out.println("Masukkan jam:");
                    Scanner hours = new Scanner(System.in);
                    jamKeMenit(hours.nextInt());
                }else{
                    System.out.println("Masukkan detik:");
                    try(Scanner seconds = new Scanner(System.in)){
                        detikKeHari(seconds.nextLong());
                    }
                }
            }
        }
    }
    
    public static void jamKeMenit(long jam){
        long menit = jam * 60;
        System.out.println("Menit: " + menit);
    }
    
    public static void detikKeHari(long detik){
        //hari
        int hari = (int) (detik / (60*60*24));
        
        //jam
        detik %= (60*60*24);
        int jam = (int) (detik / (60*60));
        
        //menit
        detik %= (60*60);
        int menit = (int) (detik / 60);
        
        //detik
        detik %= 60;
        
        System.out.println(hari + " Hari, " + jam + "jam," + menit + "menit," + detik + "detik,");
    }
}
