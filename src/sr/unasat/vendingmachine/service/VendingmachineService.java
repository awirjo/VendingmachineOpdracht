package sr.unasat.vendingmachine.service;

public class VendingmachineService {
    public String chosenSoftdrink (String choice) {
        if (choice == null || choice.trim().isEmpty()){
            return "Please select a choice";
        }
        String message;
        switch (choice){
            case "Pepsi":
                message = " Take your Pepsi from the bin. It cost 10 srd ";
                break;
            case "7Up":
                message = " Take your 7Up from the bin. It cost 10srd ";
                break;
            default:
                message = " The chosen softdrink is not available ";

        }
        return message;
    }
}
