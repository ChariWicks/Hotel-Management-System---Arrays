import java.util.Scanner;

public class Add_Customer_Class {

	private int roomNum;//variable for room number
	private String roomName;//variable for room name
	private String customerName ;//variable for store customer name
	private String choiceAdd; //variable to store your choice add more new customers
	public Scanner inputAdd = new Scanner(System.in);//public - because of sub classes
	public Welcome_Main objEncap = new Welcome_Main();//creating a object in Welcome_Main class, public - because of sub classes

	public void add_Customer(){
		
		do{
			do{
				System.out.print("Enter room number(0 - 9):- ");//prompt for enter room number
				setRoomNum(inputAdd.nextInt());
				if(getRoomNum() >9){
					System.out.println(" Enter a room number between 0 - 9!!!");//validation for room number
				}
			}while(getRoomNum() > 9);
		System.out.println("Enter name for room " + getRoomNum() + " :");//prompt for enter customer name
		roomName = inputAdd.next();
		objEncap.hotel[getRoomNum()] = roomName;//assigning room name to the array
			
		System.out.print("Do you want to add another customer then press Y otherwise N :- ");/*prompt for your choice
		of adding more customers*/									
		choiceAdd = inputAdd.next();
		System.out.println();
		}while(choiceAdd.equals("Y") || choiceAdd.equals("y"));
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
