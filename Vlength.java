public class Vlength {

    //it's behave like an array
    void M(int ...a)
    {
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Vlength ob =new Vlength();
        ob.M(10);
        ob.M(40,10);
        ob.M(10,20,30);
    }
    
}
//dry run = 10,50,60