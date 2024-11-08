public class ClassNameHere {
    public static int max(int[] m) {
        int ptr = 0;
        int largest = 0;
        while (ptr < m.length){
            if (m[ptr] > largest){
                largest = m[ptr];
            }
            ptr = ptr + 1;
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};

        System.out.println(max(numbers));
    }
}