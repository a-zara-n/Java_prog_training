import java.io.*;
import java.util.*;

class JavaRenD {
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        Hizuke hizuke1 = new Hizuke(2004, 5, 17);
        Hizuke hizuke2 = new Hizuke(-1975, 954, -5);

        //=== main ===
        println("日付1 : " + hizuke1.getYear() + "/" + hizuke1.getMonth() + "/" + hizuke1.getDay());
        println("日付2 : " + hizuke2.getYear() + "/" + hizuke2.getMonth() + "/" + hizuke2.getDay());


    }
    public static void print(String hoge){
        System.out.print(hoge);
    }

    public static void println(String hoge){
        System.out.println(hoge);
    }
}
class Hizuke {
    private int     year,month,day,for_i,for_j,tmp_day;
    private boolean is_month    = false;

    public Hizuke (int year_input,int month_input,int day_input) {
        year    = year_input;
        month   = month_input;
        day     = day_input;
        minus();
        day();
        month();
    }
    public  int getYear (){
        return year;
    }
    public  int getMonth (){
        return month;
    }
    public  int getDay (){
        return day;
    }
    private void minus () {
        if (year < 0)   {year   = 0 - year;}
        if (month < 0)  {month  = 0 - month;}
        if (day < 0)    {day    = 0 - day;}
    }
    private void month () {
        //year    = year + month / 12;
        month   = month % 12;
    }

    private void day () {
        //month   = month + day / 31;
        day     = day % 31;
    }

}
