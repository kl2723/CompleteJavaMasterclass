public class DeluxeBurger extends Burger{

    private String roll;
    private boolean lettuce, tomato, cheese, pickle;
    private boolean drink=true;
    private boolean chips=true;
    private double originalBurgerTotal, totalPrice=5.00;
    private double lettucePrice, tomatoPrice, cheesePrice, picklePrice;

    public DeluxeBurger(String roll){
        super();
    }

    public void removeChips(boolean removeChips){
        if (removeChips==true){
            chips=false;
        }
    }

    public void removeDrink(boolean removeDrink){
        if (removeDrink==true){
            drink=false;
        }
    }

    @Override
    public void addTomato(boolean addItem) {
        super.addTomato(addItem);
    }

    @Override
    public void addLettuce(boolean addItem) {
        super.addLettuce(addItem);
    }

    @Override
    public void addCheese(boolean addItem) {
        super.addCheese(addItem);
    }

    @Override
    public void addPickle(boolean addItem) {
        super.addPickle(addItem);
    }

    @Override
    public void getBurgerTotal() {
        System.out.println("Burger total: $"+originalBurgerTotal);
        System.out.println("Lettuce total: $"+lettucePrice);
        System.out.println("Tomato total: $"+tomatoPrice);
        System.out.println("Cheese total: $"+ cheesePrice);
        System.out.println("Pickle total: $"+picklePrice);
        System.out.println("Meal total: $"+totalPrice);
    }
}
