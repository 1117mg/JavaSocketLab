package step3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer3 {
    public static void main(String args[]) throws Exception{
        // 2015869 이예림
        // establishing the connection with the server
        ServerSocket sersock = new ServerSocket(8888);
        System.out.println("Sevrer ready for connection");
        Socket sock = sersock.accept();             // binding with port: 4000
        System.out.println("Connection is successful and waiting for chatting");

        // reading the file name from client
        InputStream istream = sock.getInputStream();
        BufferedReader fileRead = new BufferedReader(new InputStreamReader(istream));
        String fname = fileRead.readLine();

        // reading file contents
        BufferedReader contentRead = new BufferedReader(new FileReader(fname));

        // keeping output string ready to send the contents
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);

        String str;
        while((str = contentRead.readLine()) != null) // reading line-by-line from file
        {
            System.out.println("Received Contents From Client: " + str);
            System.out.println("Re-Sending Received Contents" + str);
            pwrite.println(str);
        }

        sock.close();
        sersock.close();    // closing network sockets
        pwrite.close();
        fileRead.close();
        contentRead.close();
    }
}
