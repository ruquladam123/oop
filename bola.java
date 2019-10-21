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
public class bola {
    public double jarijari;
    public double diameter;
    public double luaspermukaan;
    public double volume;
    
    public void setjarijari(){
    this.jarijari = jarijari;
    jarijari = 10.0;
}
    public void showdiameter(){
    this.diameter = diameter;
    diameter = jarijari *2; 
}
    public void showluaspermukaan(){
        this.luaspermukaan = luaspermukaan;
        luaspermukaan = Math.PI*jarijari*jarijari*4;
    }
    public void showvolume(){
        this.volume = volume;
        volume = Math.PI * jarijari * jarijari * 4/3;
    }
    public void cetakbola(){
        System.out.println("==========================================");
        System.out.println("============--->HASIL BOLA<---============");
        System.out.println("==========================================");
        System.out.println(">>Diameter bola :" + diameter);
        System.out.println(">>Volume bola :" + volume);
        System.out.println(">>Luas permukaan bola :" + luaspermukaan);
        System.out.println("--------------------------------------------");
    }
}
