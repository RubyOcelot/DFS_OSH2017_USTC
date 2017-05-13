import java.io.IOException;

public class DFS_server {
	
	private static final int controlPort=6666;
	private static final int dataPort=6668;
	
	public static void main(String args[]) throws Exception{

     	System.out.println("Server start");
     	
      	try{
	        Thread t = new controlConnect.ServerThread(controlPort);
	        t.start();
      	}catch(IOException e){
      		e.printStackTrace();
      	}   
      	
      	try{
	        Thread t = new dataConnect.ServerThread(dataPort);
	        t.start();
      	}catch(IOException e){
      		e.printStackTrace();
      	} 
	}
}