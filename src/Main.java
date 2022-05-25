import java.util.Scanner;



///this is where i will run the program with all the
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VendingMachineInterface vendingMachineInterface = null;

        vendingMachineInterface.displayProducts();

        String productSelection = scanner.nextLine();
        int productSelectionID = Integer.parseInt(productSelection);

        vendingMachineInterface.selectProduct(productSelectionID);

        vendingMachineInterface.displayMessageToEnterMoney();

        String enterMoney = scanner.nextLine();
        int[] arrayOfCoins = {};

        vendingMachineInterface.insertMoney(arrayOfCoins);
        vendingMachineInterface.displayChangeMessage();



    }
}