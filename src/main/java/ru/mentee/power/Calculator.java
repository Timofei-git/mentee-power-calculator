package ru.mentee.power;

/**
 * Библиотека математических операций
 */
public class Calculator {
    /**
     * Сложение двух чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитание второго числа из первого
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Умножение двух чисел
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Деление первого числа на второе
     * @throws ArithmeticException при делении на ноль
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return (double) a / b;
    }
}
