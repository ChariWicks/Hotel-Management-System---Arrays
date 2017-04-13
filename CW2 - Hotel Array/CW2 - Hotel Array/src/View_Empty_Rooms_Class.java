import java.util.Scanner;

public class View_Empty_Rooms_Class extends Add_Customer_Class{

	public void view_Empty_Rooms(String[] a) {
		
		for(int x = 0; x < 10; x++){//for loop to check all the rooms
			if(a[x].equals("e")){//check for an array element which is "e"
				System.out.println("room " + x + " is empty!");//print the empty rooms
			}
		}
	}

}
