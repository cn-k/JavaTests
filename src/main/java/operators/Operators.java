package operators;

public class Operators {
    public static void main(String[] args) {
        short x = 10;
        short y = 3;
        var z = x * y;
        System.out.println(((Object) z).getClass().getName());

        int trainer = (int)1.0;
        short ticketTaker = (short)1921222;  // Stored as 20678
        int usher = (int)9f;
        long manager = 192301398193810323L;

        System.out.println("trainer: " + trainer);
        System.out.println("ticketTaker: " + ticketTaker);
        System.out.println("usher: " + usher);
        System.out.println("manager: " + manager);
        if(x++ ==10){
            System.out.println(x);
        }
    }
}
