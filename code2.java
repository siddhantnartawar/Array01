import java.io.*;

class code2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Array size");

        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        int product = 1;
        System.out.println("Enter The Elements");
        // arr[i]= Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            // }
            // int product = 1;
            // for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                product = arr[i] * product;
            }
            System.out.println(product);
        }
    }
}
