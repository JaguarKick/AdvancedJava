import java.net.*;
import java.io.*;

public class ServerDemoB {
	public static void main(String args[]) throws Exception {
		ServerSocket sSock = new ServerSocket(6666);
		Socket sock = sSock.accept();
		
		DataInputStream dis = new DataInputStream(sock.getInputStream());
		DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		String message = "";
		String response = "";
		while(!message.equals("stop")) {
			message = dis.readUTF();
			System.out.println("Client said	: "+message);
			response = buff.readLine();
			dos.writeUTF(response);
			dos.flush();
		}
		dis.close();
		sock.close();
		sSock.close();
	}
}

