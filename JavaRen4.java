import java.io.*;

class JavaRen4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        String input_string;
        int input_size , outer_i , inner_i , wide , Center;

        System.out.println("全角文字の入力");
        input_string    = bin.readLine();

        System.out.println("サイズの入力");
        input_size      = Integer.parseInt( bin.readLine() );
        wide            = input_size * 2 - 1;
        Center          = Math.round(wide/2);
        for(outer_i=0;outer_i<input_size;outer_i++){
            String buf;
            if(outer_i == input_size - 1){
                buf = input_string;
            }else{
                buf = "0";
            }
            for(inner_i=1;inner_i<wide;inner_i++){
                if(inner_i >= Center-outer_i & Center+outer_i >= inner_i ){
                    buf += input_string;
                }else{
                    buf += inner_i;
                }
            }
            System.out.println(buf);
        }
    }
}
