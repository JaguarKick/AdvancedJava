import java.io.*;
import java.net.*;


public class ClientDemo {
	private static ObjectOutputStream oos = null;
	private static ObjectInputStream ois = null;
	private static Socket socks = null;
	private static InetAddress host = null;
	
	private static void initClient(String host_ip) throws Exception {
		try{
			host = InetAddress.getLocalHost();
			socks = new Socket(host_ip,3345);
			oos = new ObjectOutputStream(socks.getOutputStream());
			ois = new ObjectInputStream(socks.getInputStream());
		}catch(ConnectException conEx) {
			System.out.println("Unable to connect to the server. Possible reasons :-");
			System.out.println("1. Server is not running.");
			System.out.println("2. Firewall is blocking the connection.");
			System.exit(1);
		}
	}
	
	public static void main(String args[]) throws Exception {
		initClient(args[0]);
		oos.writeObject(args[1]);
		try{
			System.out.println((String)ois.readObject());
		}catch(EOFException eof) {
			System.out.println("Connection to the server has been closed.");
		}
		Thread.sleep(100);
		socks.close();
		ois.close();
		oos.close();
	}
}
