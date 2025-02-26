public class Entscheidung extends EKnoten{
    String merkmal;
    double schwellenwert;

    public Entscheidung(String pMerkmal, double pSchwellenwert){
        merkmal = pMerkmal; 
        schwellenwert = pSchwellenwert;
    }

    public boolean kleinerAlsSchwellenwert(Nahrung datensatz){
        return datensatz.getWert(merkmal) < schwellenwert;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public void setMerkmal(String pParameter) {
        merkmal = pParameter;
    }

    public float getSchwellenwert() {
        return schwellenwert;
    }

    public void setSchwellenwert(float pSchwellenwert) {
        schwellenwert = pSchwellenwert;
    }

    public String toString(){
        return "["+merkmal + " : " + schwellenwert + "]";
    }
}
