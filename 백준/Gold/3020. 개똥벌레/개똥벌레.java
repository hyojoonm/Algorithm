import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int result;
    static int [] bot;
    static int [] top;
    static int [] n,h;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int h = Integer.parseInt(st.nextToken());

         bot = new int[n/2];
         top = new int[n/2];
        for(int i = 0; i<n/2;i++){
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());
            bot[i] = num1;
            top[i] = num2;
        }
        int min = n;
        int count = 0;
        Arrays.sort(bot);
        Arrays.sort(top);

        for(int i = 1; i<h+1;i++){
            int wall = solve(0,n/2,i,bot) +solve(0,n/2,h-i+1,top);

            if(min == wall){
                count++;
                continue;
            }
            if(min > wall){
                min = wall;
                count = 1;
            }
        }
        System.out.println(min+" "+count);
    }
    private static int solve(int left, int right,int h , int[] arr){
        while(left<right){
            int mid = (left+right)/2;

            if(arr[mid] >= h)
                right = mid;
            else
                left = mid+1;
        }
        return arr.length-right;
    }
}
