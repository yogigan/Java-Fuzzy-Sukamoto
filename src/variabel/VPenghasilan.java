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
public class VPenghasilan {
    
    private static double penghasilan;
    
    private static double titik1 = 0;
    private static double titik2 = 1500000;
    private static double titik3 = 2000000;
    private static double titik4 = 3000000;
    
    public static double getPenghasilan(){
        return penghasilan;
    }
    
    public static void setPenghasilan (double penghasilan){
        VPenghasilan.penghasilan = penghasilan;
    }
    
    //method derajat keanggotaan kurangmampu
    public static double kurangmampu(){
        if (penghasilan>=titik1 && penghasilan<=titik2) return 1;
        else if (penghasilan>=titik2 && penghasilan<=titik3) return (titik3-penghasilan)/(titik3-titik2);
        else return 0;
    }
    
    //method derajat keanggotaan cukupmampu
    public static double cukupmampu(){
        if (penghasilan>=titik2 && penghasilan<=titik4) return 1;
        else if (penghasilan>=titik2 && penghasilan<=titik3) return (penghasilan-titik2)/(titik3-titik2);
        else if (penghasilan>=titik3 && penghasilan<=titik4) return (titik4-penghasilan)/(titik4-titik3);
        else return 0;
        
    }
    
    //method derajat keanggotaan mampu
    public static double mampu(){
        if (penghasilan>=titik4) return 1;
        else if (penghasilan>=titik3 && penghasilan<=titik4) return (penghasilan-titik3)/(titik4-titik3);
        else return 0;
    }
}
