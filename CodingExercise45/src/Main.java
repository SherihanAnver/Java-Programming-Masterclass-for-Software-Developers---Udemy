public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Commerical Bank");

        if(bank.addBranch("Colombo")) {
            System.out.println("Colombo branch created");
        }

        bank.addCustomer("Colombo", "Hana", 50.05);
        bank.addCustomer("Colombo", "Nuha", 175.34);
        bank.addCustomer("Colombo", "Anne", 220.12);

        bank.addBranch("Kandy");
        bank.addCustomer("Kandy", "Bob", 150.54);

        bank.addCustomerTransaction("Colombo", "Hana", 44.22);
        bank.addCustomerTransaction("Colombo", "Hana", 12.44);
        bank.addCustomerTransaction("Colombo", "Nuha", 1.65);

        bank.listCustomers("Colombo", true);
        bank.listCustomers("Kandy", true);

        bank.addBranch("Galle");

        if(!bank.addCustomer("Galle", "James", 5.53)) {
            System.out.println("Error Galle branch does not exist");
        }

        if(!bank.addBranch("Colombo")) {
            System.out.println("Colombo branch already exists");
        }

        if(!bank.addCustomerTransaction("Colombo", "Ken", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Colombo", "Hana", 12.21)) {
            System.out.println("Customer Hana already exists");
        }


















    }
}
