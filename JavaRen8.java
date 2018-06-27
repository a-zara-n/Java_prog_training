import java.io.*;

class JavaRen8 {
//class Array1
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        int val, array[], cnt;

        //=== main ===
        array   = new int[10];
        forSetVal(array,bin);
        forPrint(array);

    }

    public static int[] forSetVal(int array[],BufferedReader bin) throws IOException {
        int i=0,input_num;
        input_num = 0;
        while(true){
            if(i >= 10){
                println(">>> 満タンです");
                return array;
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
    public static void forPrint(int array[]){
        int i, max;
        println("内容は : ");
        max = 0;
        for (i = 0; i < array.length; i++) {
            print("「"+array[i]+"」");
            if(array[i]>max){
                max = array[i];
            }
        }
        println("最大は"+max+"です");
    }


    private static void print(String hoge){
        System.out.print(hoge);
    }

    private static void println(String hoge){
        System.out.println(hoge);
    }
}
