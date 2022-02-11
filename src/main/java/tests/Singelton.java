public class Singelton {
    private String s;
    private static Singelton singelton_instance=null;
    private String test;
    private  Singelton(){
        s = "Hello I am a string part of Singleton class";
        test = "Hello this is test";
    }
    public static Singelton getInstance(){
        if(singelton_instance==null){
            singelton_instance=new Singelton();
        }
        return singelton_instance;
    }
    public void setTest(String test){
        this.test=test;
    }
    public String getTest(){
        return this.test;
    }
}
