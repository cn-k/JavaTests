package tests;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DayTimeClient {
    public static void main(String[] args) {
        InetAddress host = null;
        try{
            host = InetAddress.getByName("www.bilkent.edu.tr");
        }
        catch (UnknownHostException e){
            System.err.println(e);
            System.exit(0);
        }
        try{
            Socket theSocket = new Socket(host,13);
            InputStream is = theSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();
            while(data != null) {
                System.out.println(data);
                data = br.readLine();
            }
        }
        catch (IOException e){

        }
    }
}
