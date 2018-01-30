public class Main {

    public static void main(String[]arg){

        int count=0;
        int evenCount=0;
        int number= 5;
        int finishNumber=20;
        while(number<=finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number "+ number);
            number++;
            evenCount++;
            if(evenCount>=5){
                break;
            }
        }

        System.out.println(evenCount+ " total even numbers");
        //test whether number is even
        //if number is not even, increment and continue loop
        //print out even numbers


    }

    public static boolean isEvenNumber(int n){
        if(n%2==0){
            return true; }
        return false; }
}

