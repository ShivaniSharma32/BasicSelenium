package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Working_With_Properties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\dell\\Desktop\\Selenium\\testdata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		System.out.println(pobj.getProperty("url"));
		System.out.println(pobj.getProperty("un"));
		System.out.println(pobj.getProperty("pwd"));
	}

}
