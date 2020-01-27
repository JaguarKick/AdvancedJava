import java.io.*;
import java.net.*;

public class ServerDemoA {
	public static void main(String args[]) throws Exception {
		ServerSocket sSock = new ServerSocket(6666);
		Socket sock = sSock.accept();
		DataInputStream dis = new DataInputStream(sock.getInputStream());
		String message = (String)dis.readUTF();
		System.out.println("Message = " + message);
		sSock.close();
	}
}
