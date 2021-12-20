package lab9_image_processing;

public class TestArray {

    public static void main(String[] args) {
        double[] foo = new double[1000];
        for (int i = 0; i < foo.length; i++) {
            foo[i] = i+1;
        }
        System.out.println(new TestArray().average(foo));
    }

    public double average(double[] tableau){
        double total = 0.0;
        for (double d : tableau) {
            total += d;
        }
        
        return (total/tableau.length);
    }
}
