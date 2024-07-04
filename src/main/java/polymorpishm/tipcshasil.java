
package polymorpishm;

public class tipcshasil {
    public static void main(String[] args){
        tipcs hasil = new tipcs();
        
        hasil.SetNaikGir(22000);
        System.out.println("Pendapatan bersih :"+hasil.getGir());
        
        hasil.SetNaikGir(10000);
        System.out.println("Pendapatan bersih :"+hasil.getGir());
        
    }
}
