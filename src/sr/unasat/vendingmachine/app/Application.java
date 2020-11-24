package sr.unasat.vendingmachine.app;

import sr.unasat.vendingmachine.service.VendingmachineService;

public class Application {
    public static void main(String[] args) {
        VendingmachineService vs = new VendingmachineService();
        System.out.println(vs.chosenSoftdrink("Pepsi"));
    }
}
