import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Launch1 {

	public static void main(String[] args) throws Exception {
		String path1 = "/Users/daph/Desktop/Avensys Training/input.txt";
		String path2 = "/Users/daph/Desktop/Avensys Training/output.txt";
		
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		String x;

		while((x= br.readLine())!=null) {
			bw.write(x);
			
		bw.flush();
		
		br.close();
		bw.close();
		}
	}

}

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//public class Launch1 {
//
//	public static void main(String[] args) throws Exception {
//		String path1 = "/Users/daph/Desktop/Avensys Training/input.txt";
//		String path2 = "/Users/daph/Desktop/Avensys Training/output.txt";
//		
//		FileInputStream fis = new FileInputStream(path1);
//		FileOutputStream fos = new FileOutputStream(path2);
//		
//		int x;
//
//		while((x=fis.read())!=-1) {
//			fos.write(x);
//			
//		System.out.println(x);
//		
//		}
//	}
//
//}
