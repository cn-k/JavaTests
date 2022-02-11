package multithreading;

public class App {
    public static void main(String[] args) {
        Hello hello = new Hello();
        Hi hi = new Hi();
        hello.start();
        hi.start();
    }
}
class Hello extends Thread{
       @Override
       public void run() {
           // TODO Auto-generated method stub
           //super.run();
           for(int i=0; i<5; i++){
               System.out.println("Hello");
               try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           }
       } 
}
class Hi extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        //super.run();
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}