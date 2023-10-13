package method;

public class StaticMethod {
	
	class First{
		static void abc() {
			System.out.println("abc");
		}
	}
	class Second{
		static void xyz() {
			System.out.println("xyz");
		}
	}

	public static void main(String[] args) {
		
		First.abc();
		Second.xyz();
		
	}
}
