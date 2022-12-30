package overloading;

//class Addition{
//	
//	int add(int x, int y) {
//		return x+y;
//	}
//	
//	float add(int x, float y) {
//		return x+y;
//	}
//	
//	float add(float x, float y) {
//		return x+y;
//	}
//	
//}
//
//
//
//
//
//
//public class LaunchAddition {
//	public static void main(String[] args) {
//		int a=10, b=20, c=30;
//		float p=15.5f, q=25.5f, r=35.5f;
//		
//		Addition ad = new Addition();
//		System.out.println(ad.add(a,b)); 
//	}
//}


class Addition{
	float add(int x, float y) {
		return x+y;
	}
	
	void add(int x, float y) {
		System.out.println(x+y);
	}
	
}

public class LaunchAddition {
	public static void main(String[] args) {
		int a=10, b=20, c=30;
		float p=15.5f, q=25.5f, r=35.5f;
		
		Addition ad = new Addition();
		System.out.println(ad.add(a,b)); 
	}
}
