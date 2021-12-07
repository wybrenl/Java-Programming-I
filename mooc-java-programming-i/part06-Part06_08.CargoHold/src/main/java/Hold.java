import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> container;
    private int maxweight;

    public Hold(int maxweight) {
        this.container = new ArrayList<>();
        this.maxweight = maxweight;
    }

    public int sumWeight() {
        int sumWeight = 0;
        
        for (Suitcase elementSuitcase : this.container) {
            sumWeight = sumWeight + elementSuitcase.totalWeight();
        }

        return sumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (sumWeight() + suitcase.totalWeight() <= maxweight) {
            container.add(suitcase);
        }
    }

    public String toString() {
        return container.size() + " suitcases (" + sumWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase elementSuitcase : container) {
            elementSuitcase.printItems();
            }
    }
}
