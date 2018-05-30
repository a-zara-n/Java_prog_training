import java.io.*;

class JavaRen1{
    public static void main(String[] args) throws IOException {
        BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
        int dt[] = {68 , 80 ,75 , 63 , 97 ,45};
        int sum =0 , i ;
        double avg;
        for(i=0;i<6;i++){
            sum += dt[i];
        }
        avg = sum / 6.0;
        System.out.print("平均点は");
        System.out.print(avg);
        System.out.println("点です");
    }
}
