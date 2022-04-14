package abstracts;

public class HumpbackWhale extends Whale {
    protected void sing() {
        System.out.println("Humpback whale is singing");
    }

    public static void main(String[] args) {
        HumpbackWhale hw = new HumpbackWhale();
        hw.sing();
    }
}
