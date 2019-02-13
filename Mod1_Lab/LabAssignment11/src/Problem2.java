interface InsertSpace {
	
	public String insertSpace(String input);
}
public class Problem2 {

	public static void main(String[] args) {
		
		InsertSpace is = s -> { 
			
			String res="";
			for(int i=0;i<s.length();i++) {
				res += s.charAt(i)+" ";
			}
			return res.trim();
		};

		System.out.println(is.insertSpace("YANSHU"));
	}

}
