/**
 * Created by Celia on 2/3/2017.
 */
public class TestFinal {
    public static void main (String args[]) {
        T t = new T();
        System.out.println(t.i);
    }
}
class T {
    final int i = 8;
}