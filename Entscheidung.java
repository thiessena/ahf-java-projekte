public class Entscheidung extends EKnoten{
    String merkmal;
    float splitWert;

    public Entscheidung(String pMerkmal, float pSplitWert){
        merkmal = pMerkmal; 
        splitWert = pSplitWert;
    }

    public boolean kleinerAlsSplitWert(Nahrung datensatz){
        return datensatz.getWert(merkmal) < splitWert;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public void setMerkmal(String pParameter) {
        merkmal = pParameter;
    }

    public float getSplitWert() {
        return splitWert;
    }

    public void setSplitWert(float pSplitWert) {
        splitWert = pSplitWert;
    }

    public String toString(){
        return "["+merkmal + " : " + splitWert + "]";
    }
}
