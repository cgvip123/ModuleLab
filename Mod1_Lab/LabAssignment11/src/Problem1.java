interface Power {
	
	public double power(double x, double y);
}
public class Problem1 {

	public static void main(String[] args) {
		
		Power p = (x, y) -> { return Math.pow(x, y); };
		
		System.out.println(p.power(5,  10));

	}

}
