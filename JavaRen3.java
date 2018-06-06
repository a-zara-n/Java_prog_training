import java.io.*;

class JavaRen3{
    public static void main ( String args[] ) throws IOException {
        BufferedReader bin = new BufferedReader( new InputStreamReader( System.in ) );
        String msg;
        double height , weight ;
        System.out.println("氏名を入力してください");
        msg = bin.readLine() + "さんの標準体重は ";
        System.out.println(msg + "さんの身長は？");
        height = Integer.oarseInt( bin.readLine() );
        weight = ( height - 100 ) * 0.9;
        System.out.println( msg + height + "kgです");
    }
}
