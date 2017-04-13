
public class Find_Room_Class extends Add_Customer_Class{

	public void find_Room(String[] c) {
		System.out.print("Enter customer name :- ");//prompt for customer name
		setCustomerName(inputAdd.nextLine());
		
		for(int x = 0; x < 10; x++){//for loop for check all the rooms
			if(c[x].toLowerCase().equals(getCustomerName().toLowerCase())){//convert array element and customer name into lower case
				System.out.println("Mr./Mrs./Miss "+getCustomerName()+" is in the room " + x );//print the room details
			}
		}
	}
}
