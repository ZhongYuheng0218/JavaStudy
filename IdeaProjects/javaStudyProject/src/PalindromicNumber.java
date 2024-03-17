//判断回文数
import java.util.Scanner;

public class CirculationTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //用户输入一个数字
        System.out.println("Please enter a positive integer:");
        int num1 = sc.nextInt();
        //int num1 = 0;

        //将num1拆解，并逆序成为一个新的数num2
        int num2 = 0;

        //使用一个临时变量temp保存num1
        int temp = num1;

        while(temp > 0){
            //将个位数用remainder保存
            int remainder = 0;    //初始化remainder为0
            remainder = temp % 10;//将temp的个位数字赋值给remainder
            temp/=10;    //去除temp的个位数
            num2 = num2*10 + remainder;    //将逆序数存储到变量num2中
        }

        System.out.println(num1 == num2 ? num1 + "Is A Palindromic Number" : num1 + "Is Not A Palindromic Number");

    }
}
