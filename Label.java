public class Label extends EKnoten{
    String name; 

    public Label(String pName){
        name = pName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "("+ name + ")";
    }


}