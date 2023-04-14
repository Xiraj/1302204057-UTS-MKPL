package lib;

public class TaxFunction {
	
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		int maxChildren = 3;
		int taxDeduction = 54000000 + 4500000 + (Math.min(numberOfChildren, maxChildren) * 1500000);
		int totalIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking - deductible - taxDeduction;
		int tax = (int) Math.round(0.05 * totalIncome);
		return Math.max(tax, 0);
	}
	
	
}
