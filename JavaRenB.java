import java.io.*;

class JavaRenB {
//class Array1
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        String  names[] = {"Kudoh", "Satoh", "Katoh", "Saitoh", "Sudoh"}; //氏名群
        String  adrss[] = {"Aichi", "Kyoto", "Chiba", "Miyagi", "Tokyo"}; //住所群
        String  nm;
        int     ad_array[]  = new int[names.length],for_i;
        Address address     = new Address(names,adrss,ad_array) ;
        //=== main ===
        println("> 前方一致で検索を行います。");
        print("> 検索氏名を入力してください : ");
        ad_array = address.match(bin.readLine());
        for (for_i = 0; for_i < names.length; for_i++) {
            if (ad_array[for_i] >= 0) {
                println(names[for_i] +" : "+ adrss[for_i] );
            }
        }


    }

    public static void print(String hoge){
        System.out.print(hoge);
    }

    public static void println(String hoge){
        System.out.println(hoge);
    }
}
class Address {
    String names[],addresis[];
    int i,match_i,add_array[];
    public Address (String names_input[],String addresis_input[],int ad_array[]) {
        names    = names_input ;
        addresis = addresis_input;
    }
    public int[] match (String nm) {
        add_array = new int[names.length];
        for (i = 0; i < names.length; i++){
            add_array[i] = names[i].indexOf(nm);
        }
        return add_array;
    }


}
