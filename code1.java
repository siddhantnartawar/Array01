import java.io.*;

class code1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array Size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum = arr[i] + sum;
            }
            System.out.println(sum);
        }
    }
}
