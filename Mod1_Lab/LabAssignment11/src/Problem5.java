import java.util.Arrays;
import java.util.List;
class Factorial {
	
	public static void fact(int a) {
		int f=1;
		while(a > 0) {
			f = f * a;
			a--;
		}
		System.out.println(f);
	}
}
public class Problem5 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
		
		list.forEach(Factorial::fact);
		

	}

}
