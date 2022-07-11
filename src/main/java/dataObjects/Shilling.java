package dataObjects;

public class Shilling {


    private final int value;


    public Shilling(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    public Pence fromShillingToPence() {
        int pence = 0;
        int shillingAmount = this.value;

        while (shillingAmount >= 0) {
            pence += 240;
            shillingAmount--;
        }

        return new Pence(pence);
    }

}
