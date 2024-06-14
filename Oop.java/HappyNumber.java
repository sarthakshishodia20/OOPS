import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n){
        HashSet<Integer> list=new HashSet<>();
        while(true){
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2.0);
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            n=sum;
            if(list.contains(n)){
                return false;
            }
            else{
                list.add(n);
            }
        }
    }
    public static void main(String[] args) {
        
        int n=8;
        System.out.println(isHappy(n));
    }


    
}
