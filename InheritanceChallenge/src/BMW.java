public class BMW extends Car {

    /*
    BMW
    super(String name, String color, int year, String type)
    String model;
    */

    private String name, color, type, model;
    private int year;

    public BMW(){
        this("bmw", "unknown", 1, "sudan", "i3");
    }

    public BMW(String name, String color, int year, String type, String model){
        super();
        this.model=model;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("BMW says vrooom!");
    }
}
