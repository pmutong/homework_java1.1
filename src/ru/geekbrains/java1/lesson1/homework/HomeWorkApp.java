package ru.geekbrains.java1.lesson1.homework;

public class HomeWorkApp {

    public static void main(String[] args) {
    printThreeWords();
    //printFourWords();
    //printWords("Banana\nApple");

    checkSumSign();

    printColor();

    compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void printFourWords() { // *для практики
        System.out.println("Mango\nOrange\nBanana\nApple");
    }

    static void printWords(String str){ // *для практики
        System.out.println(str);
    }

    static int checkSumSign(){
        int a;
        a = 1111;
        int b = -111;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
        return sum;
    }

    static int printColor(){
        int value = 456;
        if (value <= 0){
            System.out.println("RED!");
        } else if (value > 0 && value <= 100){
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN!");
        }
        return value;
    }

    static int compareNumbers(){
        int a = 25;
        int b = 222;
        if (a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
        return a;
    }
}

