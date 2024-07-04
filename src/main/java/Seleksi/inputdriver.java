
package Seleksi;

public class inputdriver extends Driver { //Inheritance
    //overridding 
    public inputdriver(String nama, String idlogin){
        super(nama, idlogin);    
    }
    
    public int getTahunMasuk(){
        return Integer.parseInt(getidlogin().substring(0, 2)) + 2000;
    }
    
    public String getStatus(){
        String kodelogin = getidlogin().substring(2, 4);
        //seleksi if
        if(kodelogin.equals("")){
            return "Status Driver Masih Akttif";
        }else {
            return "Status Driver Tidak Akttif";
            
        }
    }
    public String getMitra(){
       String kodeMitra = getidlogin().substring(4, 6);
       //seleksi switch
       switch(kodeMitra){
           case "11":
                   return "Aplikasi Maxim";
           case "22":
                   return "Aplikasi Gojek";
           default:
                   return "Aplikasi Grab";          
       }
    }
    
    public int getnohp(){
        return Integer.parseInt(getidlogin().substring(7));
    }
    //polymorphism overriding
    @Override
    public String displayinfo(){
        return super.displayinfo()+
                "\nTahun Daftar : "+getTahunMasuk()+
                "\nStatus : "+getStatus()+
                "\nMitra : "+getMitra()+
                "\nnohp : "+getnohp();
        
    }   
}
