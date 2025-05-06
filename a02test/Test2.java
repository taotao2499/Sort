package a02test;

public class Test2 {
    public static void main(String[] args) {
        //1.定义一个字符串
        String str = "123456789";
        //2.校验字符窜
        if (!str.matches("[1-9]\\d{0,9}")){
            System.out.println("输入的字符串不符合要求");
        }else {
            System.out.println("输入的字符串符合要求");
        }

        //3.定义一个变量表示最终的结果
        int sum = 0;
        //4.遍历字符串得到每一个字符
        for (int i = 0; i < str.length(); i++) {
            //5.获取每一个字符
            int c = str.charAt(i) - '0';
            //拼接
            sum = sum * 10 + c;
        }
        System.out.println(sum);
        System.out.println(sum + 1);





    }
}
