package sfDemo;

import java.util.ArrayList;

public class a1BasicSerchDemo1 {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr= {139,65,84,87,89,112,65};

        ArrayList<Integer> list1 = basicSearch(arr, 65);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


    }
    public static  ArrayList<Integer> basicSearch(int[] arr , int number){

        ArrayList<Integer> list = new ArrayList<>();
        //
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                list.add(i);
            }
        }
        return list;
    }
}
