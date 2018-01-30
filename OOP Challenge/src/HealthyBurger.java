public class HealthyBurger extends Burger{


    private String roll="brown";
    private boolean cheese, pickle, cucumber, avacado;
    private boolean lettuce=true;
    private boolean tomato=true;
    private double originalBurgerTotal, totalPrice=4.00;
    private double cheesePrice, picklePrice, cucumberPrice, avacadoPrice;




    public void removeLettuce(boolean removeLettuce){
        if (removeLettuce==true){
            lettuce=false;
        }
    }

    public void removeTomato(boolean removeTomato){
        if (removeTomato==true){
            tomato=false;
        }
    }

    public void addCucumber(boolean addItem) {
        cucumberPrice=0;
        if(addItem==true){
            cucumberPrice+=.25;
            totalPrice+=.25;
        }
    }


    public void addAvacado(boolean addItem) {
        avacadoPrice=0;
        if(addItem==true){
            avacadoPrice+=.25;
            totalPrice+=.25;
        }
    }


    public void addCheese(boolean addItem) {
        super.addCheese(addItem);
    }


    public void addPickle(boolean addItem) {
        super.addPickle(addItem);
    }

    @Override
    public void getBurgerTotal() {
        System.out.println("Burger total: $"+originalBurgerTotal);
        System.out.println("Cheese total: $"+ cheesePrice);
        System.out.println("Pickle total: $"+picklePrice);
        System.out.println("Cucumber total: $"+ cucumberPrice);
        System.out.println("Avacado total: $"+avacadoPrice);
        System.out.println("Meal total: $"+totalPrice);
    }
}
