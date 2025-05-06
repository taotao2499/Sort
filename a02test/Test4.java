package a02test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {

        //JDK7
        //1.计算出生年月的毫秒值
        String birth = "2000年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birth);
        long birthTime = date.getTime();
        //2.计算当前时间的毫秒值
        long todayTime = System.currentTimeMillis();
        //3.计算差值
        long diffTime = todayTime - birthTime;
        System.out.println(diffTime /1000 / 60 / 60 / 24 );


        //JDK8
        LocalDate d1 = LocalDate.of(2000, 1, 1);
        LocalDate d2 = LocalDate.now();

        long time = ChronoUnit.DAYS.between(d1, d2);
        System.out.println(time);


    }
}
