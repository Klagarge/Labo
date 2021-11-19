package series.C05S03_loops;

public class C05EX03 {
    public static void wait(int ms)
{
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}
    public static void main(String[] args) {
        int x = 2147483640;
        for (int i = 0; i < 10; x++) {
            System.out.println(x);
            wait(100);
        }
    }
}
