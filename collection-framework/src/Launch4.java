import java.util.Comparator;
import java.util.TreeSet;

public class Launch4 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return 1;
		}
		else if (o1>o2) {
			return -1;
		} else
		return 0;
	}
}