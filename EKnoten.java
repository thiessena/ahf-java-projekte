public class EKnoten{
    int datensatzAnzahl; 
    int korrektKlassifiziert; 
    int falschKlassifiziert; 

    public EKnoten(){

    }

    public String toString(){
        return "n=" + datensatzAnzahl + " k=" + korrektKlassifiziert + " f=" + falschKlassifiziert;
    }
}
