package readproperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) {
		
		FileReader input=null;
   
		try {
			input=new FileReader("C:\\Users\\nisha\\eclipse-workspace\\July23Intership\\src\\readproperties\\data.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Properties p=new Properties();
		
		try {
			p.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(p.getProperty("username"));
	}
   
     	
	
}
