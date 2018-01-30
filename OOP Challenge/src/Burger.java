import java.util.Scanner;
public class Burger {


    private String roll;
    private boolean lettuce, tomato, cheese, pickle;
    private double originalBurgerTotal, totalPrice=3.00;
    private double lettucePrice, tomatoPrice, cheesePrice, picklePrice;

    public Burger(String roll){
        if (roll.equalsIgnoreCase("white")||(roll.equalsIgnoreCase("brown"))){
            this.roll=roll;
        }else {
            System.out.println("Enter either 'white' or 'brown'");
        }
    }

    public Burger(){

    }

    public void addTomato(boolean addItem){
        tomatoPrice=0;
        if(addItem==true){
            tomatoPrice+=.25;
            totalPrice+=.25;
        }
    }

    public void addLettuce(boolean addItem){
        lettucePrice=0;
        if(addItem==true){
            lettucePrice+=.25;
            totalPrice+=.25;
        }
    }


    public void addCheese(boolean addItem){
        cheesePrice=0;
        if(addItem==true){
            cheesePrice+=.25;
            totalPrice+=.25;
        }
    }



    public void addPickle(boolean addItem){
        picklePrice=0;
        if(addItem==true){
            picklePrice+=.25;
            totalPrice+=.25;
        }
    }


    public void getBurgerTotal(){
        System.out.println("Burger total: $"+originalBurgerTotal);
        System.out.println("Lettuce total: $"+lettucePrice);
        System.out.println("Tomato total: $"+tomatoPrice);
        System.out.println("Cheese total: $"+ cheesePrice);
        System.out.println("Pickle total: $"+picklePrice);
        System.out.println("Meal total: $"+totalPrice);
    }



}
