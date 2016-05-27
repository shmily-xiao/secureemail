package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by simpletour_Jenkin on 2016/4/6.
 */
public class SocketTest {

    public static void main(String[] args) throws IOException{
        try(Socket s = new Socket("time-A.timefreq.bldrdoc.gov",13))
        {
            InputStream inputStream = s.getInputStream();
            Scanner in = new Scanner(inputStream);
            while (in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
        }
        if(args.length > 0){
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for (InetAddress inetAddress : addresses){
                System.out.println(inetAddress);
            }
        }else {
            InetAddress localHostAddress = InetAddress.getLocalHost();
            System.out.println(localHostAddress);
        }
    }
}
