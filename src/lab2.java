import java.util.Scanner;

public class lab2 {
    public static final int MAX_DIMENSION = 20;
    public static final int MIN_DIMENSION = 1;
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите горизонтальную размерность: ");
        int x = inputMatrixDimension(scanner);
        System.out.println("Введите вертикальную размерность: ");
        int y = inputMatrixDimension(scanner);
        System.out.println("Выберите способ заполнения матрицы: 1 - вручную, 2 - случайно");
        int fillMethod = scanner.nextInt();
        if (fillMethod == 1) {
            manualFill(x, y, scanner);
        } else if (fillMethod == 2) {
            randomFill(x, y, scanner);
        }
    }

    public static int inputMatrixDimension(Scanner scanner) {
        int dimension = scanner.nextInt();
        while (dimension > MAX_DIMENSION || dimension < MIN_DIMENSION) {
            System.out.println("Размер не в диапазоне " + MIN_DIMENSION + " - " + MAX_DIMENSION + ". Пожалуйста, введите другое число:");
            dimension = scanner.nextInt();
        }
        return dimension;
    }

    public static int[][] manualFill(int x, int y, Scanner scanner) {
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Введите следующее число: ");
                matrix[i][j] = scanner.nextInt();
                System.out.print(" ");
            }
        }
        printMatrix(matrix);
        return matrix;
    }

    public static int[][] randomFill(int x, int y, Scanner scanner) {
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * (MAX_VALUE - MIN_VALUE)) + MIN_VALUE;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        printMatrix(matrix);
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        calculateStatistics(matrix);
    }

    private static void calculateStatistics(int[][] matrix) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                if (num < min) min = num;
                if (num > max) max = num;
            }
        }
        double average = (double) sum / (matrix.length * matrix[0].length);
        System.out.println("Среднее значение матрицы: " + average);
        System.out.println("Минимальное значение матрицы: " + min);
        System.out.println("Максимальное значение матрицы: " + max);
    }
}
