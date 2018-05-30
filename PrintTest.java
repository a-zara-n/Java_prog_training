import java.io.*;
class PrintTest {
    public static void main(String args[]) throws IOException{
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in) );
        int i,sum;
        sum = 0;
        for(i =1;i<=100;i++){
            sum = sum + i;
        }
        System.out.println("Hello Java World");
        System.out.print("1~100までの数字を総和したものは : ");
        System.out.print(sum);
        System.out.println("です。");
    }
}
