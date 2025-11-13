package Tugas;

public class TestCoop {
	public static void main(String[] args) {

		// Create a Member object
		Member member1 = new Member("111333444", "Donny", 5_000_000);

		System.out.println("Member Name      : " + member1.getName());
		System.out.println("Loan Limit       : " + member1.getLoanLimit());

		System.out.println("\nBorrowing 10,000,000...");
		member1.borrow(10_000_000);
		System.out.println("Current Loan     : " + member1.getCurrentLoan());

		System.out.println("\nBorrowing 4,000,000...");
		member1.borrow(4_000_000);
		System.out.println("Current Loan     : " + member1.getCurrentLoan());

		System.out.println("\nPaying installment 100,000...");
		member1.payInstallment(100_000);
		System.out.println("Current Loan     : " + member1.getCurrentLoan());

		System.out.println("\nPaying installment 5,000,000...");
		member1.payInstallment(5_000_000);
		System.out.println("Current Loan     : " + member1.getCurrentLoan());

		System.out.println("\nPaying installment 3,000,000...");
		member1.payInstallment(3_000_000);
		System.out.println("Current Loan     : " + member1.getCurrentLoan());
	}
}
