

package Class_Atribut_object;
class Maxim {
    String namadriver;
    String kendaraan;
    int umur;
}

public class Driverojol {

    public static void main(String[] args) {
    Maxim Driver1 = new Maxim ();
    Driver1.namadriver ="Udin";
    Driver1.kendaraan ="Supra";
    Driver1.umur = 20;
        
        System.out.println(Driver1.namadriver);
        System.out.println(Driver1.kendaraan);
        System.out.println(Driver1.umur);
        
     Maxim Driver2 = new Maxim ();   
    Driver2.namadriver ="Utuh";
    Driver2.kendaraan ="mx";
    Driver2.umur = 21;
        
        System.out.println(Driver2.namadriver);
        System.out.println(Driver2.kendaraan);
        System.out.println(Driver2.umur);   
    }
}
