public class Vehicle {

    private String name, color;
    private int year;

    public Vehicle(){
        this("unknown", "unknown", 0);
    }

    public Vehicle(String name, String color, int year){
        this.name=name;
        this.color=color;
        this.year=year;
    }

    public void move(int speed){
        System.out.println("Moving "+speed+ " mph");
    }

    public void increaseSpeed(int speed){
        System.out.println("Increasing speed by "+speed);
    }

    public void decreaseSpeed(int speed){
        System.out.println("Decreasing speed by "+speed);
    }

    public void turnLeft(int degrees){
        if(degrees<0){
            System.out.println("Turning "+degrees+ " degrees.");
        }else{
            System.out.println("Invalid number!");
        }
    }


    public void turnRight(int degrees){
        if(degrees<0){
            System.out.println("Turning "+degrees+ " degrees.");
        }else{
            System.out.println("Invalid number!");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
