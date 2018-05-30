import java.io.*;

class JavaRen2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bin =new BufferedReader(new InputStreamReader(System.in));
        String box_black ="◾️";
        String box_white ="◽️";
        int  fast_loop_i,second_loop_i;
        for(fast_loop_i =0;fast_loop_i < 10;fast_loop_i++){
            for(second_loop_i =0;second_loop_i < 10;second_loop_i++){
                if((fast_loop_i+second_loop_i)%2 == 0){
                    System.out.print(box_black);
                }else{
                    System.out.print(box_white);
                }
            }
            System.out.println("");
        }
    }
}
