import java.util.Scanner;

public class IntToRom {
    public static int getValue(char ch){
        switch(ch){
            case 'I':return 1;
            
            case 'V':return 5;
            
            case 'X':return 10;
            
            case 'L':return 50;

            
            case 'C':return 100;
            
            case 'D':return 500;
            
            case 'M':return 1000;
            default: return 0;
        }
    }
    public static int RomtoInt(String S){
        int n=S.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch1=S.charAt(i);
            if((i+1)<n && getValue(ch1)<getValue(S.charAt(i+1))){
                sum=sum-getValue(ch1);}
            else{
                sum=sum+getValue(ch1);
            }
        }
        return sum;
    }
    public static String Roman(int num){
        String res="";
        String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;num!=0;i++){
            while(num>=value[i]){
                num-=value[i];
                res+=symbol[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        obj.close();
        System.out.println(Roman(num));
        // RomtoInt("X");
        System.out.println(RomtoInt("IX"));

    }
}
