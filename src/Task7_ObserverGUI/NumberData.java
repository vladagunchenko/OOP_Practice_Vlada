package Task7_ObserverGUI;
// використання власної анотації
@Info(author = "Vlada")
public class NumberData {
    private int value;
    public NumberData(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}