import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Store_Array_Class extends Add_Customer_Class {

	public void store_Array(String[] d) throws IOException {
		
		File as =  new File("Room_details.txt");//create a file object
		FileWriter asfw =  null;//create a file writer object
		PrintWriter aspw = null;//create a print writer object
		asfw =  new FileWriter(as,true);//auto flushing
		aspw =  new PrintWriter(asfw, true);//appending
		
		for(int i = 0; i < 10; i++){//for loop for check all the rooms
			if(d[i].equals("e")){//choose empty array elements
				aspw.write("Room " + i + " is empty!");
				aspw.println();
			}else{//choose occupied array element
				aspw.write("Room " + i  + " is occupied by "  + objEncap.hotel[i]);
				aspw.println();
			}
		}
		aspw.close();//closing print writer object
		aspw.close();//closing file writer object
	}
}
 