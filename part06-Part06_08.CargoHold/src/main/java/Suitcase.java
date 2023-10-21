import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        if (!(this.totalWeight() + item.getWeight() > maxWeight)) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int kg = 0;
        for (Item item : items) {
            kg += item.getWeight();
        }
        return kg;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (!(this.items.isEmpty())) {
            Item heaviest = items.get(0);
            for (Item item : items) {
                if (item.getWeight() > heaviest.getWeight()) {
                    heaviest = item;
                }
            }
            return heaviest;
        }
        return null;

    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item" + " (" + this.totalWeight() + "kg)";
        }

        return items.size() + " items" + " (" + this.totalWeight() + "kg)";
    }
}
