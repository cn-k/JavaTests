import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.StringFixedSaltGenerator;

public class App {
    public static void main(String[] args) {
        //StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        //encryptor.setAlgorithm("PBEWithMD5AndDES");
        //encryptor.setSaltGenerator(new StringFixedSaltGenerator( "ComplaintManagerXmpp+1"));
        //encryptor.setPassword("jasypt");
        //String dectypmessage="IMI9ljjLL4+BryErqsoRZfHmLiOG/YhkLiYspxnCW9ZKy5H6zBQbUO105LVDYW1f7zw+49rw4O+l8y3lxjWeufMQ7rUeYrmWnBPgZVXlA14gLEzXm4ezn3w4bMn/t2gwv9KIyjLlr5+XTJeQLoDeGL5Mid+iT4GU7XzR/B9j6OS07QYnN8YA+Al2WapPG66QiKMrh1CUcNc=" ;


        //String plainText = encryptor.decrypt(dectypmessage);
        System.out.println("test");
        //System.out.println(extractLast("n0bWO-125-45875788f2b5-a94186a6d185 "));
    }
    public static String extractLast(String test){
            int lastIndex = test.lastIndexOf("_");
            test=test.substring(0, lastIndex);
        return test;
    }
}
