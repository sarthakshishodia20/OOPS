public class BitMani{
    public static int countBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static boolean powoftwo(int n){
        if(n<=0){
            return true;
        }
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static int oddEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
           return 1;
        }
        else{
            return 0;
        }
    }
    public static int getBit(int n,int i){
        int bitmask=1<<i;
        if((n&(bitmask))==0){
            return 0;

        }
        else{
            return 1;
        }
    }
    public static void setBit(int n,int i){
        int bitmask=1<<i;
        System.out.println(n&bitmask);
    }
    public static void setRangeBit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int c=a|b;
        System.out.println(n&c);
    }
    
    public static void main(String[] args) {
        
    }
}