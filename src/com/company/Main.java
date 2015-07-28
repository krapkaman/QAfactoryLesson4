package com.company;

public class Main {

    public static void main(String[] args) {
        int[] operand1 = {76, 90, 4, 87, 70, 57, 48, 70, 31, 69, 18, 40, 76};
        int[] operand2 = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
        int[] expectedResults = {151, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};
        String testResult = " Pased";

        for (int i = 0; i < 13; i++)
        {
            if ((operand1[i] + operand2[i] != expectedResults[i]))
            {
                System.out.printf("Expected %d; Actual %d %n", expectedResults[i], (operand1[i]+ operand2[i]));
                testResult = " Failed";
                break;
            }
        }
        System.out.println("Test" + testResult);
    }
}
