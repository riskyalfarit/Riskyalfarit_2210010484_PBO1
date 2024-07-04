
package Construktor;

class Driver{
    String Nama;
    String Merk;
    String Umur;
    
    Driver(String InputNama, String InputMerk, String InputUmur){
        Nama = InputNama;
        Merk = InputMerk;
        Umur = InputUmur;
        
        System.out.println(Nama);
        System.out.println(Merk);
        System.out.println(Umur);
    
    } 
}

public class Driverojol {
  public static void main(String[] args){
      Driver driver1 = new Driver("Udin", "Ninja 2tak", "22tahun");
      Driver driver2 = new Driver("MAMET", "RXKING", "18tahun");
      
     
 
  }
}
