import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MinAvgTwoSlice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(A));
    }
    
    public static int solution(int[] A) {
        float minAvg = (A[0] + A[1]) / 2f;
        int minIndex = 0;
        for (int i = 2; i < A.length; i++) {
            float avg = (A[i - 2] + A[i - 1] + A[i]) / 3f;
            if (minAvg > avg) {
                minAvg = avg;
                minIndex = i - 2;
            }
    
            avg = (A[i - 1] + A[i]) / 2f;
            if (minAvg > avg) {
                minAvg = avg;
                minIndex = i - 1;
            }
        }
        return minIndex;
    }
}
