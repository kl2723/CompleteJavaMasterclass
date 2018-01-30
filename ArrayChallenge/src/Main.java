import java.util.Arrays;
import java.util.Scanner;
public class Main {

    private static Scanner input=new Scanner(System.in);
    public static void main(String[]args){

        int[]myArray=getIntegers(5);
        int[]sorted=sortIntegers(myArray);
        printArray(sorted);


    }


    public static int[] getIntegers(int number){
        int[] anArray=new int[number];
        System.out.println("Enter "+number+ " integer values.");
        for(int i=0; i<anArray.length; i++){
            anArray[i]=input.nextInt();
        }
        return anArray;
    }

    public static void printArray(int[]array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element "+i+": "+array[i]);
        }
    }

    public static int[]sortIntegers(int[]array){

//        int[]sortedArray= Arrays.copyOf(array, array.length);

        int []sortedArray=new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i]=array[i];
        }

        boolean flag=true;
        int temp;

       while(flag){
            flag=false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }

        return sortedArray;
    }


}
