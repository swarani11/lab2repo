
public class Lab1 {
	
	
	public static String fullName(String first, String last){
		return "Full Name: "+last+", "+first;
	}
	public static String userName(String first, String last){
		return "User Name: "+first.substring(0,1)+last;
	}
	
	public static void main(String[] args) {
		System.out.println(fullName("Mary","Jones"));
		System.out.println(userName("James","Clark"));
		new ImageDisplay();
	}

}
