
package Mutator_Accessor;


public class tarifdriver {
    public static void main(String []args){
        tarif tarif1 = new tarif();
        
        tarif1.setGir(10000);
        System.out.println("Pendapatan saat ini : "+tarif1.getGir());
        
        tarif1.SetNaikGir(20000);
        System.out.println("Pendapatan saat ini : "+tarif1.getGir());
        
        tarif1.SetNaikGir(20000);
        System.out.println("Pendapatan saat ini : "+tarif1.getGir());
        
        tarif1.SetTurunGir(20000);
        System.out.println("Pendapatan saat ini : "+tarif1.getGir());
        
        
    }
    
}
