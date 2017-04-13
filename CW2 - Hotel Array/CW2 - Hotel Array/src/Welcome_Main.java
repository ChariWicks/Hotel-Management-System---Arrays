import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author HP
 *
 */
public class Welcome_Main {

	private static Scanner input = new Scanner(System.in);
	private static String cont;//variable to store C or c(continue after welcoming note)
	public static String choice1;//variable to store B or CReturn back to the welcoming note)
	public static String [] hotel = new String[10];//creating an array of size 10 to store store customer name
	private static Add_Customer_Class obj2 = new Add_Customer_Class();//creating an object in Add_Customer_Class
	private static View_All_Rooms_Class obj1 = new View_All_Rooms_Class();//creating an object in View_All_Rooms_Class
	private static Main_Menu_Class obj3 = new Main_Menu_Class();//creating an object in Main_Menu_Class
	
	/**
	 * @param args
	 *@throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		for(int x = 0; x < 10; x++){//initializing the hotel array
			hotel[x] = "e";
		}
		
		//Welcome note
		//main looping code
		do{
		System.out.println("*****************************************************");
		System.out.println("                   "+"Welcome");
		System.out.println("                     "+"to");
		System.out.println("                "+"Hotel Budapest!");
		System.out.println("*****************************************************");
		System.out.println();
		
		boolean contChoice = false;//this variable will be true if user type a letter other than C or c 
		
			do{//do while loop for first input validation
				System.out.print("To continue press C :- ");//asking to continue procedure
				cont = input.nextLine();
				if(!(cont.equals("C") || (cont.equals("c")))){//checking input choice
					System.out.println("Please, Enter C or c on the given space");//warning message
					contChoice = true;
				}
			}while(contChoice == true);
			
			obj2.add_Customer();//calling add_Customer method using obj2
			obj1.view_All_Rooms();//calling view_All_Rooms method using obj1
			
			promt_B_M();//calling prompt_B_M method
		}while(choice1.equals("B") || (choice1.equals("b")));	
		
		obj3.main_Menu(args);//calling main_Menu method
	}
	
	public static void promt_B_M(){
		do{
			System.out.println("Press B to go back to the beginning of the page ");
			System.out.println("Press M to go to the main menu");
			System.out.println();
			choice1 = input.nextLine();
		}while(!(choice1.equals("B")||choice1.equals("b")||choice1.equals("m")||choice1.equals("M")));//input validation
	}
}
