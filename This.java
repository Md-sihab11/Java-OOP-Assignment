public class This {

    int a= 10;//60
    void m(int a)
    {
        //it's reffering to instance variable 
        System.out.println(this.a);
        System.out.println(a);
    }
    void m2(int a)
    {
        this.a=a;
        System.out.println(a);//60
    }
    void m3()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        This ob = new This();
        ob.m(50);
        ob.m2(60);
        ob.m3();
    }
}
