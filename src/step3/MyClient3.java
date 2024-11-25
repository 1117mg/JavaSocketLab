package step3;

import java.io.*;
import java.net.Socket;

public class MyClient3 {
    public static void main(String args[]) throws Exception{
        Socket sock = new Socket("127.0.0.1", 8888);

        // reding the file name from keyboard. Uses input stream
        System.out.print("Enter the file name: ");
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        String fname = keyRead.readLine();

        // sending the file name to server. Uses PrintWriter
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);
        pwrite.println(fname);

        // receiving the contents from server. Uses input stream
        InputStream istream = sock.getInputStream();
        BufferedReader socketRead = new BufferedReader(new InputStreamReader(istream));

        String str;
        while((str = socketRead.readLine()) != null)    // reading line-by-line
        {
            System.out.println("Received Contents From Server: " + str);
        }

        pwrite.close();
        socketRead.close();
        keyRead.close();
    }
}
