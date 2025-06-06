/*
 * 1. Create a class called Invoice that a hardware store might use to represent 
an invoice for an item sold at the store. An Invoice should include four 
pieces of information as instance variables—a part number (type String), a 
part description (type String), a quantity of the item being purchased (type 
int) and a price per item (double). Your class should have a constructor 
that initializes the four instance variables. Provide a set and a get method 
for each instance variable. calculates the invoice amount (i.e. multiplies the 
quantity by the price per item), then returns the amount as a double value. 

 */
package asignment2;

class invoice{
	
	String partNO;
	String partDescription;
	int quantity;
	double pricePerItem;
	
	invoice(String partNO, String partDescription, int quantity, double pricePerItem){
		this.partNO = partNO;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public String getPartNO() {
		return partNO;
	}
	public void setPartNO(String partNO) {
		this.partNO = partNO;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	void getInvoiceAmount(){
		double tBill = 0;
		if(quantity<0) {
			setQuantity(0);
		}
		if(pricePerItem<0.0) {
			setPricePerItem(0.0);
		}
		tBill = getQuantity()*getPricePerItem();
		System.out.println("Your Total Bill is:- "+ tBill);
	}
	
}

public class q1 {

	public static void main(String[] args) {
		
		invoice i = new invoice("A237", "HeadLight", 5, 200.0);
		i.getInvoiceAmount();
		invoice j = new invoice("A237", "HeadLight", -5, 200.0);
		j.getInvoiceAmount();
		invoice k = new invoice("A237", "HeadLight", 5, -200.0);
		k.getInvoiceAmount();
		invoice l = new invoice("A237", "HeadLight", -5, -200.0);
		l.getInvoiceAmount();
	}

}
