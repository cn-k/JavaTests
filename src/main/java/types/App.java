package types;

public class App {
    public static void main(String[] args) {
        int x = 33;
        long y = 1;
        var z = x * y;
        System.out.println(((Object) z).getClass().getName());

        double a = 39.21;
        float b = 2.1f;
        var c = a + b;
        System.out.println(((Object) c).getClass().getName());

        short d = 10;
        short e = 3;
        var f = d * e;
        System.out.println(((Object) f).getClass().getName());

        short k = 14;
        float l = 13;
        double m = 30;
        var n = k * l / m;
        System.out.println(((Object) n).getClass().getName());
    }
}
