import java.util.*;
import java.io.*;;

public class COINS {
	public static void main(String[] args) throws IOException{
		new Solution().proc();
	}
}


public class Solution {
int n;	
int[] A = new int[100];
	
	int calculate(int x) {
		int value;
		if (x == 0){
			return A[x];
		}
		else if (A[x] != 0){
			return A[x];
		}
		else{
			A[x] = x;
			value = calculate(x/2)+calculate(x/3)+calculate(x/4);
			if (A[x]<value){
				A[x] = value;
			}
			return A[x];
		}
	}

	public void proc() throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		String line;
		int result;
		while(!(line = r.readLine()).equals("")){
			n = Integer.parseInt(line);
			result = calculate(n);
			out.println(result);
		}
		r.close();
		out.close();
	}

}
