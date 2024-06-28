/**Application Purpose: Assignment 7
    *Author: Matheus Daher e Marieli Sayuri
    *Date: 2023 - 07 - 11
    *Time: 3pm**/
import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness {
    public static void main(String[] args) {
        // create an array to store the objects
        BankTransaction[] transactions = new BankTransaction[5];

        // create a random number generator
        Random random = new Random();

        // 5 BankTransaction Records with random data
        for (int i = 0; i < 5; i++) {
            boolean canadianFunds = random.nextBoolean();
            double exchangeRate = random.nextDouble() * 10.0;
            int transactionNumber = random.nextInt(1000);
            long transactionReferenceNumber = random.nextLong();

            transactions[i] = new BankTransaction(canadianFunds, exchangeRate, transactionNumber, transactionReferenceNumber);

            // Printing each object with randoms numbers
            System.out.println("Object " + (i + 1) + ":");
            System.out.println("Canadian Funds: " + transactions[i].getCanadianFunds());
            System.out.println("Exchange Rate: " + transactions[i].getExchangeRate());
            System.out.println("Transaction Number: " + transactions[i].getTransactionNumber());
            System.out.println("Transaction Reference Number: " + transactions[i].gettransactionReferenceNumber());
            System.out.println("Conter: " + BankTransaction.getObjectsInstantiated());
            System.out.println();

            // line of dashes
            System.out.println("---------------------------------------------------");
        }

        try (// Asking to the user if they want to complete the second phase of the test
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Do you want to complete phase two? Please, aswer yes or no: ");
            String userResponse = scanner.nextLine(); 

            double rate = 0.2; //defining new value
            int number = 10;
            long reference = 500000;


            if (userResponse.equalsIgnoreCase("yes")) {
                // set the state of each object to default values using setters
                for (BankTransaction after : transactions) {
                    after.setCanadianFunds(true); 
                    after.setexchangeRate(4.5+rate++);  
                    after.settransactionNumber(420+number++); 
                    after.settransactionReferenceNumber(598337420+reference++); 
                }

                //state of each object after setting to default values
                for (BankTransaction after : transactions) {
                    System.out.println("Object (After Phase Two):");
                    System.out.println("Canadian Funds: " + after.getCanadianFunds());
                    System.out.println("Exchange Rate: " + after.getExchangeRate());
                    System.out.println("Transaction Number: " + after.getTransactionNumber());
                    System.out.println("Transaction Reference Number: " + after.gettransactionReferenceNumber());
                    System.out.println("Conter: " + BankTransaction.getObjectsInstantiated());
                    System.out.println();
                }
                              
                    //line of dashes
                    System.out.println("---------------------------------------------");
                }
            }
        }
}
