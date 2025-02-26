public class EntscheidungsbaumErsteller {
    int pos; 

    public Entscheidungsbaum erstelle(String[] baumtextZeilen){
        //Objekte aus dem Text erstellen
        EKnoten[] knoten = getEKnotenAusBaumtextZeilen(baumtextZeilen);

        //Baum aus den Objekten erstellen
        //Position für den Knotenarray auf 0 setzen
        //Für das Durchlaufen des Arrays von erstelle_rek
        pos = 0;
        return new Entscheidungsbaum(erstelle_rek(knoten));
    }

    private BinaryTree<EKnoten> erstelle_rek(EKnoten[] knoten){
        if(pos < knoten.length){
            EKnoten aktuellerKnoten = knoten[pos];
            if(aktuellerKnoten instanceof Label){
                pos++;
                return new BinaryTree<EKnoten>(aktuellerKnoten, null, null);
            }else{
                BinaryTree<EKnoten> nTeilbaum = new BinaryTree<EKnoten>(aktuellerKnoten, null, null);
                pos++;
                BinaryTree<EKnoten> links = erstelle_rek(knoten);
                BinaryTree<EKnoten> rechts = erstelle_rek(knoten);
                nTeilbaum.setLeftTree(links);
                nTeilbaum.setRightTree(rechts);
                return nTeilbaum;
            }
            
        }
        return null;
    }

    private EKnoten[] getEKnotenAusBaumtextZeilen(String[] eintraege){
        EKnoten[] knoten = new EKnoten[eintraege.length];
        for(int i = 0; i < eintraege.length; i++){
            String[] daten = eintraege[i].split(":");
            if(daten[0].equals("E")){
                knoten[i]= new Entscheidung(daten[1],Float.parseFloat(daten[2]));
            }else{
                knoten[i]= new Label(daten[1]);
            }
        }
        return knoten;
    }

    public Entscheidungsbaum erstelleDefault(){
        String[] baumTextZeilen = { 
            "E:Fett:5.0",
            "E:Eiweiß:10.0",
            "L:nicht empfohlen",
            "L:eher empfohlen",
            "E:Zucker:3.0",
            "L:eher empfohlen",
            "E:Eiweiß:15.0",
            "L:nicht empfohlen",
            "L:eher empfohlen"
        };
    
        return erstelle(baumTextZeilen);
    }


    public Nahrung[] getTrainingsdatensatz(){
        //              Name	                Energie	Fett	gesättigte Fettsäuren	Kohlenhydrate	Zucker	Eiweiß	Salz	Label
        Nahrung[] trainingsdaten = {
            new Nahrung("Apfel",	                52,	    0.2,	0,	    13.8,	11,	    0.3,	0,	    "eher empfohlen"),
            new Nahrung("Banane",                   95,	    0.3,    0.1,	21,	    12,	    1.1,	0.1,    "eher empfohlen"),
            new Nahrung("Haselnussschnitte",        542,	31.9,	18.6,	54,	    42.6,	7.6,	0.4,	"nicht empfohlen"),
            new Nahrung("Gummibärchen",	            343,	0.1,	0.1,	77,	    46,	    6.9,	0.07,	"eher empfohlen"),
            new Nahrung("Chips",	                503,	28,	    2.6,	53,	    2.9,	6.3,	2.8,	"nicht empfohlen"),
            new Nahrung("Fritierte Pommes",	        289,	14,	    1.3,	36,	    0.3,	3.4,	0.7,	"nicht empfohlen"),
            new Nahrung("Nudeln",	                359,	2,	    0.5,	70.9,	3.5,	12.8,	0.01,	"eher empfohlen"),
            new Nahrung("Brotscheibe",	            229,	4.9,	0.8,	35,	    2.3,	7.7,	1.03,	"eher empfohlen"),
            new Nahrung("Popcorn",	                499,	23,	    13.8,	57,	    3.8,	10.7,	1.8,	"nicht empfohlen"),
            new Nahrung("Chicken Nuggets",	        241,	11,	    1.5,	21,	    0.5,	14,	    0.98,	"nicht empfohlen"),
            new Nahrung("Erdbeerjoghurt",	        93,	    2.8,	1.8,	14,	    13,	    3,	    0.1,	"nicht empfohlen"),
            new Nahrung("Salatgurke",	            12,	    0.1,	0,	    3.6,	1.7,	0.7,	2,	"eher empfohlen"),
            new Nahrung("Brokkoli",	                43,	    0.2,	0.05,	2.9,    1.7,	4,	    0.02,	"eher empfohlen"),
            new Nahrung("Schokomüsli",	            406,	11.3,	4.7,	60.7,	22.2,	10.7,	0.25,	"nicht empfohlen"),
            new Nahrung("Waffel",	                459,	24.3,	12.7,	53,	    33.8,	7.5,	0.3,	"nicht empfohlen"),
            new Nahrung("Haferflocken",	            368,	7,	    1.5,	58.7,	0.7,	13.5,	0.02,	"eher empfohlen"),
            new Nahrung("Kartoffel",	            71,	    0.1,	0,	    15,	    0.8,	1.7,	2,	"eher empfohlen"),
            new Nahrung("Vollmilchschokolade",	    530,	29.5,	17.5,	58.5,	57.5,	6.6,	0.2,	"nicht empfohlen"),
            new Nahrung("Majonäse",	                721,	79.3,	10,	    0.2,	0.2,	1.2,	0.8,	"nicht empfohlen"),
            new Nahrung("Putenbrustfilet(gebraten)",111,	1.7,	0.6,	0,	    0,	    24,	    0.2,	"eher empfohlen"),
            new Nahrung("Avocado",	                160,	13,	    2.8,	2,	    0.7,	1.5,	0.07,	"eher empfohlen"),
            new Nahrung("Himbeermarmelade",	        223,	0.2,	0,	    52.2,	51.7,	0.7,	0.03,	"nicht empfohlen")

        };
        return trainingsdaten;
    }

    public Entscheidungsbaum erstelleAusTrainingsdaten(Nahrung[] datensaetze){
        //toDo

        int minFehler = datensaetze.length;
        for(int merkmal = 0; merkmal < Nahrung.merkmalAnzahl; merkmal++){
            Entscheidung e = bestimmeSplitPosFuerMerkmal(merkmal, datensaetze);
            if(< minFehler){
                minFehler = 
            }
            

        }

        return new Entscheidungsbaum();

    }

    private Entscheidung bestimmeSplitWertFuerMerkmal(int merkmal, Nahrung[] datensaetze){
        int minFehler = datensaetze.length;
        int minSplitPos = 0;
        boolean umgekehrteTeilung = false;
        double splitWert = 0;
        sortiereNachMerkmal(merkmal,datensaetze);
        for(int splitPos = 0; splitPos < datensaetze.length; splitPos++){
            int splitFehler = 0;
            //linke Hälfte
            for(int i = 0; i < splitPos; i++){
                if(datensaetze[i].getLabel().equals(Nahrung.EMPFOHLEN)){
                    splitFehler++;
                }
            }
            //rechte Hälfte
            for(int i = splitPos; i < datensaetze.length; i++){
                if(datensaetze[i].getLabel().equals(Nahrung.NICHTEMPFOHLEN)){
                    splitFehler++;
                }
            }
            if( splitFehler < minFehler){
                minFehler = splitFehler;
                minSplitPos = splitPos;
                umgekehrteTeilung = false;
            }
            if( datensaetze.length - splitFehler < minFehler){
                minFehler = datensaetze.length - splitFehler;
                minSplitPos = splitPos;
                umgekehrteTeilung = true;
            }
        }
        if(umgekehrteTeilung){
            Entscheidung e = new Entscheidung(Nahrung.getMerkmal(merkmal), datensaetze[minSplitPos].getWert(merkmal));
            e.setDatensatzAnzahl(datensaetze.length);
            return e;
        }
        
    }

    private void sortiereNachMerkmal(int merkmal, Nahrung[] datensaetze){
        for(int pos = 1; pos < datensaetze.length; pos++){
            for(int in = pos-1; in > -1; in--){
                if(datensaetze[pos].getWert(merkmal) < datensaetze[in].getWert(merkmal)){
                    Nahrung zwischenSpeicher = datensaetze[pos]; 
                    datensaetze[pos] = datensaetze[in]; 
                    datensaetze[in] = zwischenSpeicher;
                }else{
                    break;
                }
            }
        }
    }





}
