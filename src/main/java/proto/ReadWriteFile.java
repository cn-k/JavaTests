package proto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {
    public static void writeToFile(String filePath){
        final AlbumProtos.Album albumMessage = AlbumProtos.Album.newBuilder()
                .setTitle("Songs from the Big Chair")
                .setReleaseYear(1985)
                .setArtist("Tears For Fears").build();
        final byte[] binaryAlbum = albumMessage.toByteArray();

            FileOutputStream out;
            try {
                out = new FileOutputStream(filePath);
                albumMessage.writeTo(out);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
              catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }
    public static void readFromFile(String filePath){
        try {
            AlbumProtos.Album alb = AlbumProtos.Album.parseFrom(new FileInputStream(filePath));
            System.out.println(alb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
