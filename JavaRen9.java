import java.io.*;

class JavaRen9 {
//class Array1
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader ( new InputStreamReader(System.in) );

        //=== Variable declaration ===
        Account account1, account2;
        //=== main ===
        account1         = new Account();
        account2         = new Account();

        account1.name    = "Dejita";
        account1.balance = 0;

        account2.name    = "Dejita";
        account2.balance = 0;

        account1.deposit(15000);
        account2.deposit(20000);
        account1.withdraw(7000);
        account2.withdraw(3000);
        account1.deposit(16000);
        account1.dispInfo();
        account2.dispInfo();

    }
}
class Account {
    String  name;
    int     balance;

    public void deposit (int amount) {
        balance += amount;
        println(name+"さんが"+amount+"円預金しました");
        return;
    }

    public void withdraw (int amount) {
        balance -= amount;
        if (balance < 0){
            println("残高が不足しています");
            balance += amount;
            return ;
        }
        println(name+"さんが"+amount+"円引き出しました");
        return;
    }

    public void dispInfo(){
        println( name + "さんが" + balance + "円です");
        return;
    }

    public static void print(String hoge){
        System.out.print(hoge);
    }

    public static void println(String hoge){
        System.out.println(hoge);
    }
}
