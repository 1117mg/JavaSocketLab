package step1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String args[]) throws Exception{
        Socket sock = new Socket("127.0.0.1", 8888);
        String message1 = "Accept Best Wishes, My Server, 2015869 LeeYerim";

        OutputStream ostream = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ostream);
        dos.writeBytes(message1);
        dos.close();
        ostream.close();
        sock.close();
    }
}
