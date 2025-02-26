public class Entscheidungsbaum{
    BinaryTree<EKnoten> baum; 

    public Entscheidungsbaum(){
        baum = new BinaryTree<EKnoten>(null, null, null);
    }

    public Entscheidungsbaum(BinaryTree<EKnoten> pBaum){
        baum = pBaum;
    }

    public BinaryTree<EKnoten> getBinaryTree(){
        return baum;
    }

    public void training(Nahrung[] datensaetze){
        
    }

    public void testen(Nahrung[] datensaetze){

    }

    public String kategorisiere(Nahrung datensatz){
        return kategorisiere_it(datensatz);
    }


    /**=============================[Training]=========================*/
    
    public void traininig(Nahrung[] datensaetze, int baumtiefe){

    }


    /**=============================[Kategorisierungen]=========================*/

    /**
     * Kategorisiert einen Datensatz iterativ. 
     * @param datensatz
     * @return
    */
    public String kategorisiere_it(Nahrung datensatz){
        BinaryTree<EKnoten> aktuellerKnoten = baum; 
        while(aktuellerKnoten.getContent() instanceof Entscheidung){
            Entscheidung e = (Entscheidung)aktuellerKnoten.getContent();
            if(e.kleinerAlsSchwellenwert(datensatz)){
                System.out.println(datensatz.getName() + ":" + datensatz.getWert(e.getMerkmal()) + " < " +e.getSchwellenwert() + " ["+ e.getMerkmal() + "]" );
                aktuellerKnoten = aktuellerKnoten.getLeftTree();
            }else{
                System.out.println(datensatz.getName() + ":" + datensatz.getWert(e.getMerkmal()) + " >= " +e.getSchwellenwert() + " ["+ e.getMerkmal() + "]" );
                aktuellerKnoten = aktuellerKnoten.getRightTree();
            }
        }
        Label l = (Label)aktuellerKnoten.getContent();
        return l.getName();
    }

    public String kategorisiere_rek(BinaryTree<EKnoten> baum, Nahrung datensatz){
        if( baum.getContent() instanceof Entscheidung){
            Entscheidung e = (Entscheidung)baum.getContent();
            if(e.kleinerAlsSchwellenwert(datensatz)){
                return kategorisiere_rek(baum.getLeftTree(), datensatz);
            }else{
                return kategorisiere_rek(baum.getRightTree(), datensatz);
            }
        }else{
            Label l = (Label)baum.getContent();
            return l.getName();
        }
    }

    /**=============================[Ausgabe]=========================*/

    public void ausgeben(){
        ausgabe_rek(baum,"");
    }

    private void ausgabe_rek(BinaryTree<EKnoten> pBaum, String tiefe){
        if(pBaum != null){
            System.out.println(tiefe+pBaum.getContent());
            ausgabe_rek(pBaum.getLeftTree(), tiefe+"------");
            
            ausgabe_rek(pBaum.getRightTree(), tiefe+"------");
        }
    }

}