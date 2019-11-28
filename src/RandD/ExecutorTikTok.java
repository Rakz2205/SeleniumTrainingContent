package RandD;

import java.io.IOException;

public class ExecutorTikTok {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		try {
			//Runtime.getRuntime().exec( "wscript " );
			
			
			String path=System.getProperty("user.dir");
			path="D:\\CT TP\\Viva CT 2019\\Video\\exceute.vbs";
			Runtime.getRuntime().exec(new String[] {"wscript.exe",path});
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
