
public class View_All_Rooms_Class {

		public void view_All_Rooms() {
			
			Welcome_Main objEncapV = new Welcome_Main();//creating an object in Welcom_Main class
			for(int x = 0; x < 10; x++){
				System.out.println("room " + x + " occupied by " + objEncapV.hotel[x]);//view all rooms
			}
			System.out.println();
		}
}
