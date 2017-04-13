
public class Sort_Order_Class extends Add_Customer_Class{
	Welcome_Main obS = new Welcome_Main();
	public void sort_Order(String[] x) {
		boolean finish = true; //determined when the sort is finished
		String temp; //variable helps to sort number
		
	        String[] newHotel = new String[x.length];//new array
	 
	        //copy values from hotel[] to newHotel[]
	        for(int i =0;i < x.length;i++)
	            newHotel[i] = x[i];
		
		while(finish){
			finish = false;
			for(int j = 0; j < newHotel.length-1; j++){
				if(newHotel[j].compareToIgnoreCase(newHotel[j+1]) >0){//comparing two letters
					temp = newHotel[j];
					newHotel[j] = newHotel[j+1];
					newHotel[j+1] = temp;
					//swapping two words
					finish  =  true;
				}
			}
		}
		sort_Order_Again(newHotel);//calling sort_Order_Again method
		
	}
	
	public void sort_Order_Again(String[] y){
		
		//swapping original index
		for(int i = 0;i < 10; i++){
			for(int k= 0; k < 10; k++){
				if(y[i].equals(obS.hotel[k]) && !(y[i].equals("e") && obS.hotel[k].equals("e"))){
					System.out.println("Room " + k + "is occupied by " + y[i]);
				}
			}
		}
	}
}
