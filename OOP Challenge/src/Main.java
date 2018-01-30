public class Main {



    public static void main(String[]args){

        Burger myBurger=new Burger("white");
        HealthyBurger myHealthyBurger=new HealthyBurger();
        DeluxeBurger myDeluxeBurger=new DeluxeBurger("brown");



        myBurger.addCheese(true);
        myDeluxeBurger.removeDrink(true);
        myHealthyBurger.addAvacado(true);

        myBurger.getBurgerTotal();
        myHealthyBurger.getBurgerTotal();
        myDeluxeBurger.getBurgerTotal();

    }
}
