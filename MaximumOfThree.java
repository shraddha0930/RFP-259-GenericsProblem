package assignments.GenericsProblem;

import java.util.Scanner;

public class MaximumOfThree {
    public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }

        System.out.println("The maximum number is: " + maximumNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To Computing Maximum Of Three Numbers Using Java Generics");
        System.out.println("Enter three number:");
        Integer firstNumber = scanner.nextInt(), secondNumber = scanner.nextInt() , thirdNumber = scanner.nextInt();
        findMaximum(firstNumber ,secondNumber,thirdNumber);
    }

}
