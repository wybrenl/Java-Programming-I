import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        int length = this.elements.size();

        String output = "The collection " + this.name;

        if (length == 0) {
            output = output + " is empty.";
        } 

        if (length == 1) {
            output = output + " has 1 element:" + "\n" + this.elements.get(0);
        }          

        if (length > 1) {
            String elementos = "";
            for (String element : elements) {
                elementos = elementos + element + "\n";
            }
        output = output + " has " + length + " elements:" + "\n" + elementos;
        }

    return output;
    }
    
}
