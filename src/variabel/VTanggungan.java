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
public class VTanggungan {
    
    private static double tanggungan;
    
    private static double titik1 = 0;
    private static double titik2 = 1;
    private static double titik3 = 3;
    private static double titik4 = 5;
    
    public static double getTanggungan(){
        return tanggungan;
    }
    
    public static void setTanggungan(double tanggungan){
        VTanggungan.tanggungan = tanggungan;
    }
    
    //method nilai derajat keanggotaan sedikit
    public static double sedikit(){
        if (tanggungan>=titik1 && tanggungan<=titik2) return 1;
        else if (tanggungan>=titik2 && tanggungan<=titik3) return (titik3-tanggungan)/(titik3-titik2);
        else return 0;
    }
    
    //method nilai derajat keanggotaan sedang
    public static double sedang(){
        if (tanggungan>=titik2 && tanggungan<=titik4) return 1;
        else if (tanggungan>=titik2 && tanggungan<=titik3) return (tanggungan-titik2)/(titik3-titik2);
        else if (tanggungan>=titik3 && tanggungan<=titik4) return (titik4-tanggungan)/(titik4-titik3);
        else return 0;
    }
    
    //method nilai derajat keanggotaan banyak
    public static double banyak(){
        if (tanggungan>=titik4) return 1;
        else if (tanggungan>=titik3 && tanggungan<=titik4) return (tanggungan-titik3)/(titik4-titik3);
        else return 0;
    }
}
