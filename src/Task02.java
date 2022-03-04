public class Task02 {
    public static void main(String[] args){
        //Task 2:This program calculates how much would be your weight on Mars
        float earthWeightAymen=76;
        float marsWeightAymen;
        double marsWeightInDouble;
        int marsWeightInInt = 0;


        marsWeightAymen=(earthWeightAymen*0.38F);
        System.out.println(earthWeightAymen+"kg on Earth is "+ marsWeightAymen + "kg on Mars");

        marsWeightInDouble=marsWeightAymen;
        System.out.println("Kilograms on Mars after converting to double: "+ marsWeightInDouble);

        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n",marsWeightInDouble);

        marsWeightInInt =(int) marsWeightInDouble;
        System.out.println("Kilograms on Mars when casted to Integer "+ marsWeightAymen);

        char c= (char)marsWeightInInt;
        System.out.println("The ASCII table equivalent of marsWeightInInt is :" + c);

        int exampleOfMathOnChar= c*c;
        System.out.println("An example of math operation on the char type: "+ exampleOfMathOnChar);
    }

}
