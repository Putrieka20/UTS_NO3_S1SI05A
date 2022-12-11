/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_s1si05a_3025;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author acer
 * PUTRI EKA NUR ALIFAH / 21103025 / S1SI05A
 */
public class UTS_NO3_S1SI05A_3025 extends Mahasiswa_3025{
    public static void main(String[] args) {
        //Membuat object menggunakan array
        AsistenPraktikum_3025[] ap = new AsistenPraktikum_3025[1];
        StudentStaff_3025[] ss = new StudentStaff_3025[1];
        
        ap[0] = new AsistenPraktikum_3025();
        ss[0] = new StudentStaff_3025();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                ap[i].nim = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan =br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                ap[i].mkAsisten = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jmlPertemuan = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3025 AP : ap){
                AP.tampilDataAsistenPraktikum();
                System.out.println("");
            }

            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                ss[i].nim = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan =br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3025 SS : ss){
                SS.tampilDataStudentStaff();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
        
    }
}