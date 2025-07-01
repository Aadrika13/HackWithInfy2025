import java.util.*;
public class Problem2_MaximumUnitsonaTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] boxTypes = new int[n][2];
        for(int i=0;i<n;i++){
            boxTypes[i][0] = sc.nextInt();
        }
        int truckSize = sc.nextInt();
        System.out.println(maximumUnits(boxTypes,truckSize));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (r1,r2)->Integer.compare(r2[1],r1[1]));
        int c=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>0){
                if(truckSize-boxTypes[i][0]>=0){
                    c=c+(boxTypes[i][0]*boxTypes[i][1]);
                }
                else{
                    c=c+(truckSize*boxTypes[i][1]);
                }
                truckSize-=boxTypes[i][0];
            }
        }
        return c;
    }
}
