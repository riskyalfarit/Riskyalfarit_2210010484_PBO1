
package Seleksi;

//class
public class Driver {
    String nama;   //atribut dan encapsulation
    String idlogin;

    public Driver(String nama, String idlogin) {  //Construktor
        this.nama = nama;
        this.idlogin = idlogin; 
    }
    public void setNama(String nama) { //Mutator
        this.nama = nama;
    }
    
    public void setIidlogin(String idlogin) {
        this.idlogin = idlogin;
        
    }
    //Acessor
    public String getnama(){ 
        return nama;
    }
     public String getidlogin(){
        return idlogin;
    }
     public String displayinfo(){
         return "nama : "+getnama()+
                 "idlogin : "+getidlogin();   
     }
     
     //Polymorpishm #overloading#
     public String displayinfo(String Mitra){
         return displayinfo() + "\nMitra: "+Mitra;
     }
}
