import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input column: ");
        int column = scanner.nextInt();
        System.out.println("Input row");
        int row = scanner.nextInt();

        double[][] array = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhap vao phan tu thu [" + i + "][" + j + "] cho mang ");
                array[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }


        Location location = Location.locateLargest(array);
        System.out.println("Vi tri cua phan tu lon nhat la " + "[" + location.getRow() + ", " + location.getColumn() + "]");


    }
}
