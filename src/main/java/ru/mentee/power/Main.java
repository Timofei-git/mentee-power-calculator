package ru.mentee.power;

import java.util.Scanner;

/**
 * Демонстрация работы калькулятора
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("🧮 Добро пожаловать в Калькулятор Java! 🧮");
        Calculator calculator = new Calculator();

        System.out.println("Сложение: 5 + 3 = " + calculator.add(5, 3));
        System.out.println("Вычитание: 10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("Умножение: 6 * 7 = " + calculator.multiply(6, 7));

        try {
            System.out.println("Деление: 20 / 4 = " + calculator.divide(20, 4));
            System.out.println("Деление: 10 / 3 = " + calculator.divide(10, 3));
            // Раскомментируй для проверки ошибки деления на ноль
             System.out.println("Деление на ноль: " + calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n🎮 Попробуйте мини-игру с калькулятором!");
        playGame();
    }

    private static void playGame() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Я загадал два числа и выполнил операцию. Угадай результат!");

        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int operation = (int) (Math.random() * 4);

        int result;
        String operationName;

        switch (operation) {
            case 0:
                result = calculator.add(a, b);
                operationName = "сложения";
                break;
            case 1:
                result = calculator.subtract(a, b);
                operationName = "вычитания";
                break;
            case 2:
                result = calculator.multiply(a, b);
                operationName = "умножения";
                break;
            default:
                if (b == 0) b = 1; // чтобы не делить на 0
                result = (int) calculator.divide(a, b);
                operationName = "деления (целая часть)";
                break;
        }

        System.out.println("Введите результат " + operationName + " чисел " + a + " и " + b + ":");

        int userAnswer = scanner.nextInt();

        if (userAnswer == result) {
            System.out.println("Правильно! Вы великолепны! 🎉");
        } else {
            System.out.println("Не совсем! Правильный ответ: " + result);
        }
    }
}
