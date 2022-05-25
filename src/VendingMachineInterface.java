

///this is where all my functions are and will be implemented in
//the vending machine

public interface VendingMachineInterface {

    ///1.function to display products
    void displayProducts();
    ///2.function to select products
    void selectProduct(int product);
    ///3.function to prompt user to enter money into the machine
    void displayMessageToEnterMoney();
    ///4.function to insert the money which will be an array of int coins
    void insertMoney(int... coins);
    //5. function to display the amount due back to user
    void displayChangeMessage();

}
