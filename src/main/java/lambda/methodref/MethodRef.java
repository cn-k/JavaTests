package lambda.methodref;

@FunctionalInterface
interface Calculator{
    void add(int num1, int num2);
}
class Calc {
    public static void addSomething(int num1, int num2){
        System.out.println(num1 + " and " + num2 + " addition is " + (num1 + num2));
    }
    public void addSomethingElse(int num1, int num2){
        System.out.println(num1 + " and " + num2 + " addition is " + (num1 + num2));
    }
}

interface Messenger{
        Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.println(">> Message is: " + msg);
    }
}
public class MethodRef {
    public static void main(String[] args) {
        //reference a static method
        Calculator calc = Calc::addSomething;
        calc.add(10,20);
        //reference a non static method
        Calc clc = new Calc();
        Calculator calculator = clc::addSomethingElse;
        calculator.add(50,100);

        Messenger messenger = Message::new;
        messenger.getMessage("first message");

    }
}