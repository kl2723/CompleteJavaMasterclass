public class Main {
    public static void main(String[]args){

        Vehicle v1=new Vehicle();
        Car c1=new Car();
        BMW b1=new BMW();

        v1.move(40);
        System.out.println("-----------------------");
        c1.move(40);
        System.out.println("-----------------------");
        b1.move(40);
    }
}
