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
public class VNilaiRataRata {
    
    private static double nilairatarata;
    
    //variabel titik-titik range pada model fuzzy
    private static double titik1 = 0;
    private static double titik2 = 74;
    private static double titik3 = 75;
    
    //method untuk mengakses nilai pada variabel nilairatarata
    public static double getNilaiRataRata() {
        return nilairatarata;
    }
    
    //method untuk memberikan nilai pada variabel nilairatarata
    public static void setNilaiRataRata(double nilairatarta){
        VNilaiRataRata.nilairatarata = nilairatarata;
    }
    
    //method nilai derajat keanggotaan rendah
    public static double rendah(){
        if (nilairatarata>=titik1 && nilairatarata<=titik2) return 1;
        else if (nilairatarata>=titik2 && nilairatarata<=titik3) return (titik3-nilairatarata)/(titik3-titik2);
        else return 0;
    }
    
    //method nilai derajat keanggotaan tinggi
    public static double tinggi(){
        if (nilairatarata>=titik3) return 1;
        else if (nilairatarata>=titik2 && nilairatarata<=titik3) return (nilairatarata-titik2)/(titik3-titik2);
        else return 0;
    }
    
}
