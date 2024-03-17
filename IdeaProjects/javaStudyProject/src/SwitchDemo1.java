public class SwitchDemo1 {
    public static void main(String[] args){
        System.out.println("中午吃什么面");
        //1.定义一个变量，记录想吃的面
        String noodles = "红烧牛肉面";

        //利用switch，在菜单中匹配想吃的面
        switch(noodles){
            case "红烧牛肉面":
                System.out.println("吃红烧牛肉面");
                break;
            case "鲜虾鱼板面":
                System.out.println("吃鲜虾鱼板面");
                break;
            case "叉烧豚骨面":
                System.out.println("吃叉烧豚骨面");
                break;
            case "酸辣牛肉面":
                System.out.println("吃酸辣牛肉面");
                break;
            default:
                System.out.println("吃屎去吧");
        }

    }
}
