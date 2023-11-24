public class Demo01 {
    public static void main(String[] args) {
        //整数
        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;

        //小数
        float num5 = 50.1F;
        double num6 = 3.14159235358979;

        //字符
        char name = 'a';

        //布尔
        boolean b = true;


        //整数：不同进制不同； 二进制0b  十进制  八进制0  十六进制0x
        int i10 = 10;
        int i8 = 010;
        int i16 = 0x10;

        System.out.println(i10);
        System.out.println(i8);
        System.out.println(i16);
        System.out.println("=====================");

        //浮点数拓展
        //float 能表现的字长是有限的，也是离散的，存在舍入误差，很多数字没有办法精确的表示，接近但是不等于
        //double
        //最好完全避免使用浮点数比较，而是使用BigDecimal类：数学工具类
        float f = 0.1f;
        double d = 1.0 / 10;
        System.out.println(f == d);
        System.out.println(f);
        System.out.println(d);

        float d1 = 23232323232323232323f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);

        System.out.println("======================");
        //字符拓展
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int) c1);
        System.out.println(c2);
        System.out.println((int) c2);

        char c3 = '\u0061';//a的16进制是61，16*6+1
        System.out.println(c3);

        //转义字符
        // \t  制表符号
        // \n 换行
        // ...
        System.out.println("Hello\nWorld");

        // String的比较
        System.out.println("======================");
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);

        // 布尔值扩展
        boolean flag = true;
        if(flag==true){

        }

    }
}
