package com.company;


public class Main {

    public static void printer(char[][] matrix) {

        // Виводить вказану матрицю на друк

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            if (i > 0) {
                System.out.print("\n");
            }

            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.print("\n");
    }

    public static char[][] transposer(char[][] matrix) {

        // Транспонує матрицю та видає в якості результату нову (вже транспоновану) матрицю

        int rows = matrix.length;
        int columns = matrix[0].length;

        char[][] transposedMatrix = new char[columns][rows];

        for (int i = 0; i < columns; i++) {

            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }

    public static int sum_of_max(char[][] matrix) {

        // Видає суму найбільших елементів в стовпцях матриці з непарними номерами

        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;
        int max;

        for (int i = 0; i < rows; i++) {
            max = 0;

            for (int j = 0; j < columns; j++) {

                if (i % 2 == 0) {

                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
            sum += max;
        }
        return sum;
    }

    public static int sum_of_min(char[][] matrix) {

        // Видає суму найменших елементів в стовпцях матриці з парними номерами

        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;
        int min;

        for (int i = 0; i < rows; i++) {
            min = Integer.MAX_VALUE;

            for (int j = 0; j < columns; j++) {

                if (i % 2 == 1) {

                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }

                } else {
                    min = 0;
                }
            }
            sum += min;
        }
        return sum;
    }

    public static void main(String[] args) {

        char[][] matrix = {
                {'a', 'l', 'w'},
                {'b', 'm', 'x'},
                {'c', 'n', 'y'},
                {'d', 'o', 'z'},
                {'e', 'p', '1'},
                {'f', 'q', '2'},
                {'g', 'r', '3'},
                {'h', 's', '4'},
                {'i', 't', '5'},
                {'j', 'u', '!'},
                {'k', 'v', '?'}};

        System.out.println("Початкова матриця: ");
        printer(matrix);

        System.out.println("\nТранспонована матриця: ");
        printer(transposer(matrix));

        System.out.println("\nСума найбільших елементів в стовпцях матриці з непарними номерами: " + sum_of_max(matrix));
        System.out.println("\nСума найменших елементів в стовпцях матриці з парними номерами: " + sum_of_min(matrix));
    }
}
