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
public class Bus3 {
    public int penumpang;
    public int maxpenumpang;
    
    public Bus3(int maxpenumpang){
       this.maxpenumpang = maxpenumpang;
       penumpang = 0;
    }
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang){
            System.out.println("==BUSNYA OVERLOAD SLUR==");
        }
        else{
            this.penumpang = temp;
        }
    }
    public void getpenumpang(int password){
        if(password == 6969){
            System.out.println("==PASSWORD ANDA BENAR==");
        }else{
            System.out.println("==HAYOOOOO KOK SALAHH==");
        }
    
}
    public void cetakpenumpang(){
        System.out.println(">>Penumpang bus sekarang :" + penumpang);
        System.out.println(">>Max penumpang seharusnya adalah :" + maxpenumpang);
    }
    
}
