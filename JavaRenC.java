import java.io.*;
import java.util.*;

class JavaRenC {
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        String      types[] = {"Infomation","Science","College","Network","System","Department"};
        TypingStr   tAry[]  = new TypingStr[types.length];
        boolean     isStringTrue;
        int         for_i,i;

        //=== main ===
        for (for_i = 0; for_i < types.length; for_i++) {
            tAry[for_i] = new TypingStr(types[for_i]);
            tAry[for_i].start();
            isStringTrue = false;
            print("[問題] "+ types[for_i] +" : ");
            while(!types[for_i].equals(bin.readLine()) ){}
            tAry[for_i].check();
        }
        println("\n====== 結果 ======");
        for (for_i = 0; for_i < tAry.length; for_i++) {
            tAry[for_i].dispResult();
        }

    }

    public static void print(String hoge){
        System.out.print(hoge);
    }

    public static void println(String hoge){
        System.out.println(hoge);
    }
}
class TypingStr {
    String  typeStr;
    long    elapsed;

    public TypingStr (String types_i) {
        typeStr = types_i;
    }

    public void start () {
        elapsed = java.util.Calendar.getInstance().getTimeInMillis();
    }

    public boolean check () {
        elapsed = java.util.Calendar.getInstance().getTimeInMillis() - elapsed;
        return true;
    }

    public void dispResult () {
        String spaceStr = "             ";
        int typeLen = typeStr.length() ;
        System.out.print(typeStr + spaceStr.substring(typeLen));
        System.out.println(": " + elapsed + "ms");
        return ;
    }
}
