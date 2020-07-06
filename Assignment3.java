/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H P
 */
public class Assignment3 {
    
    String name,clothes, Address, NoPhone, ic;
    double price;
            
     public Assignment3 (String n, String ic, String c, String a, String np, double p) {
     name = n;
     NoPhone =  np;
     clothes = c;
     price = p;
     Address = a;
     this.ic = ic;
}
   
     public String getname() {
         return name;
     }
     
     public String getic() {
         return ic;
     }
     
     public String getNoPhone() {
         return NoPhone;
     }
     
     public String getclothes(){
         return clothes; 
     }
     
     public String getAddress() {
         return Address;
     }
     
     public double getprice() {
         return price;
     }
     
     public String getAssignment3() {
         return name + NoPhone + clothes + price + Address;
     }
}
