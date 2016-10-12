package Set2_Exercise;

import java.util.Scanner;

public class InvoiceTest {
	public static void main(String[] args){
		
		Invoice invoice = new Invoice (" ", " ", 0, 0.0); 
		Scanner input = new Scanner (System.in);
	         
        String number;
        String description;
        int quantity;
        double price;
        
        System.out.print ("Please enter item number: ");     
		number = input.nextLine();
        invoice.setPartNumber(number);
        
		System.out.print ("Enter Description of Item Purchased: ");
        description = input.nextLine();
        invoice.setPartDescription(description);
         
        System.out.print ("Enter The Quantity of Item Purchased: ");
        quantity = input.nextInt();
        if (quantity > 0)
        invoice.setQuantityOfItemPurchased(quantity);
         
        System.out.print ("Enter The Price Per Item: ");
        price = input.nextDouble();
        if (price > 0)
        invoice.setPricePerItem (price);
         
        System.out.printf ("The Total Amount for all items purchased = $%.2f\n",
                invoice.getInvoiceAmount());
 
	}
}
