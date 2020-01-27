import java.net.*;
import java.io.*;

public class ClientDemoA {
	public static void main(String args[]) throws Exception {
		Socket sock = new Socket("127.0.0.1",6666);
		DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
		dout.writeUTF("Hello Server");
		dout.flush();
		dout.close();
		sock.close();
	}
}
