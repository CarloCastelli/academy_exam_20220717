package service;

import dataObjects.Pence;
import dataObjects.Pound;
import dataObjects.Shilling;

public class Operations implements OperationInterface {


    private Pound pound;
    private Shilling shilling;
    private Pence pence;

    public Pence sumAllPences () {

        return new Pence(pound.getValue() + shilling.getValue() + pence.getValue());

    }


    @Override
    public void sum() {

    }

    @Override
    public void subtraction() {

    }

    @Override
    public void division() {

    }

    @Override
    public void multiplication() {

    }
}
