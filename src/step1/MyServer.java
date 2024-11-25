package step1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String args[]) throws Exception{
        ServerSocket sersock = new ServerSocket(8888);
        System.out.println("server is ready"); // message know the server is running

        Socket sock = sersock.accept();

        InputStream istream = sock.getInputStream();
        DataInputStream dstream = new DataInputStream(istream);

        String message2 = dstream.readLine();
        System.out.println(message2);
        dstream.close(); istream.close(); sock.close(); sersock.close();
    }
}
