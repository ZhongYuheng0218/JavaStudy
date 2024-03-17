public class VariateTest {
    public static void main(String[] args){
        int count = 0;  //初始人数为0
        //第一站，上1，下0
        count += 1;
        //第二站，上2，下1
        count = count + 2 - 1;
        //第三站，上2，下1
        count = count + 2 -1;
        //第四站，上0，下1
        count = count - 1;
        //第五站，上1，下0
        count = count + 1;
        //最终车内人数
        System.out.println(count);
    }
}
