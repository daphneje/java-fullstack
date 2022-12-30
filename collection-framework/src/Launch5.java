import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Launch5 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(2);
		System.out.println(al);
		
		Collections.sort(al, new myComp());
		System.out.println(al);
		
	}
}

class myComp implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return 1;
		}
		else if(o1>o2) {
			return -1;
		}
		else {
			return 0;	
		}
	}
}