package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int days = seconds / 86400;
        int hours = (seconds - days * 86400) / 3600;
        int minutes = (seconds - days * 86400 - hours * 3600) / 60;
        int sec_to_show = seconds - hours * 3600 - minutes * 60 - days * 86400;

        DecimalFormat df = new DecimalFormat("00");

        String s = String.format("%d:%s:%s", hours, df.format(minutes), df.format(sec_to_show));
        System.out.println(s);


    }
}
