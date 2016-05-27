package test;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;


public class Test {
    public static void main(String[] args) throws Exception{
        InetAddress i = InetAddress.getLocalHost();
        System.out.println(i.toString());
        System.out.println("address:"+i.getHostAddress());
        System.out.println("name:" + i.getHostName());


        InetAddress ia = InetAddress.getByName("www.google.com.hk");
        System.out.println(ia.toString());
        System.out.println("address:"+ia.getHostAddress());
        System.out.println("name:" + ia.getHostName());

        int distance =0;
        int val = -1;
        for (;val !=0;val <<=1){
            System.out.println("val="+val);
            distance ++;
        }
        System.out.println("val:"+val);
        System.out.println(distance);

        double ii = 0.0/0.0;
        System.out.println(ii);
        System.out.println(ii==0);

        ArrayList<Integer> arr2 = new ArrayList(Arrays.asList(1, 3, 6, 4));

        arr2.sort(Integer::compareTo);
        int infoI = 0;
        int infoJ = 0;
        while(true){
            if (infoJ == arr2.size()) break;
            if (infoI == arr2.get(infoJ)){
                infoJ ++;
            }else {
                System.out.println(infoI);
            }
            infoI ++;
        }


//        List<String> arr = Arrays.asList("N3", "N7", "N4", "N5", "N2");
//        IntSummaryStatistics statistics =
//                arr.stream()
//                        .mapToInt(s -> Integer.parseInt(s.substring(1)))
//                        .summaryStatistics();
//
//        long max = statistics.getMax();
//        long min = statistics.getMin();
//
//        long missing = max*(max+1)/2 - (min-1)*min/2 - statistics.getSum();
//        System.out.println(missing); // prints "6" here


            String allUrl = "ksjfskj/mobile/gateway/wechat/666/lkjh";
            System.out.println("=============1============"+allUrl.indexOf("/mobile/gateway/wechat/"));
            System.out.println("==========2=========="+allUrl.substring(allUrl.indexOf("/mobile/gateway/wechat/")));
    }


}
