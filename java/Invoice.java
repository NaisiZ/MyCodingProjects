package Set2_Exercise;

import java.util.Scanner;
//This is Question 3

public class Invoice {
	     
	    String partNumber;
	    String partDescription;
	    int quantityOfItemPurchased;
	    double pricePerItem;
	     
	    public Invoice (String number, String description, int quantity, double price) {
	        partNumber = number;
	        partDescription = description;
	        quantityOfItemPurchased = quantity;
	        pricePerItem = price;
	    }
	     
	    public void setPartNumber (String number) {
	        partNumber = number;
	    }
	     
	    public String getPartNumber () {
	        return partNumber;
	    }
	     
	    public void setPartDescription (String description) {
	        partDescription = description;
	    }
	     
	    public String getPartDescription () {
	        return partDescription;
	    }
	     
	    public void setQuantityOfItemPurchased (int quantity) {
	        quantityOfItemPurchased = quantity;
	    }
	     
	    public int getQuantityOfItemPurchased () {
	        return quantityOfItemPurchased;
	    }
	     
	    public void setPricePerItem (double price) {
	        pricePerItem = price;
	    }
	     
	    public double getPricePerItem () {
	        return pricePerItem;
	    }
	     
	    public double getInvoiceAmount () {
	        double calculateTotalAmount;
	        calculateTotalAmount = quantityOfItemPurchased * pricePerItem;
	        return calculateTotalAmount;
	    }
	
}
