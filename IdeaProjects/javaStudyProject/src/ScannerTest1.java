//导入Scanner包
import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args){
        //创建sc对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数字:");
        int num1 = sc.nextInt();
        System.out.println("请输入第2个数字:");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }
}
