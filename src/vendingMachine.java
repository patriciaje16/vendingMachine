
///This is where i will be defining the functions the diff outputs
// that i made in the interface

public class vendingMachine implements VendingMachineInterface {

    @Override
    public void displayProducts() {
        for(Products products: Products.values()) {
            System.out.println();
        }
    }

    @Override
    public void selectProduct(int product) {

    }

    @Override
    public void displayMessageToEnterMoney() {

    }

    @Override
    public void insertMoney(int... coins) {

    }

    @Override
    public void displayChangeMessage() {

    }
}
