import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static char[][] arr;
    static int max_value = 0;

    public static void check(char[][] arr) {
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                max_value = Math.max(max_value, count);
            }
        }

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (arr[j][i] == arr[j + 1][i]) {
                    count++;
                } else {
                    count = 1;
                }
                max_value = Math.max(max_value, count);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());

        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = bf.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {

                char temp = arr[i][j];
                arr[i][j] = arr[i][j + 1];
                arr[i][j + 1] = temp;

                check(arr);

                temp = arr[i][j];
                arr[i][j] = arr[i][j + 1];
                arr[i][j + 1] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {

                char temp = arr[j][i];
                arr[j][i] = arr[j + 1][i];
                arr[j + 1][i] = temp;

                check(arr);

                temp = arr[j][i];
                arr[j][i] = arr[j + 1][i];
                arr[j + 1][i] = temp;
            }
        }
        System.out.println(max_value);
    }
}