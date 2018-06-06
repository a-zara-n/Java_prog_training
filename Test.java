import java.io.*;

class Test {
    public static void main (String args[]) throws IOException{
        int a=10 , b =20;
        if (a < b) {
            int w;
            w = a;
            a = b;
            b = w;
        }
        System.out.print(a);
        System.out.print(" < ");
        System.out.println(b);

    }
}
