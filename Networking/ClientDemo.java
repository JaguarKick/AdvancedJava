import java.io.*;
import java.net.*;


public class ClientDemo {
	private static ObjectOutputStream oos = null;
	private static ObjectInputStream ois = null;
	private static Socket socks = null;
	private static InetAddress host = null;
	
	private static void initClient() throws Exception {
		host = InetAddress.getLocalHost();
		socks = new Socket(host.getHostName(),3345);
		oos = new ObjectOutputStream(socks.getOutputStream());
		ois = new ObjectInputStream(socks.getInputStream());
	}
	
	public static void main(String args[]) throws Exception {
		initClient();
		oos.writeObject(args[0]);
		System.out.println((String)ois.readObject());
		Thread.sleep(100);
		socks.close();
		ois.close();
		oos.close();
	}
}
