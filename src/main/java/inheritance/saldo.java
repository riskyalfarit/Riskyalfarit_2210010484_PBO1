
package inheritance;


public class saldo extends ewallet {
   public static void main(String []args){
        saldo saldodriver = new saldo();
        
        saldodriver.setGir(10000);
        System.out.println("Pendapatan saat ini : "+saldodriver.getGir());
        
        saldodriver.SetNaikGir(20000);
        System.out.println("Pendapatan saat ini : "+saldodriver.getGir());

   }
}
