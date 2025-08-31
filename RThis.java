public class RThis {

    int a =90;//100
    void M1(int a )
    {
        a =a;
        System.out.println(a);
    }
    void M2(int a){
        a=this.a;
        System.out.println(a); this.M3();
    }
    void M3(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        RThis ob = new RThis();
        ob.M1(100);
        ob.M2(200);

    }
}
//dry run= 100,90,90
