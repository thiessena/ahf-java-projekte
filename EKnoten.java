public class EKnoten{
    int datensatzAnzahl;
    int korrektKlassifiziert;
    int falschKlassifiziert;

    public EKnoten(){

    }

    public String toString(){
        return "n=" + datensatzAnzahl + " k=" + korrektKlassifiziert + " f=" + falschKlassifiziert;
    }

    public int getDatensatzAnzahl() {
        return datensatzAnzahl;
    }

    public void setDatensatzAnzahl(int datensatzAnzahl) {
        this.datensatzAnzahl = datensatzAnzahl;
    }

    public int getKorrektKlassifiziert() {
        return korrektKlassifiziert;
    }

    public void setKorrektKlassifiziert(int korrektKlassifiziert) {
        this.korrektKlassifiziert = korrektKlassifiziert;
    }

    public int getFalschKlassifiziert() {
        return falschKlassifiziert;
    }

    public void setFalschKlassifiziert(int falschKlassifiziert) {
        this.falschKlassifiziert = falschKlassifiziert;
    }

    
}
