package Tugas;

public class Member {
    private String idNumber;
    private String name;
    private int loanLimit;
    private int currentLoan;

    // Constructor
    public Member(String idNumber, String name, int loanLimit) {
        this.idNumber = idNumber;
        this.name = name;
        this.loanLimit = loanLimit;
        this.currentLoan = 0;
    }

    // Getters
    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public int getCurrentLoan() {
        return currentLoan;
    }

    // Borrow money
    public void borrow(int amount) {
        if (currentLoan + amount > loanLimit) {
            System.out.println("Loan request exceeds limit.");
            return;
        }
        currentLoan += amount;
    }

    // Pay installment
    public void payInstallment(int amount) {
        int minInstallment = currentLoan / 10;

        if (amount < minInstallment) {
            System.out.println("Installment must be at least 10% of the current loan.");
            return;
        }

        if (amount > currentLoan) {
            System.out.println("Installment exceeds current loan amount.");
            return;
        }

        currentLoan -= amount;
    }
}
