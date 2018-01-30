public class Main {

    public static void main(String[] args) {

//        for (int i = 2; i < 9; i++) {
//            System.out.println("The interest for $10,000 at " + i + " % is $" + String.format("%.2f", calculateInterest(10000, i)));
//        }
//
//        for (int i = 8; i > 1; i--) {
//            System.out.println("The interest for $10,000 at " + i + " % is $" + String.format("%.2f", calculateInterest(10000, i)));
//        }
        int count=0;
        for(int i=10; i<30; i++){
            count++;
            if(isPrime(i)==true){
                System.out.println(i+" is a prime number."); }
            if(count==3){
                System.out.println("Exiting for loop");
                break; }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}