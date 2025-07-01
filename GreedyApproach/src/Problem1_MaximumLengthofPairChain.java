import java.util.*;
public class Problem1_MaximumLengthofPairChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] pairs = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pairs[i][j] = sc.nextInt();
            }
        }
        System.out.println(findLongestChain(pairs));
    }
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (r1,r2)->Integer.compare(r1[1],r2[1])); //lambda function used in 2d array for sorting
        int c=1;
        int prev=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>prev){
                c++;
                prev=pairs[i][1];
            }
        }
        return c;
    }
}
