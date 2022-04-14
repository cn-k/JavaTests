package lambda.methodref;

interface Display {
    int show(String s1, String s2);
}

public class Test {
    public static int  doShow(String s1, String s2){
        return s1.lastIndexOf(s2);
    }

    public static void main(String[] args) {
        //scope resolution operator
        //sağ taraf implementasyon sol taraf instance
        //sağ taraftaki metodu soldaki interface üzerinde implement ediyor.
        Display display = Test::doShow;
        int res = display.show("akdeniz", "deniz");
        System.out.println(res);
    }
}
