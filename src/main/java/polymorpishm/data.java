
package polymorpishm;

public class data {
    String nama;
    int angka;
    
    public data(String nama, int umur){
        this.nama = nama;
        this.angka = umur; 
    }
    
    public data(int tahunkendaraan, String merk){
        this.nama = merk;
        this.angka = tahunkendaraan; 
    }
  

    
    public void info(){
        System.out.println("nama/warna : "+nama);
        System.out.println("umur/tahun Kendaraan :"+angka);
    }
    
}
