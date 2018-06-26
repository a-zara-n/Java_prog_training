import java.io.*;

class JavaRen8 {
//class Array1
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        int val, max, array[], cnt;

        //=== main ===
        array   = new int[10];
        forSetVal(array,bin);


    }

    public static int[] forSetVal(int array[],BufferedReader bin) throws IOException {
        int i=0,input_num;
        input_num = 0;
        while(true){
            if(i >10){
                i = 0;
            }

            print("数を入力 : ");
            input_num = Integer.parseInt( bin.readLine() );
            array[i] = input_num;

            if(input_num == -1){
                return array;
            }
            i++;
        }
    }

    private static void print(String hoge){
        System.out.print(hoge);
    }

    private static void println(String hoge){
        System.out.println(hoge);
    }
}
