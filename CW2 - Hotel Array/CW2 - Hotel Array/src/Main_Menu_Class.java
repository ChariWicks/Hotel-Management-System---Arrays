import java.io.IOException;
import java.util.Scanner;

public class Main_Menu_Class {
	
	private Scanner inputMain = new Scanner(System.in);
	private View_Empty_Rooms_Class objEmpty = new View_Empty_Rooms_Class();//create object in View_Empty_Rooms_Class
	private Find_Room_Class objFind = new Find_Room_Class();//create object in Find_Room_Class
	private Delete_Customer_Class objDelete = new Delete_Customer_Class();//create object in Delete_Customer_Class
	private Store_Array_Class objStore = new Store_Array_Class();//create object in View_Empty_Rooms_Class
	private Load_Array_Class objLoad = new Load_Array_Class();//create object in Load_Array_Class
	private Welcome_Main obMain = new Welcome_Main();//create object in Welcome_Main
	private Sort_Order_Class obSort = new Sort_Order_Class();//create object in Sort_Order_Class
	private Add_Customer_Class obAdd = new Add_Customer_Class();//create object in Sort_Order_Class
	private View_All_Rooms_Class obView = new View_All_Rooms_Class();//create object in Sort_Order_Class
	
	public void main_Menu(String[] args) throws IOException{
		//Prompt for Main Menu
		System.out.println("----------------------");
		System.out.println("       Main Menu");
		System.out.println("----------------------");
		System.out.println();
		System.out.println(" E : Display Empty rooms");
		System.out.println(" D : Delete customer from room");
		System.out.println(" F : Find room from customer name");
		System.out.println(" S : Store program array data into a plain text file");
		System.out.println(" L : Load program data back from the file into the array");
		System.out.println(" O : View rooms ordered alphabetically by name");
		System.out.println(" A : Add new customer");
		System.out.println(" V : View all the rooms");
		System.out.println();
		
		String menuOption = inputMain.next();//variable to store main menu option//initializing it
		
		if (menuOption.trim().equalsIgnoreCase("E")){
			objEmpty.view_Empty_Rooms(obMain.hotel);//calling view_Empty_Rooms()
		}
		else if (menuOption.trim().equalsIgnoreCase("D")){
			objDelete.delete_Customer(obMain.hotel);//calling delete_Customer()
		}
		else if (menuOption.trim().equalsIgnoreCase("F")){
			objFind.find_Room(obMain.hotel);//calling find_Room()
		}
		else if (menuOption.trim().equalsIgnoreCase("S")){
			objStore.store_Array(obMain.hotel);//calling store_Array()
		}
		else if (menuOption.trim().equalsIgnoreCase("L")){
			objLoad.load_Array(obMain.hotel);//calling load_Array()
		}
		else if (menuOption.trim().equalsIgnoreCase("O")){
			obSort.sort_Order(obMain.hotel);//calling sort_Order()
		}
		else if (menuOption.trim().equalsIgnoreCase("A")){
			obAdd.add_Customer();//callingadd_Customer()
		}
		else if (menuOption.trim().equalsIgnoreCase("V")){
			obView.view_All_Rooms();//calling view_All_Rooms()
		}
		else{
			System.out.println("Invalid input!!");
		}
		
		main_Menu(args);
	
		
	}
}
