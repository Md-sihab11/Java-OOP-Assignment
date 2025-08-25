public class Types_of_Variable{

    //instance variable
    int B=13;

    public void methode()
    {
        //local variable 
        int A=22;
        System.out.println("Hello, My name is Shihab!!");
        System.out.println("My age "+A+".");
        System.out.println("I have comppleted "+B+ " Years school");
    }

    public static void main(String[] args) {
        Types_of_Variable ob1 = new Types_of_Variable();
        Types_of_Variable ob2 = new Types_of_Variable();

        //setting this value for ob1
        ob1.B=20;

        ob1.methode();
        ob2.methode();
        
    }

}