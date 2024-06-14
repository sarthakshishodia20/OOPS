public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum((float)1.2,(float)3.4));
        System.out.println(sum(1,2,3));
    }


    
    // compile time polymorphism
    static int sum(int a,int b){
        return a+b;
    }
    static float sum(float a, float b){
        return a+b;
    }
    static int sum(int a ,int b,int c){
        return a+b+c;
    }
}
