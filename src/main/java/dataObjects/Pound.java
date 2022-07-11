package dataObjects;

public class Pound {

    private final int value;

    public Pound(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Pence fromPoundToPence() {
        int pence = 0;
        int poundsAmount = this.value;

        while (poundsAmount >= 0) {
            pence += 240;
            poundsAmount--;
        }

        return new Pence(pence);
    }




}
