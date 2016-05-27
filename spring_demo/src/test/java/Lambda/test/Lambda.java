package Lambda.test;

//import org.testng.collections.Lists;
//import org.testng.util.Strings;

import org.glassfish.jersey.server.model.Suspendable;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.Socket;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by simpletour_java on 2015/7/3.
 */
public class Lambda {
    public static void main(String... args){
        String[] array = {"a", "b", "c"};

//        for(Integer i : Lists.newArrayList(1, 2, 3)){
//
////            Stream.of(array).map(item -> Strings.padEnd(item, i, '@')).forEach(System.out::println);
//
//        }


        String sss = "Mozilla/5.0 (iPhone; CPU iPhone OS 8_4 like Mac OS X) AppleWebKit/600.1.4 (KHTML, like Gecko) Mobile/12H143 MicroMessenger/6.2.3 NetType/WIFI Language/zh_CN";
        System.out.println(sss.contains("MicroMessenger"));


        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR));

//
//        String host = "192.168.4.86";
//
//        int port = 6379;
//
//        try (Socket socket = new Socket(host,port)){
//
//            Map<String,String> map = new HashMap<>();
//            Scanner in = new Scanner(socket.getInputStream());
//            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
//            printWriter.println("set test 666");
//            printWriter.flush();
//            socket.shutdownOutput();
//            while (in.hasNextLine()){
//                String line = in.nextLine();
//                System.out.println(line);
//            }
//            socket.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }


        BigDecimal bigDecimal = new BigDecimal(20001.01);
        System.out.println(bigDecimal);
        bigDecimal = bigDecimal.divide(new BigDecimal(100));

        System.out.println(bigDecimal);

    }
}
