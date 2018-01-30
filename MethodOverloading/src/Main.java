public class Main {

    public static void main(String[] args) {
        double feetAndInchToCentimetersConversion=calcFeetAndInchesToCentimeters(5,9);
        System.out.println(feetAndInchToCentimetersConversion);

//        double inchesToCentimetersConversion=calcFeetAndInchesToCentimeters(72);
//        System.out.println(inchesToCentimetersConversion);

        calcFeetAndInchesToCentimeters(75);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double feetToInches = feet * 12;
            double feetAndInchesToCentimeters = (feetToInches + inches)*2.54;
            System.out.println((int)feet+ " feet and "+(int)inches+ " inches is equal to "+feetAndInchesToCentimeters+ " centimeters");
            return feetAndInchesToCentimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0) {
            double feet=(int)inches/12;
            int remainingInches=(int)inches%12;
            System.out.println((int)inches+ " inches is equal to "+ (int)feet+ " feet and "+ remainingInches+ " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
            return -1;

    }
}


