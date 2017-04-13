import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Load_Array_Class extends Store_Array_Class {

	public void load_Array(String [] e) throws IOException {
		File searchFile = new File("Room_details.txt");//create search file object
		FileReader sfReader = new FileReader(searchFile);//create sfReader object
		BufferedReader reader = new BufferedReader(sfReader);//create bufferedReader object
		
		int i = 0;
		String str = null;//string variable for keep line by line from text file
		while((str= reader.readLine()) != null){//reads text file it has lines 
			e[i] = str;//assign str value to hotel[] 
			System.out.println(e[i]);//print i index of the array
			i++;//increments i by 1
		}
	}
}
