import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int suitcasesWeight = 0;
        for (Suitcase sc : suitcases) {
            suitcasesWeight += sc.totalWeight();
        }
        if (suitcasesWeight + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }

    }

    public int weightOfSuitcases() {
        int weight = 0;

        for (Suitcase e : suitcases) {
            weight += e.totalWeight();
        }
        return weight;
    }

    public String toString() {
        String weightOutput = " (" + weightOfSuitcases() + "kg)";
        String suitcaseOutput = "";

        if (suitcases.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (suitcases.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = suitcases.size() + " suitcases";
        }

        return suitcaseOutput + weightOutput;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            for (Item item : suitcase.getItems()) {
                System.out.println(item);
            }
        }
    }
}
