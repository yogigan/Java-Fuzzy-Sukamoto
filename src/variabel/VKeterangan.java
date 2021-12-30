/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabel;

/**
 *
 * @author acer
 */
public class VKeterangan {
    
    private static double keterangan;
    
    private static double titik1 = 0;
    private static double titik2 = 1;
    private static double titik3 = 2;
    private static double titik4 = 3;
    
    public static double getKeterangan(){
        return keterangan;
    }
    
    public static void setKeterangan (double keterangan){
        VKeterangan.keterangan = keterangan;
    }
    
    //method nilai derajat keanggotaan tidaklolos
    public static double tidaklolos(){
        if (keterangan>=titik1 && keterangan<=titik2) return 1;
        else if (keterangan>=titik2 && keterangan<=titik3) return (keterangan-titik2)/(titik3-titik2);
        else return 0;
    }
    
    //method nilai derajat keanggotaan cadangan
    public static double cadangan(){
        if (keterangan>=titik2 && keterangan<=titik4) return 1; 
        else if (keterangan>=titik2 && keterangan<=titik3) return (keterangan-titik2)/(titik3-titik2);
        else if (keterangan>=titik3 && keterangan<=titik4) return (titik4-keterangan)/(titik4-titik3);
        else return 0;
    }
    
    //method nilai derajat keanggotaan lolos
    public static double lolos(){
        if (keterangan>=titik4) return 1;
        else if (keterangan>=titik3 && keterangan<=titik4) return (titik4-keterangan)/(titik4-titik3);
        else return 0;
    }
    
    //mencari nilai Z dari tiap rules
    public static double tidaklolos(double in){
        return ((in*(titik3-titik2))+titik2);
    }
    
    public static double cadangan (double in){
        if (in>=titik2 && in<=titik3)return ((in*(titik3-titik2)+titik2));
        else return (titik4-(in*(titik4-titik3)));
    }
    
    public static double lolos (double in){
        return (titik4-(in*(titik4-titik3)));
    }
}
