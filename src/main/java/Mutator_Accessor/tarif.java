
package Mutator_Accessor;


public class tarif {
    int gir;
    
    void setGir(int Gir){
        this.gir = Gir;
    }
    void SetNaikGir(int NaikGir){
        gir = gir + NaikGir;
    }
    void SetTurunGir(int TurunGir){
        gir = gir - TurunGir;
    }
    int getGir(){
        return gir;
    }
}
