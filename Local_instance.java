public class Local_instance {

    int N;
    //S should be capital!!
    String name;

    void display() {
        int num = 10;  // local variable
        System.out.println("Local variable: " + num);
    }

    void M(int a, String n)//capital
    {
        N=a;
        name=n;
        System.out.println("Age "+N+"\nName "+name);
    }
    public static void main(String[] args) {
        Local_instance t = new Local_instance();
        t.display();
        t.M(22,"Shakib");
    }
    
}

