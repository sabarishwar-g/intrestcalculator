package com.wipro.bank.main;
import com.wipro.bank.service.BankService;
import com.wipro.bank.exception.BankValidationException;


public class Main {
    public static void main(String args[]) throws BankValidationException {
        BankService bank = new BankService();
        bank.calculate(600f, 56, "Female",5);
        bank.calculate(500f, 53, "Male",10);
        bank.calculate(500f, 48, "Female", 10);
        bank.calculate(600f, 26, "Male", 5);
        bank.calculate(600f, 56, "Male", 6);
    }

}
