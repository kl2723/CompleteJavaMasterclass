public class Car extends Vehicle {

    /*
    Car
    super(String name, String color, int year);
    String type (sudan, SUV, etc.)


    getMethods();
    changeGears();*/

    private String name, color, type;
    private int year;


    public Car(){
        this("car", "color", 0, "unknown");
    }

    public Car(String name, String color, int year, String type){
        super();
        this.type=type;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("Car says vrooom!");
    }

    public void changeGears(int gearLvl){
        if (gearLvl<1||gearLvl>6){
            System.out.println("Choose a gear level between 1 and 6");
        }else{
            System.out.println(gearLvl+" is new gear.");
        }
    }


}
