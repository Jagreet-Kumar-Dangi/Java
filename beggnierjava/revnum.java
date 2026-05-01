package beggnierjava;



class rev
{
    public int revNumber(int n)
    {
        int r=0;
        while(n !=0){
            int mod=n%10;
            r =r*10+mod;
            n /=10;
        }
        return r;
    }
}
class prime
{
    public void primeNum(int n2)
    {
        boolean flag=true;
        for(int i=2;i<n2;i++){
            if(n2%i ==0 )
                flag=false;
            }
        if(flag || n2==2)
            System.out.println(n2+" is a prime number.");
        else
            System.out.println(n2+" is not a prime number.");
            
    }
}
public class revnum {
    public static void main(String[] args) {
        int num=1234;
        rev obj1=new rev();
        int res=obj1.revNumber(num);
        int num2=2;
        prime obj2=new prime();
        obj2.primeNum(num2);
        System.out.println("Reverse of a number is- "+res);
        
    }
}
