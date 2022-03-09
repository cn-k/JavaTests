package lambda;

interface Cab{
     void bookCap(String source, String destination);
}
public class LambdaApp {
    public static void main(String[] args) {
        Cab cab = (source, dest) -> System.out.println("UberX booked from " + source + " to " + dest);
        cab.bookCap("Maltepe", "Kadıköy");
    }
}
