package l;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class LuBuLu {
    // LuBuLu l = new LuBuLu();
    Scanner sc = new Scanner(System.in);
    /*
     * chooseOneOfTheTwo的变量
     * */
    String one;
    String two;

    // 启动次数变量，当程序从主入口启动时从0开始自增.
    public int times = 0;

    // 主程序
    public void command() {
        while (true) {
            if (times == 0) {
                {
                    System.out.println(" __       __    __  .______    __    __   __       __    __                                                                                                                       \n" +
                            "|  |     |  |  |  | |   _  \\  |  |  |  | |  |     |  |  |  |                                                                                                                      \n" +
                            "|  |     |  |  |  | |  |_)  | |  |  |  | |  |     |  |  |  |                                                                                                                      \n" +
                            "|  |     |  |  |  | |   _  <  |  |  |  | |  |     |  |  |  |                                                                                                                      \n" +
                            "|  `----.|  `--'  | |  |_)  | |  `--'  | |  `----.|  `--'  |                                                                                                                      \n" +
                            "|_______| \\______/  |______/   \\______/  |_______| \\______/                                                                                                                       \n" +
                            "                                                                                                                                                                                  \n" +
                            ".___  ___.      ___       _______   _______          .______   ____    ____          ____    ____  __  .__   __.   ___________    ____  __    __   _____     __    _____    ___   \n" +
                            "|   \\/   |     /   \\     |       \\ |   ____|         |   _  \\  \\   \\  /   /          \\   \\  /   / |  | |  \\ |  |  /  _____\\   \\  /   / |  |  |  | | ____|   / /   | ____|  / _ \\  \n" +
                            "|  \\  /  |    /  ^  \\    |  .--.  ||  |__            |  |_)  |  \\   \\/   /            \\   \\/   /  |  | |   \\|  | |  |  __  \\   \\/   /  |  |  |  | | |__    / /_   | |__   | (_) | \n" +
                            "|  |\\/|  |   /  /_\\  \\   |  |  |  ||   __|           |   _  <    \\_    _/              \\_    _/   |  | |  . `  | |  | |_ |  \\_    _/   |  |  |  | |___ \\  | '_ \\  |___ \\   > _ <  \n" +
                            "|  |  |  |  /  _____  \\  |  '--'  ||  |____          |  |_)  |     |  |                  |  |     |  | |  |\\   | |  |__| |    |  |     |  `--'  |  ___) | | (_) |  ___) | | (_) | \n" +
                            "|__|  |__| /__/     \\__\\ |_______/ |_______|         |______/      |__|                  |__|     |__| |__| \\__|  \\______|    |__|      \\______/  |____/   \\___/  |____/   \\___/  \n" +
                            "                                                                                                                                                                                  ");
                }
            }

            System.out.println("欢迎鸭");
            LocalDate date = LocalDate.now(); //拿到日期
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println("你在" + date.format(formatter) + "奇了星雨并打开本软件，来看看老天让不让你卢吧！");
            System.out.println("========================================");
            System.out.println("输入'/help'获取帮助");
            String userInput = sc.nextLine();
            /*
             * 用户输入指令逻辑判断
             * */
            switch (userInput) {
                case "/help":
                    help();
                case "lbl":
                    luMa();
                case "exit":
                    System.exit(0);
                case "coott":
                    if ("/coott".equalsIgnoreCase(userInput)) {
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("请输入您的第一个选项。");
                        String one = sc1.nextLine();
                        System.out.println("请输入您的第二个选项。");
                        String two = sc1.nextLine();
                        chooseOneOfTheTwo(one, two);
                    }

            }
            times++;
            System.out.println("*调试信息* 运行轮数： " + times);
        }
    }

    public void luMa() {
        clear();
        boolean lbl = new Random().nextBoolean();
        if (lbl) {
            for (int i = 0; i <= 10; i++) {
                System.out.println("...");
            }
            System.out.println("------------------------------------");
            System.out.println("疯狂的鹿，不停的蛇，浓厚的鲸！！！！！");
            System.out.println("------------------------------------");
        } else {
            for (int i = 0; i <= 10; i++) {
                System.out.println("...");
            }
            System.out.println("------------------------------------");
            System.out.println("别让欲望击穿你的意志！");
            System.out.println("------------------------------------");
        }
    }

    public void chooseOneOfTheTwo(String one, String two) {
        clear();
        this.one = one;
        this.two = two;
        boolean coott = new Random().nextBoolean();
        if (coott) {
            for (int i = 0; i == 60; i++) {
                System.out.println("...");
            }
            System.out.println("老天帮你选了：" + this.one);
        } else {
            System.out.println("老天帮你选了：" + this.two);
        }
        System.out.println("========================================");
    }

    public void help() {
        clear();
        System.out.println("===帮助页面===");
        System.out.println("'/lbl' 询问老天是否开卢");
        System.out.println("'/coott' 进入二选一模式");
        System.out.println("'/exit' 退出");
    }

    public void clear() {
        for (int i = 0; i < 100; i++) {
            System.out.println("...");
        }
    }
}
