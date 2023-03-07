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
    public static void findMaximum(Float firstNum, Float secondNum, Float thirdNum) {
        Float maximumNumber;

        if(firstNum.compareTo(secondNum)>0 && firstNum.compareTo(thirdNum)>0) {
            maximumNumber = firstNum;
        }
        else if(secondNum.compareTo(firstNum)>0 && secondNum.compareTo(thirdNum)>0) {
            maximumNumber = secondNum;
        }
        else {
            maximumNumber = thirdNum;
        }

        System.out.println("The maximum Float number is: " + maximumNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Computing Maximum Of Three Numbers Using Java Generics");

        System.out.println("Enter three  integer number:");
        Integer firstNumber = scanner.nextInt(), secondNumber = scanner.nextInt() , thirdNumber = scanner.nextInt();
        findMaximum(firstNumber ,secondNumber,thirdNumber);
        System.out.println("Enter three float number:");
        Float firstNum = scanner.nextFloat(),secondNum = scanner.nextFloat(), thirdNum = scanner.nextFloat();
        findMaximum(firstNum,secondNum,thirdNum);
    }

}
