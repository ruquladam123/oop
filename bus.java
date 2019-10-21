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
public class bus {
    private int penumpang;
    private int maxPenumpang;
    
    
    public bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp >= maxPenumpang){
            System.out.println("=========================================");
            System.out.println("==->Penumpang nya overload slurrrr :v<-==");
            System.out.println("=========================================");
            
        }else{
            this.penumpang = temp;
        }

            
    }
                public void cetak(){
                    System.out.println("===========================");
                    System.out.println("====HELLO PENUMPANGG :D====");
                    System.out.println("===========================");
            System.out.println(">>Penumpang bus sekarang adalah :" + penumpang);
            System.out.println(">>Penumpang maksimal bus seharusnya adalah :" + maxPenumpang);

}
}
                
