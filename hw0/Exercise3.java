public class ClassNameHere {
    public static int max(int[] m) {
        int largest = 0;
        for (int ptr = 0;ptr < m.length;ptr += 1) {
            if (m[ptr] > largest){
                largest = m[ptr];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};

        System.out.println(max(numbers));
    }
}