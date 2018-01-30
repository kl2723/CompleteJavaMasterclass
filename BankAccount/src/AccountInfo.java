public class AccountInfo {

    private int accountNum;
    private double balance;
    private String customerName, email, phoneNum;

    public AccountInfo(){
        this("Jon Doe", "000-000-0000", "email@email.com", 0000, 100.00);
        System.out.println("Empty constructor called.");
    }

    public AccountInfo(String customerName, String phoneNum, String email, int accountNum, double balance){
        System.out.println("AccountInfo constructor with parameters called.");
        this.phoneNum=phoneNum;
        this.email=email;
        this.accountNum=accountNum;
        this.customerName=customerName;
        this.balance=balance;
    }


    public AccountInfo(String customerName, String email, String phoneNum) {
        this("Kymane", "enamyk@gmail.com", "469-888-0510", 272443, 400.00);
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double depositMoney(double amount){
       if(amount<=0){
           System.out.println("Enter valid amount");
           System.exit(0);
       }else{
           balance+=amount; }
        return balance;
    }

    public double withdrawMoney(double amount){
        if(amount<=0){
            System.out.println("Enter valid amount");
            System.exit(0);
        }
        else if(amount>balance){
            System.out.println("Not enough money!");
            System.exit(0);
        }
        else{
            balance-=amount; }
        return balance;
    }

}
