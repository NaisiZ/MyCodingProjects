package hw5;

public class Account {
		private String firstName;
		private String lastName;
		private String address;
		private double balance;
		private double rate;
		
		public Account() {
			
		}
		public Account(String firstName, String lastName, String address) {
			this(firstName, lastName, address, 0, 0.01);
		}
		public Account(String firstName, String lastName, String address, double balance, double rate) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.balance = balance;
			this.setRate(rate);
		}
		
		public double calculateInterest() {
			return this.balance * this.rate;
		}
		public double calculateInterest(boolean isEmployee) {
			if(isEmployee) {
				return calculateInterest() * 1.05;
			}
			return calculateInterest();
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getRate() {
			return rate;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}
		
		
	}


