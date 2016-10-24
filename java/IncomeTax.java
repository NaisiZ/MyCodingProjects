package hw5;

public class IncomeTax                                   
{
    double calculateTax(int x)
        {
            return (x*0.25);
        }
}

class FederalIncomeTax 
extends IncomeTax       
{
 double calculateTax(int x)
     {
         return x*0.1;
     }
    
 void printTax()
     {
         System.out.println("Total Income Tax: " + super.calculateTax(10000));       
         System.out.println("Federal Income Tax: " + this.calculateTax(10000));            
     }
}

class StateIncomeTax extends IncomeTax           
{
    double calculateTax(int x)
        {
            return x*0.15;
        }
       
    void printTax()
        {
            System.out.println("Total Income Tax = " + super.calculateTax(10000));           
            System.out.println("State Income Tax = " + this.calculateTax(10000));           
        }
       
}

class Demo           
{
 public static void main(String args[])
     {
         FederalIncomeTax fTax = new FederalIncomeTax();
         StateIncomeTax sTax = new StateIncomeTax();              
        
         fTax.printTax();
         sTax.printTax();
     }
}
