package com.classroom.experiment;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int hour = time / 3600;
        int minute = (time % 3600) / 60;
        int second = 5000 % 60;
        System.out.printf(String.format("%d分钟是%d小时，是%d分钟，是%d秒", time, hour, minute, second));
    }
}
