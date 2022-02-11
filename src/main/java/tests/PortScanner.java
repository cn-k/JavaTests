import java.io.IOException;
import java.net.*;

public class PortScanner {
    public static void main(String[] args) {
        InetAddress bilAdd = null;
        try{
            bilAdd = InetAddress.getByName("www.bilkent.edu.tr");
        }
        catch (UnknownHostException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        for(int i=0; i<100; i++){
            try {
                System.out.print(i + " ");
                InetSocketAddress inetSocketAddress  = new InetSocketAddress(bilAdd,i);
                Socket s = new Socket();
                s.connect(inetSocketAddress,500);
                System.out.println("\nPort " + i + "calismaktadir." );
            }
            catch (IOException io){
                //System.out.println("belirtilen portta hizmet bulunamamktadır.");
            }
        }
    }
}
