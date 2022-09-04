package geovideveloperzadachavsc10;

import java.util.Scanner;

public class Number {
    public static void  main(String[] args){
        System.out.println("Введите трехзначное число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = number / 10 % 10;
        System.out.println("Вторая цифра цисла " + result);
    }
}
