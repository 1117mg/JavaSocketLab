package step4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkServer {
    public static void main(String[] args) throws Exception{
        ServerSocket sersock = new ServerSocket(9999);
        System.out.println("Talk Sever ready for chatting");
        Socket sock = sersock.accept();

        // reading from keyboard (keyRead object)
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

        // sending to client (pwrite object)
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);

        // receiving from server (receiveRead object)
        InputStream istream = sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

        String receiveMessage, sendMessage;
        System.out.println("Server>> Message Waiting");
        while(true)
        {
            if((receiveMessage = receiveRead.readLine()) != null)
            {
                System.out.println("Server>> Received Message from Client: " + receiveMessage);
            }
            System.out.print("Server>> Enter Sending Message: ");
            sendMessage = keyRead.readLine();
            pwrite.println(sendMessage);
            System.out.println("-> Over: Server Waiting");
            pwrite.flush();
        }
    }
}
