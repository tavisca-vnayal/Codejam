package Handler;

import CreatePairs.CreatePairs;
import StandInLine.StandInLine;
import TriFibonacci.TriFibonacci;

import java.util.Scanner;

public class AssignmentsHandler {
    public static void main(String[] args) {
        System.out.println("Welcome to the < World of Codejam >");
        System.out.println("Lets begin ... ");
        int indexOfAssignment;
        int numberOfElements;
        int[] inputData;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Assignment : CreatePairs");
            System.out.println("2. Assignment : StandInLine");
            System.out.println("3. Assignment : TriFibonacci");
            System.out.println("Enter the Assignment number you want to try (-1 to exit) ... ");
            indexOfAssignment = scanner.nextInt();
            switch (indexOfAssignment) {
                case 1:
                    CreatePairs createPairs = new CreatePairs();
                    System.out.println("Enter number of elements ... ");
                    numberOfElements = scanner.nextInt();
                    inputData = new int[numberOfElements];
                    System.out.println("Enter elements of array ... ");
                    for(int i = 0; i < numberOfElements; i++) {
                        inputData[i] = scanner.nextInt();
                    }
                    int maximalSum = createPairs.maximalSum(inputData);
                    System.out.println("Maximal Sum : " + maximalSum);
                    break;
                case 2:
                    StandInLine standInLine = new StandInLine();
                    System.out.println("Enter number of elements ... ");
                    numberOfElements = scanner.nextInt();
                    inputData = new int[numberOfElements];
                    System.out.println("Enter elements of array ... ");
                    for(int i = 0; i < numberOfElements; i++) {
                        inputData[i] = scanner.nextInt();
                    }
                    int[] reconstructArray = standInLine.reconstruct(inputData);
                    System.out.println("Reconstrcuted Line : " + reconstructArray);
                    break;
                case 3:
                    TriFibonacci triFibonacci = new TriFibonacci();
                    System.out.println("Enter number of elements ... ");
                    numberOfElements = scanner.nextInt();
                    inputData = new int[numberOfElements];
                    System.out.println("Enter elements of array ... ");
                    for(int i = 0; i < numberOfElements; i++) {
                        inputData[i] = scanner.nextInt();
                    }
                    int resultValue = triFibonacci.findMissingNumber(inputData);
                    System.out.println("Missing Number : " + resultValue);
                    break;
            }
        } while (indexOfAssignment != -1);
        System.out.println("Thanks! Visit Again <3");
    }
}
