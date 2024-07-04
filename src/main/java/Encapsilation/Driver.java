
package Encapsilation;

class cvdriver{
    public String nama;
    public int pengalaman;
    private int umur;
    
    cvdriver(String nama, int pengalaman, int umur){
        this.nama = nama;
        this.pengalaman = pengalaman;
        this.umur = umur;
    }
    void display(){
    System.out.println("\nNama\t: " + this.nama);
    System.out.println("pengalaman\t: " + this.pengalaman);
    System.out.println("umur\t: " + this.umur);
    }
}
public class Driver {
    public static void main(String[]args){
        cvdriver cvdriver1 = new cvdriver("udin",1,20);
        System.out.println(cvdriver1.nama);
        System.out.println(cvdriver1.pengalaman);
        
        cvdriver1.nama = "utuh";
        cvdriver1.pengalaman = 2;
        System.out.println(cvdriver1.nama);
        System.out.println(cvdriver1.pengalaman);
        
        cvdriver1.display();
        
    }
    
}
