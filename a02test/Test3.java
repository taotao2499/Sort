package a02test;

public class Test3 {
    public static void main(String[] args) {


        //1.

        System.out.println(toBinaryString(6));



    }

    public static String toBinaryString(int number) {
        //核心逻辑：不断的去除以2，得到余数，一直到商为e就结束。
        //还需要把余数倒着拼接起来

        //1.定义一个StringBuilder来拼接余数
        StringBuilder sb = new StringBuilder();

        //2.循环去除以2，得到余数
        while (true) {
            if (number == 0) {
                break;
            }
            int remainder = number % 2;
            sb.append(remainder);
            number = number / 2;

        }
        return sb.reverse().toString();
    }
}
