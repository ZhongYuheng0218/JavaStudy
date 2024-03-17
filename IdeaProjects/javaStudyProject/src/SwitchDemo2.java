import java.util.Scanner;
public class SwitchDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //输入今天星期几
        System.out.println("输入今天星期几(1-7)");
        int week = sc.nextInt();

        //判断输入的日期格式是否正确
        switch (week){
            case 1 :
                System.out.println("跑步");
                break;
            case 2 :
                System.out.println("游泳");
                break;
            case 3 :
                System.out.println("慢走");
                break;
            case 4 :
                System.out.println("单车");
                break;
            case 5 :
                System.out.println("拳击");
                break;
            case 6 :
                System.out.println("爬山");
                break;
            case 7 :
                System.out.println("放纵日");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
