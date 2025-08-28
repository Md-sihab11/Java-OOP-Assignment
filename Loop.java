// Source code is decompiled from a .class file using FernFlower decompiler.
public class Loop {
   public Loop() {
   }

   void m(int ...a) {
      int sum = 0;
      for(int i:a){
         sum+=i;
      }
      System.out.println("Results: " + sum);
   }

   public static void main(String[] args) {
      Loop ob = new Loop();
      ob.m(10);
      ob.m(10, 20);
      ob.m(10, 20, 30);
   }
}
