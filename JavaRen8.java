import java.io.*;

class JavaRen8 {
//class Score
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        int     sum , subject_point[], for_i ,subject_cnt;
        String  subject_name[],name;
        double  average;

        //=== main ===
        subject_name    = new String[3];
        subject_point   = new int[3];
        subject_name[0] = "英語";
        subject_name[1] = "数学";
        subject_name[2] = "国語";
        subject_cnt     = 3;
        sysPrint("名前を入力してください : ");
        name            = bin.readLine();
        for(for_i=0;for_i<subject_cnt;for_i++){
            sysPrint(">>"+subject_name[for_i]+"の点数を入力してください : ");
            subject_point[for_i] = Integer.parseInt( bin.readLine() );
        }
        sysPrintln("-------得点情報-------");
        sum     = calcSum(subject_cnt,subject_point);
        average = calcAve(subject_cnt,sum);
        printScores(name,subject_cnt,subject_name,subject_point,sum,average);
    }

    public static int calcSum (int subject_cnt , int subject_point[]){
        int sum = 0,i;

        for(i=0; i<subject_cnt; i++){
            sum += subject_point[i];
        }
        return sum;
    }

    public static double calcAve (int subject_cnt,int sum){
        double average;
        average = sum / subject_cnt;
        return average;
    }

    public static void printScores (String name,int subject_cnt,String subject_name[],int subject_point[],int sum,double average){
        int i ;
        String hoge;
        sysPrint(name+"さん : ");
        for(i=0;i<subject_cnt;i++){
            hoge = subject_name[i] + " " + subject_point[i] + "点 ";
            sysPrint(hoge);
        }
        sysPrintln("");
        hoge = "合計は"+sum+"点で、平均は"+average+"点です。";
        sysPrintln(hoge);
    }

    public static void sysPrint(String hoge){
        System.out.print(hoge);
    }

    public static void sysPrintln(String hoge){
        System.out.println(hoge);
    }
}
