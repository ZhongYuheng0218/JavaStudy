//案例1： 打印折纸的次数需求:世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米),假如我有一张足够大的纸，它的厚度是0.1毫米。
//请问，我折叠多少次，可以折成珠穆朗玛峰的高度？

public class CirculationTest1 {
    public static void main(String[] args){
        //初始化纸张的厚度为0.1
        double height = 0.1;
        //使用count记录折叠次数
        int count = 0;
        //使用while循环，条件为height <=  8844430
        while( height < 8844430 ){
            height *= 2;
            count++;
        }
        System.out.println(height);
        System.out.println("当折叠" + count + "次时，纸张可以达到珠穆朗玛峰的高度");
    }
}
