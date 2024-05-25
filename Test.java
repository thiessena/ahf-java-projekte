public class Test {
    
    public static void main(String[] args){
        Entscheidungsbaum eB = new EntscheidungsbaumErsteller().erstelleDefault();

        eB.ausgeben();
        double[] apfelwerte = {52.0, 0.2, 0.0, 13.8,11.0,0.3,0.0};
        Nahrung n1 = new Nahrung("Apfel", apfelwerte, "");
        System.out.println(eB.kategorisiere(n1));
        System.out.println(eB.kategorisiere_rek(eB.getBinaryTree(), n1));
    }
}
