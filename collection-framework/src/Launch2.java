import java.util.ArrayList;

public class Launch2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al);
		
		evenSum(al);
	}
	static void evenSum(ArrayList<Integer> al) {
		int sum=0;
		for(Integer x:al) {
			if(x%2 == 0) {
				sum += x;
			}
		}
		System.out.println(sum);
	}
}
