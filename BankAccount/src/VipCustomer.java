public class VipCustomer {

    private String name, emailAddress;
    private int creditLimit;

    public VipCustomer(){
        this("Jon Doe", "jonDo@email.com", 1000);
    }

    public VipCustomer(String name, String emailAddress){
        this("Jon Doe", "jonDo@email.com", 2000);
    }

    public VipCustomer(String name, String emailAddress, int creditLimit){
        this.name=name;
        this.emailAddress=emailAddress;
        this.creditLimit=creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
