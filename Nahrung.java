public class Nahrung {
    String name; 
    double[] werte;

    public static final int merkmalAnzahl = 6;

    String label;

    public static final String EMPFOHLEN = "eher empfohlen"; 
    public static final String NICHTEMPFOHLEN = "nicht empfohlen";
    public static final String[] MERKMALE = {"Energie", "Fett", "Fettsaeure", "Kohlenhydrate", "Zucker", "Eiweiss", "Salz"};

    /**
     * Erstellt eine neue Nahrung aus dem Array mit den Werten in folgender Reihenfolge: 
     * energie, fett, fettsaeuren, kohlenhydrate, zucker, eiweiss, salz
     * @param pWerte
     */
    public Nahrung(String pName, double[] pWerte, String pLabel){
        name = pName;
        werte = pWerte;
        label = pLabel;
    }

    public Nahrung(String pName, double pEnergie, double pFett, double pFettsaeuren, double pKohlenhydrate, double pZucker,  double pEiweiss, double pSalz, String pLabel){
        name = pName; 
        werte[0] = pEnergie; 
        werte[1] = pFett;
        werte[2] = pFettsaeuren; 
        werte[3] = pKohlenhydrate; 
        werte[4] = pZucker; 
        werte[5] = pEiweiss ;
        werte[6] = pSalz; 

        label = pLabel;
    }

    public String getName(){
        return name;
    }

    public double getWert(String merkmal){
        switch(merkmal){
            case "Energie": return werte[0]; 
            case "Fett": return werte[1]; 
            case "Fettsäuren": return werte[2]; 
            case "Kohlenhydrate": return werte[3]; 
            case "Zucker": return werte[4]; 
            case "Eiweiß": return werte[5]; 
            case "Salz": return werte[6];  
            default: return Integer.MIN_VALUE;
        } 
    }

    public double getWert(int merkmalPosition){
        return werte[merkmalPosition];
    }

    public static String getMerkmal(int merkmal){
        return MERKMALE[merkmal];
    }



    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
}
