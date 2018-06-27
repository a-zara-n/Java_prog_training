import java.io.*;

class JavaRenA {
//class Array1
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        Chokuho ch1 = new Chokuho(5.0,4.5,8.5);
        Chokuho ch2 = new Chokuho(5.0,5.0,5.0);
        //=== main ===
        println("ch1の表面積は"+ch1.calcSumArea()+"です");
        println("ch1の体積は"+ch1.sumBox()+"です");
        if(ch1.checkChokuho()){
            println("ch1は立方体です。");
        }else{
            println("ch1は立方体ではありません。");
        }
        println("ch1の表面積は"+ch2.calcSumArea()+"です");
        println("ch1の体積は"+ch2.sumBox()+"です");
        if(ch2.checkChokuho()){
            println("ch2は立方体です。");
        }else{
            println("ch2は立方体ではありません。");
        }

    }

    public static void print(String hoge){
        System.out.print(hoge);
    }

    public static void println(String hoge){
        System.out.println(hoge);
    }
}
class Chokuho {
    double width, depth, height, bottom, left, front,sum;

    public Chokuho (double width_num, double depth_num, double height_num){
        width   = width_num;
        depth   = depth_num;
        height  = height_num;
    }
    public double calcButtomArea () {
        bottom  = depth * width;
        return bottom;
    }
    public double calcLeftArea () {
        left    = height * depth;
        return left;
    }
    public double calcFrontArea () {
        front   = height * width;
        return front;
    }
    public double calcSumArea(){
        calcButtomArea();
        calcLeftArea();
        calcFrontArea();
        sum = (bottom * 2)+(left * 2)+(front * 2);
        return sum;
    }
    public double sumBox(){
        calcButtomArea();
        sum = bottom * width;
        return sum;
    }
    public boolean checkChokuho(){
        if(width == depth && depth == height){
            return true;
        }else{
            return false;
        }
    }
}
