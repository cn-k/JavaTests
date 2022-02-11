package tests;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ConWebMaster {
    public ConWebMaster(String [] args) throws IOException {
        String fileUrl;
        for(int i=0;i<args.length;i++){
            BufferedReader br = new BufferedReader(new FileReader(args[i]));
            while((fileUrl = br.readLine())!=null){
                ReceiverThread curlThread = new ReceiverThread(fileUrl);
            }
        }
    }
    class ReceiverThread extends Thread{
        int amount;
        String file;
        BufferedInputStream in;
        FileOutputStream out;
        byte [] buffer;

        ReceiverThread(String fileUrl) throws IOException {
        URL u = new URL(fileUrl);
        String filePath = u.getPath();
        file = filePath.substring(filePath.lastIndexOf("/")+1);
        in = new BufferedInputStream(u.openStream());
        out = new FileOutputStream(file);
        buffer = new byte [1000];
        }

        @Override
        public void run() {
            System.out.println("Starting file");
            try {
                while((amount = in.read(buffer))!= -1){
                    out.write(buffer,0,amount);
                }
                in.close();
                out.close();
            }
            catch (Exception e){
                System.out.println("Error occoured");
            }
            System.out.println("Finishing " + file);
        }
    }

    public static void main(String[] args) throws IOException {
        String []arg={"/Users/cenkakdeniz/Desktop/projects/intellij/JavaTests/src/main/resources/jpegs.txt"};
    }
}
