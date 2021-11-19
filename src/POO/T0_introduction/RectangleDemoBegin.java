package POO.T0_introduction;

public class RectangleDemoBegin {
  
    public static void main(String args[]) {      
      Rectangle r1 = new Rectangle();
      r1.height = 4;
      r1.width = 4;
      
      Rectangle r2 = new Rectangle();
      r2.height = 5;
      r2.width = 6;
      
      Rectangle r3 = new Rectangle();
      r3.height = 2;
      r3.width = 2;
      
      int totalArea = r1.area();
      totalArea += r2.area();
      totalArea += r3.area();
      
      System.out.println(totalArea);
      
    }
  }
