package program.customer;

import java.io.Serializable;

public class Customer implements Comparable<Customer>, Serializable {
			public static final int NUMBER_OF_CRITERION = 2;

			private String customerNumber;
			private String customerName;
			private int firstHalf;
			private int secondHalf;
			private int totalPurchase;
			private double avgPurchase;
			private String grade;
			private int rate;
			
			public Customer(String customerNumber, String customerName, int firstHalf, int secondHalf) {
				this(customerNumber, customerName, firstHalf, secondHalf, 0, 0.0, null, 0);
			}

			public Customer(String customerNumber, String customerName, int firstHalf, int secondHalf,
					int totalPurchase, double avgPurchase, String grade, int rate) {
				super();
				this.customerNumber = customerNumber;
				this.customerName = customerName;
				this.firstHalf = firstHalf;
				this.secondHalf = secondHalf;
				this.totalPurchase = totalPurchase;
				this.avgPurchase = avgPurchase;
				this.grade = grade;
				this.rate = rate;
			}




			public String getCustomertNumber() {
				return customerNumber;
			}

			public void setCustomertNumber(String customertNumber) {
				this.customerNumber = customertNumber;
			}

			public String getCustomerName() {
				return customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}

			public int getFirstHalf() {
				return firstHalf;
			}

			public void setFirstHalf(int firstHalf) {
				this.firstHalf = firstHalf;
			}

			public int getSecondHalf() {
				return secondHalf;
			}

			public void setSecondHalf(int secondHalf) {
				this.secondHalf = secondHalf;
			}
			
			public int getTotalPurchase() {
				return totalPurchase;
			}

			public double getAvgPurchase() {
				return avgPurchase;
			}

			public String getGrade() {
				return grade;
			}
			public int getRate() {
				return rate;
			}

			public void calculateTotalPurchase() {
				this.totalPurchase = this.firstHalf + this.secondHalf;
			}

			public void calculateAvgPurchase() {
				this.avgPurchase = (double) this.totalPurchase / NUMBER_OF_CRITERION;
			}

			public void calculateGrade() {
				switch ((int) (this.avgPurchase / 10)) {
				case 10:
				case 9:
					this.grade = "VVIP";
					break;
				case 8:
					this.grade = "VIP";
					break;
				case 7:
					this.grade = "GOLD";
					break;
				case 6:
					this.grade = "SILVER";
				default:
					this.grade = "BRONZE";
				}
			}
			
			@Override
			public boolean equals(Object obj) {
				if (!(obj instanceof Customer)) return false;
				return this.customerNumber.equals(((Customer) obj).customerNumber);
			}

			@Override
			public int hashCode() {
				return this.customerNumber.hashCode();
			}

			@Override
			public int compareTo(Customer o) {
				return this.customerNumber.compareToIgnoreCase(o.customerNumber);
			}

			@Override
			public String toString() {
				return customerNumber + "\t" + customerName+ "\t"
						+ firstHalf + "\t" + secondHalf+ "\t" + totalPurchase + "\t" 
						+ avgPurchase + "\t" + grade + "\t" + rate;
			}

}
