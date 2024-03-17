import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        char heart = 3;
//        int num2 = sc.nextInt();
        System.out.println("个位是"+num1%10);
        System.out.println("十位是"+num1/10%10);
        System.out.println("百位是"+num1/100%10);
        System.out.println(heart);
    }
}
