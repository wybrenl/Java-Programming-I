import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxweight;

    public Suitcase(int maxweight) {
        this.items = new ArrayList<>();
        this.maxweight = maxweight;
    }
    
    public int totalWeight() {
         int sumWeight = 0;

        for (Item element : items) {
            sumWeight += element.getWeight();
        }

        return sumWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxweight) {
            items.add(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);

        for (Item element : items) {
            if (element.getWeight() > heaviest.getWeight()) {
                heaviest = element;
            }
        }

        return heaviest;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } else {
        return items.size() + " items (" + totalWeight() + " kg)";
        }
    }

    public void printItems() {
        for (Item element : this.items) {
            System.out.println(element.toString());
        }
    }
}
