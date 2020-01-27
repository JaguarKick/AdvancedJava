import java.io.*;
import java.net.*;

public class ServerDemo {
	
	private static ServerSocket server = null;
	private static int port = 3345;
	private static Socket socks = null;
	
	private static void initServer() throws Exception{
		server = new ServerSocket(port);
	}
	
	private static void startServer() throws Exception {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		String message = "";
		
		while(true) {
			socks = server.accept();
			ois = new ObjectInputStream(socks.getInputStream());
			oos = new ObjectOutputStream(socks.getOutputStream());
			System.out.println("Server has started. Waiting for clients..");
			message = (String)ois.readObject();
			if(message.equalsIgnoreCase("bye"))
				break;
			System.out.println("Message from client 	: " + message);
			oos.writeObject("Message received.");
			Thread.sleep(100);
			ois.close();
			oos.close();
			socks.close();
		}
		server.close();
	}
	public static void main(String args[]) throws Exception {
		initServer();
		startServer();
	}

}
