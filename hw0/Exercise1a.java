public class Zeno {
    public static void main(String[] args) {

        int row = 0;
        int SIZE = 5;

        while (row < SIZE) {
            int col = 0;
            while (col <= row - 1) {
                System.out.print('*');
                col = col + 1;
            }
            System.out.println('*');
            row = row + 1;

        }
    }
}