import java.util.Arrays;
import java.util.List;
class Person {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		display();
	}
	
	public void display() {
		System.out.println(name);
	}
}

public class Problem4 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("YANSHU", "GUPTA");
		
		list.forEach(new Person()::setName);
	}

}
