import java.net.*;
import java.io.*;

public class ClientDemoB {
	public static void main(String args[]) throws Exception {
		Socket sSock = new Socket("127.0.0.1",6666);
		DataInputStream dis = new DataInputStream(sSock.getInputStream());
		DataOutputStream dos = new DataOutputStream(sSock.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String message = "";
		String response = "";

		while(!message.equals("stop")) {
			message = br.readLine();
			dos.writeUTF(message);
			dos.flush();
			response = dis.readUTF();
			System.out.println("Response from Server : " + response);
		}
		dos.close();
		sSock.close();
	}
}
