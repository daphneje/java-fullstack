import java.util.ArrayList;
import java.util.Collections;

public class Launch7 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(2);
		System.out.println(al);
		
		Collections.sort(al, (o1, o2)-> (o1<o2)?1:(o1>o2)?-1:0);
		System.out.println(al);
	}
}
