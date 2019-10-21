/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author DKID
 */
public class ujiapa {
    public static void main (String [] args){
        siswaprivasi siswa = new siswaprivasi ();
        siswa.setName(">>Ruqul adam himawan");
        siswa.setAge(15);
        siswa.setAdress(">>Jalan Masjid ,Rt 03 , Rw03 , Kauman ,Srengat , Blitar");
        siswa.setStatus(">>Pernah pacaran tapi ditinggalkan alias jomblo :v");
        siswa.setMotto(">>I dont care what will people say about my life ;)");
        
        System.out.println("=========================");
        System.out.println("==---------------------==");
        System.out.println("==-><DATA KU SENDIRI><-==");
        System.out.println("==---------------------==");
        System.out.println("=========================");
        
        System.out.println(">>Nama :" + siswa.getName());
        System.out.println(">>Usia :" + siswa.getAge());
        System.out.println(">>Alamat :" + siswa.getAdress());
        System.out.println(">>Status :" + siswa.getStatus());
        System.out.println(">>Motto :" + siswa.getMotto());
        System.out.println("---------------------------");

    }
}
