
public class Delete_Customer_Class extends Add_Customer_Class {

	public void delete_Customer(String [] b) {
		System.out.print("Enter customer name :- ");//prompt for customer name
		setCustomerName(inputAdd.nextLine());
		
		for(int x = 0; x < 10; x++){//for loop for check all the rooms
			if(b[x].toLowerCase().equals(getCustomerName().toLowerCase())){//convert array element and customer name into lower case
				b[x] = "e";//replace e to hotel[x] element
				System.out.println("Room num " + x +" is now empty!");//Show that room is now empty 
			}
		}
	}
}
