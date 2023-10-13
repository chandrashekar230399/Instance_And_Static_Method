package method;

	class First{
		int x;
		public  void abc() {
			System.out.println("hi");
		}
	}
	class Second{
		int y;
		public void xyz() {
			System.out.println("hello");
		}
	}
 
	public class InstanceMethod {
		
	public static void main(String[] args) {
		First f = new First();
		f.abc();
		Second s = new Second();
		s.xyz();
		
	}
}
	
	 
