/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import variabel.VKeterangan;
import variabel.VNilaiRataRata;
import variabel.VPenghasilan;
import variabel.VTanggungan;

/**
 *
 * @author acer
 */
public class Rules {
    
    private static double[] u_Keterangan = new double [34];
    private static double[] z_Keterangan = new double [34];
    private static double bobot;
    
    //rules
    public static void hitung_u(){
        u_Keterangan[0]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.kurangmampu()),VTanggungan.sedikit());
        u_Keterangan[1]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.cukupmampu()),VTanggungan.sedikit());
        u_Keterangan[2]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.mampu()),VTanggungan.sedikit());
        u_Keterangan[3]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.kurangmampu()),VTanggungan.banyak());
        u_Keterangan[4]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.cukupmampu()),VTanggungan.banyak());
        u_Keterangan[5]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.mampu()),VTanggungan.banyak());
        u_Keterangan[6]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.kurangmampu()),VTanggungan.sedikit());
        u_Keterangan[7]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.cukupmampu()),VTanggungan.sedikit());
        u_Keterangan[8]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.mampu()),VTanggungan.sedikit());
        u_Keterangan[9]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.kurangmampu()),VTanggungan.banyak());
        u_Keterangan[10]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.cukupmampu()),VTanggungan.banyak());
        u_Keterangan[11]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.mampu()),VTanggungan.banyak());
        u_Keterangan[12]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.kurangmampu()),VTanggungan.sedang());
        u_Keterangan[13]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.cukupmampu()),VTanggungan.sedang());
        u_Keterangan[14]= Math.min(Math.min (VNilaiRataRata.tinggi(), VPenghasilan.mampu()),VTanggungan.sedang());
        u_Keterangan[15]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.kurangmampu()),VTanggungan.sedang());
        u_Keterangan[16]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.cukupmampu()),VTanggungan.sedang());
        u_Keterangan[17]= Math.min(Math.min (VNilaiRataRata.rendah(), VPenghasilan.mampu()),VTanggungan.sedang());
    }
    
    public static void hitung_z(){
        z_Keterangan[0] = VKeterangan.lolos(u_Keterangan[0]);
        z_Keterangan[1] = VKeterangan.cadangan(u_Keterangan[1]);
        z_Keterangan[2] = VKeterangan.tidaklolos(u_Keterangan[2]);
        z_Keterangan[3] = VKeterangan.lolos(u_Keterangan[3]);
        z_Keterangan[4] = VKeterangan.lolos(u_Keterangan[4]);
        z_Keterangan[5] = VKeterangan.cadangan(u_Keterangan[5]);
        z_Keterangan[6] = VKeterangan.cadangan(u_Keterangan[6]);
        z_Keterangan[7] = VKeterangan.tidaklolos(u_Keterangan[7]);
        z_Keterangan[8] = VKeterangan.tidaklolos(u_Keterangan[8]);
        z_Keterangan[9] = VKeterangan.cadangan(u_Keterangan[9]);
        z_Keterangan[10] = VKeterangan.cadangan(u_Keterangan[10]);
        z_Keterangan[11] = VKeterangan.tidaklolos(u_Keterangan[11]);
        z_Keterangan[12] = VKeterangan.lolos(u_Keterangan[12]);
        z_Keterangan[13] = VKeterangan.lolos(u_Keterangan[13]);
        z_Keterangan[14] = VKeterangan.cadangan(u_Keterangan[14]);
        z_Keterangan[15] = VKeterangan.cadangan(u_Keterangan[15]);
        z_Keterangan[16] = VKeterangan.tidaklolos(u_Keterangan[16]);
        z_Keterangan[17] = VKeterangan.tidaklolos(u_Keterangan[17]);
    }
    
    public static double defuzzifikasi(){
        double atas=0, bawah=0;
        for (int i=0; i<34; i++){
            System.out.println("z_ke-"+i+ " : " + z_Keterangan[i]);
            System.out.println("u_ke-"+i+ " : " + u_Keterangan[i]);
            atas+=(u_Keterangan[i]*z_Keterangan[i]);
            bawah+=u_Keterangan[i];
        }
        //System.out.println(atas/bawah);
        return (atas/bawah);
        
    }
}
