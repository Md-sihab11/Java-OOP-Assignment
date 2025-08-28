// Source code is decompiled from a .class file using FernFlower decompiler.
public class Loop {
   public Loop() {
   }

   void m(int... var1) {
      int var2 = 0;
      int[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         var2 += var6;
      }

      System.out.println("Results: " + var2);
   }

   public static void main(String[] var0) {
      Loop var1 = new Loop();
      var1.m(10);
      var1.m(10, 20);
      var1.m(10, 20, 30);
   }
}
