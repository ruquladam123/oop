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
public class bus4 {

    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangbaru;

    public bus4(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void addpenumpang(double penumpang) {
        double temp;
        temp =this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("==========================");
            System.out.println("=->BUSNYA OVERLOAD SLUR<-=");
            System.out.println("==========================");
        } else {
            this.penumpang = temp;
        }
        counter++;
        penumpangbaru += penumpang;
    }

    public void getpenumpang(int password) {
        if (password == 6969) {
            System.out.println("=========================");
            System.out.println("=->PASSWORD ANDA BENAR<-=");
            System.out.println("=========================");
        } else {
            System.out.println("=========================");
            System.out.println("=->PUNTEN SALAH SLURRR<-=");
            System.out.println("=========================");
        }

    }

    public double getaverage() {
        double a = 0.0;
        a = penumpang / counter;
        return a;
    }

    public void cetakpenumpang() {
        System.out.println(">>Berat badan penumpang bus sekarang :" + penumpang + "<<");
        System.out.println(">>Berat badan penumpang bus seharusnya adalah :" + maxpenumpang + "<<");
                System.out.println(">>Rata rata berat badan :" + getaverage() + "<<");
    }

}
