//Bài này em tham khảo trên discussion của hackerrank ạ
import java.util.Scanner;
import java.util.ArrayList;

public class ConnectedCells {

    private static int rows;
    private static int cols;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        cols = scan.nextInt();
        int grid[][] = new int[rows][cols];
        boolean visited[][] = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                visited[i][j] = false;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println(largestRegion(grid, visited));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int largestRegion(int [][] grid, boolean [][] visited) {
        int maxRegion = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1 && visited[row][col] == false) {
                    int size = count_connected(grid, row, col, visited);
                    maxRegion = Math.max(maxRegion, size);
                }
            }
        }
        return maxRegion;
    }

    private static int count_connected(int [][] grid, int row, int col, boolean [][] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return 0;
        } else if (visited[row][col] == true || grid[row][col] == 0) {
            return 0;
        }

        visited[row][col] = true;
        int size = 1;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                size += count_connected(grid, r, c, visited);
            }
        }

        return size;
    }
}
