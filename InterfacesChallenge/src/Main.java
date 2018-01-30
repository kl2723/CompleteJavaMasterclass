import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Create an interface that saves objects to a list
        method 1: returns an ArrayList of values
        method 2: populates an objects fields. (create a new
        instance within the method)

        //Player class
        //Monster class

        //Create a toString() method for each class

        Main
        //create method that takes an object that implements the
        interface as a parameter and "saves the values" This can
        be done by printing the values unto the screen

        //create a method that restores the values to a saveable object
        //readValues() method to get values from a file. returns
        an ArrayList
         */

        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Lightsaber");
        saveObject(tim);
        //loadObject(tim);
        System.out.println(tim);


        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Strength = "+((Monster) werewolf).getStrength());
        saveObject(werewolf);
    }
        public static ArrayList<String> readValues(){
            ArrayList<String> values = new ArrayList<String>();

            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            int index = 0;
            System.out.println("Choose\n" +
                            "1 to enter a string\n" +
                            "0 to quit");

            while(!quit){
                System.out.println("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        System.out.println("Enter a string: ");
                        String stringInput = scanner.nextLine();
                        values.add(index, stringInput);
                        index++;
                        break;
                }
            }
            return values;
        }



    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+ " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }
}
