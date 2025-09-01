public class Polymorphism {

    //overloading 
    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Polymorphism ob = new Polymorphism();
        ob.add(10, 20);
        ob.add(10,20,30);
        
    }
}