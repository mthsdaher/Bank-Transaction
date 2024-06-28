/**Application Purpose: Assignment 7
    *Author: Matheus Daher
    *Date: 2023 - 07 - 11
    *Time: 3pm

    class BankTransaction created as a blueprint*/ 
    public class BankTransaction {
        private boolean canadianFunds;
        private double exchangeRate;
        private int transactionNumber;
        private long transactionReferenceNumber;

        private static int objectCounter = 1;
    
    //a constructor that takes four arguments:
    public BankTransaction(boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber){
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate;
        this.transactionNumber = transactionNumber;
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    //getter for each state
    public boolean getCanadianFunds(){
        return canadianFunds;
    }
    public double getExchangeRate(){
        return exchangeRate;
    }
    public int getTransactionNumber(){
        return transactionNumber;
    }
    public long gettransactionReferenceNumber(){
        return transactionReferenceNumber;
    }

    //stter for each state
    public void setCanadianFunds(boolean canadianFunds) {
        this.canadianFunds = canadianFunds;
    }
    public void setexchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void settransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public void settransactionReferenceNumber(long transactionReferenceNumber) {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    //public class variable to keep track of the number of objects instantiated
    public static int getObjectsInstantiated(){
        return objectCounter++;
    }
}
