import java.io.*;

class JavaRen5 {
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        String  name[];
        int     score[];
        int     class_cnt , maxIndex = 0 , for_i;

        //=== main ===
        System.out.print(">> クラスの人数を入力 : ");
        class_cnt = Integer.parseInt( bin.readLine() );

        name    = new String[ class_cnt ];
        score   = new int[ class_cnt ];

        for(for_i=0; for_i<class_cnt; for_i++){
            System.out.print("    >> 氏名を入力 : ");
            name [ for_i ]   = bin.readLine();
            System.out.print("    >> 得点を入力 : ");
            score[ for_i ]   = Integer.parseInt( bin.readLine() );
            if (score[ for_i ] > score[ maxIndex ]) {
                maxIndex = for_i ;
            }
        }

        System.out.println(name[ maxIndex ] + "\n" + score[ maxIndex ]);

    }
}
