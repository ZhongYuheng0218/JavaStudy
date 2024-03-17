//导入Scanner包
import java.util.Scanner;

public class NumberSixGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //录入第一个数字
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        //录入第二个数字
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        System.out.println((num1 == 6)||(num2 == 6) || ((num1 + num2) % 6 == 0));

//      if (((num1 == 6)||(num2 == 6)) || ((num1 + num2) % 6 == 0)){
//            System.out.println();
//        }
    }
}
