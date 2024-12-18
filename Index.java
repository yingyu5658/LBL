package cn.yingyu5658.lbl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Random;

public class Index {
    public static void main(String[] args) {
        // new一个scanner出来，接收下面的数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎鸭");
            LocalDate date = LocalDate.now(); //拿到日期
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
            System.out.println("你在" + date.format(formatter) + "奇了星雨并打开本软件，来看看老天让不让你卢吧！");
            System.out.println("========================================");

            System.out.println("输入“/lbl”开始抽签，询问老天的意见。");
            System.out.println("输入“/exit”放弃炉管，退出软件。");
            String userInput = sc.nextLine();
            if ("/lbl".equalsIgnoreCase(userInput)) {
                boolean lbl = new Random().nextBoolean();
                if (lbl) {
                    for (int i = 0; i <=10 ; i++) {
                        System.out.println("...");
                    }
                    System.out.println("------------------------------------");
                    System.out.println("疯狂的鹿，不停的蛇，浓厚的鲸！！！！！");
                    System.out.println("------------------------------------");
                } else {
                    System.out.println("别让欲望击穿你的意志！");
                }
            }
            if ("/exit".equalsIgnoreCase(userInput)) {
                System.exit(0);
            }

        }
    }
}
