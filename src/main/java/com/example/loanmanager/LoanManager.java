package com.example.loanmanager;

public class LoanManager {
    public String getApplicationName() {
        return "Loan Manager";
    }

    public static void main(String[] args) {
        LoanManager app = new LoanManager();
        String name = app.getApplicationName();
        System.out.println(name);
        System.out.println("Author: MEKA-MEVOUNG JEAN DAUNICK");
    }
}
