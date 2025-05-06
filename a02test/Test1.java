package a02test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数：");
            String numSte = sc.nextLine();
            int num = Integer.parseInt(numSte);

            if (num < 0 || num > 100) {
                System.out.println("输入的数字超出范围，请重新输入！");
                continue;
            }
            list.add(num);

            int sum = getSum(list);
            if (sum > 200) {
                System.out.println("集合中的数据已经满足要求，结束程序！");
                break;
            }

        }

        System.out.println("集合中的数据为：" + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("集合中数为" + list.get(i));
        }

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum = num + sum;
        }
        return sum;
    }
}
