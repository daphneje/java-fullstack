import java.util.ArrayList;
import java.util.Collections;

public class Launch6 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(2);
		System.out.println(al);
		
		Collections.sort(al, (o1, o2) -> {
			if(o1<o2) {
				return 1;
			}
			else if(o1>o2) {
				return -1;
			}
			else {
				return 0;	
			}
		});
		System.out.println(al);
	}
}
