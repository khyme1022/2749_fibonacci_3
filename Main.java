import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long B = Long.parseLong(br.readLine());
    int period = 1500000;
    long[] arr = new long[period];
    arr[0] = 0;
    arr[1] = 1;
    for(int i=2;i<period; i++){
      arr[i] = arr[i-1] + arr[i-2];
      arr[i] = arr[i] % 1000000;
    }
    System.out.print(arr[(int)(B%period)]);
    
  }
} 