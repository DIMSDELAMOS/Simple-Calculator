package src;


import java.util.Scanner;

public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {           //CONSTRUCTOR
        this.number1 = number1;
        this.number2 = number2;
    }

    public static int sum(int number1, int number2) {      //μεθοδοι
        int summ = number1 + number2;
        return summ;
    }

    public static int mult(int number1, int number2) {
        int multt = number1 * number2;
        return multt;
    }

    public static int diff(int number1, int number2) {
        int diffe = 0;
        if (number1 > number2) {
            diffe = number1 - number2;
            return diffe;
        }
        if (number2 > number1) {
            diffe = number2 - number1;
            return diffe;
        }
        return diffe;
    }

    public static double div(int number1, int number2) {
        if (number1 != 0 || number2 != 0) {
            double divv = (double) number1 / number2;
            return divv;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {                  //απο εδω και κατω ειναι το εκτελεσιμο προγραμμα!
        Scanner scanner = new Scanner(System.in);            //εισαγωγη δεδομεων απτον χρηστη
        int number1 = scanner.nextInt();
        scanner.nextLine();
        int number2 = scanner.nextInt();
        scanner.nextLine();
        Calculator calculator = new Calculator(number1, number2);        //καλουμε τις μεθοδους
        System.out.println(sum(number1, number2));
        System.out.println(mult(number1, number2));
        System.out.println(diff(number1, number2));
        System.out.println(div(number1, number2));
    }
}





