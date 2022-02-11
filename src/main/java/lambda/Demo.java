package lambda;

public interface Demo {
    void abc();
    static void show(){
        System.out.println("");
    }
}
 class Test{
    public static void main(String[] args) {
        
        Demo.show();
        System.out.println(Test.tst());

    }
    public static int tst(){
        boolean check = false;
        int res = 0;
        try{
            if(check){
                res = 1;
                return res;
            }
        }
            catch(Exception e){
                e.printStackTrace();
            }
            finally{
                res =  2 ;
            }
            return res;
            
    }
}

