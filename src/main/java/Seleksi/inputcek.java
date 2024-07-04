
package Seleksi;

import java.util.Scanner;

public class inputcek {
    public static void main(String[] args){
       // Driver Driverojol = new Driver("UDIN","197689657800");
        //System.out.println(Driverojol.displayinfo());
        //System.out.println(Driverojol.displayinfo(4D));
        
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            
            //array
            inputdriver[] Driverojol = new inputdriver[2];
            
            //perulangan
            for(int i=0; i<Driverojol.length; i++){
                System.out.println("Masukan nama Driver "+(i+1)+": ");
                String nama = scanner.nextLine();
                System.out.println("Masukan NOMOR LOGIN Driver "+(i+1)+": ");
                String idlogin = scanner.nextLine();
                
                //objek
                Driverojol[i] = new inputdriver(nama, idlogin);               
            }
            //perulangan
            for (inputdriver data: Driverojol){
                System.out.println("===============");
                System.out.println("Data Driever : ");
                System.out.println(data.displayinfo());               
            }
        }catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor: "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format idlogin: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
    }
}    
