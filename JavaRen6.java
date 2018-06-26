import java.io.*;

class JavaRen6 {
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        String  board[][];
        String  black_box = "◼️" , white_box = " " ;
        int     width , hight , width_i , hight_i;

        //=== main ===
        System.out.print(">> 縦を入力 : ");
        hight   = Integer.parseInt( bin.readLine() );
        System.out.print(">> 幅を入力 : ");
        width   = Integer.parseInt( bin.readLine() );

        board   = new String[hight][width];

        for(hight_i=0; hight_i <hight; hight_i++ ){
            for(width_i=0; width_i < width; width_i++){
                if(hight_i == 0 || hight_i == hight - 1){
                    board[ hight_i ][ width_i ] = black_box;
                }else if (width_i == 0 || width_i == width - 1){
                    board[ hight_i ][ width_i ] = black_box;
                }else{
                    board[ hight_i ][ width_i ] = white_box;
                }
            }
        }
        for(hight_i=0; hight_i <hight; hight_i++ ){
            System.out.println();
            for(width_i=0; width_i < width; width_i++){
                System.out.print( board[ hight_i ][ width_i ] );
            }
        }
    }
}
