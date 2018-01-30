public class Main {
    public static void main (String[]args){

        int switchValue=6;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a"+ switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3, 4 or 5");
                break;
        }



        char character=('b');
        switch (character){
            case 'a': case 'A':
                System.out.println("A");
                break;
            case 'b': case 'B':
                System.out.println("B");
                break;
            case 'c': case 'C':
                System.out.println("C");
                break;
            case 'd': case 'D':
                System.out.println("D");
                break;
            case 'e': case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Not found...");
                break;
        }

    }
}
