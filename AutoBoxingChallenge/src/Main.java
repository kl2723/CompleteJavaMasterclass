public class Main {
    public static void main(String[]args){
        Bank bank =new Bank("Wells Fargo");
        bank.addBranch("Houston");

        bank.addCustomer("Kymane","Houston", 300.00);
        bank.addCustomer("Jennifer", "Houston", 550.50);
        bank.addCustomer("Stewie", "Houston", 25.64);

        bank.addBranch("Arlington");
        bank.addCustomer("Sydney", "Arlington", 1000.00);

        bank.addCustomerTransaction("Houston", "Kymane", 45.00);
        bank.addCustomerTransaction("Arlington", "Sydney", -50.00);
        bank.addCustomerTransaction("Arlington", "Eddie", 55.50);

        bank.listCustomers("Houston", false);

    }
}
