package com.company;
import java.util.Scanner;

class Math{
    int x;
    int y;
    Math(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void Primer(){
        if((y+1)!= 0){
            double z = (double) (x + y)/(y + 1);
            System.out.println("z = " + z);
        }
        else{
            System.out.println("Нельзя на ноль делить");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("z=(x+y)/(y+1)");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = in.nextInt();
        System.out.println("Введите число y");
        int y = in.nextInt();
        Math result = new Math(x , y);
        result.Primer();
    }
}