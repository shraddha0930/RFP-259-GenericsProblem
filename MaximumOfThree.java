package assignments.GenericsProblem;

import java.util.Scanner;

public class MaximumOfThree<T extends Comparable<T>>  {


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

    public static void findMaximum(String firstStr, String secondStr, String thirdStr) {
        String maximumStr;

        if(firstStr.compareTo(secondStr)>0 && firstStr.compareTo(thirdStr)>0) {
            maximumStr = firstStr;
        }
        else if(secondStr.compareTo(firstStr)>0 && secondStr.compareTo(thirdStr)>0) {
            maximumStr = secondStr;
        }
        else {
            maximumStr = thirdStr;
        }

        System.out.println("The maximum Three String is: " + maximumStr);
    }
    public static <T extends Comparable<T>> T findMax(T firstNumber, T secondNumber, T thirdNumber, T forthNumber) {
        T maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0 && firstNumber.compareTo(forthNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0 && secondNumber.compareTo(forthNumber)>0) {
            maximumNumber = secondNumber;
        }
        else if(thirdNumber.compareTo(forthNumber)>0){
            maximumNumber = thirdNumber;
        }
        else{
            maximumNumber= forthNumber;
        }
        System.out.println("The maximum is: " + maximumNumber);
        return maximumNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Computing Maximum Of Three Numbers Using Java Generics");

        System.out.println("Enter three  integer number:");
        Integer firstNumber = scanner.nextInt(), secondNumber = scanner.nextInt() , thirdNumber = scanner.nextInt(),forthNumber = scanner.nextInt();
        findMaximum(firstNumber ,secondNumber,thirdNumber);
        System.out.println("Enter three float number:");
        Float firstNum = scanner.nextFloat(),secondNum = scanner.nextFloat(), thirdNum = scanner.nextFloat(),forthNum = scanner.nextFloat();
        findMaximum(firstNum,secondNum,thirdNum);
        System.out.println("Enter three  string:");
        String firstStr = scanner.next(),secondStr = scanner.next(), thirdStr = scanner.next(),forthStr = scanner.next();
        findMaximum(firstStr,secondStr,thirdStr);

        int num = 0;
        while(num != 5){
            System.out.println("Enter a choice : \n 1.Max OF Three Integers \n 2.Max Of Three Floats \n 3.Max OF Three Characters "
                    + "\n 4.Max Of three using generics method \n 5.Max Of three using generic class ");
            num = scanner.nextInt();
            switch(num) {
                case 1:
                    findMaximum(firstNumber ,secondNumber,thirdNumber);
                    break;
                case 2:
                    findMaximum(firstNum,secondNum,thirdNum);
                    break;
                case 3:
                    findMaximum(firstStr,secondStr,thirdStr);
                    break;
                case 4:
                    System.out.println("Using Generics");
                    MaximumOfThree.findMax(firstNumber ,secondNumber,thirdNumber,forthNumber);
                    MaximumOfThree.findMax(firstNum,secondNum,thirdNum,forthNum);
                    MaximumOfThree.findMax(firstStr,secondStr,thirdStr,forthStr);
                    break;
                default :
                    break;
            }
        }

    }

}
