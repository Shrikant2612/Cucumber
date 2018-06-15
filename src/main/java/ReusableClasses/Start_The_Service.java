package ReusableClasses;

import java.io.IOException;

public class Start_The_Service {

	
	public static void clickonexe(String Absoulate_path) throws IOException, InterruptedException
	{
	
	 String path=Absoulate_path;
	 
	 Runtime run=Runtime.getRuntime();
	 Process pr=run.exec(path);
	 Thread.sleep(5000);
	 

			
}
}
