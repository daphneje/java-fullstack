import java.util.Scanner;

public class LaunchSuperUglyNumber {
	
    private static int findNthSUN(int[] primes, int n) {
    	
        int SUN[] = new int[n];
        
        int nextSUN=1;
        SUN[0]=nextSUN;
        
        int multiplesOfPrime[] = new int[primes.length];
        int nextMultipleOfPrime[] = new int[primes.length];
        
        for(int i=0;i<primes.length;i++){
            nextMultipleOfPrime[i] = primes[i];
        }
        
        int i=1;
        
        while(i<n){
            nextSUN = Integer.MAX_VALUE; // maximum positive integer value
            for(int j=0;j<primes.length;j++){
                if(nextSUN>nextMultipleOfPrime[j]){
                	nextSUN = nextMultipleOfPrime[j];
                }
            }
            if(SUN[i-1]!=nextSUN) {
                SUN[i] = nextSUN;
                i++;
            }

            for(int j=0;j<primes.length;j++){
                if(nextSUN == nextMultipleOfPrime[j]){
                    multiplesOfPrime[j]++;
                    nextMultipleOfPrime[j]=SUN[multiplesOfPrime[j]]*primes[j];

                    break;
                }
            }
        }
        return SUN[n-1];
    }

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        
	     System.out.println("Length of primes array?");
	     int primeArrayLength = scan.nextInt();
	     int[] primes = new int[primeArrayLength];
	        
	     System.out.println("Please provide " + primeArrayLength + " numbers:");
	     for(int i = 0; i < primeArrayLength; i++) {
	    	 primes[i] = scan.nextInt();
	     }
	        
	     System.out.println("What is the target nth number?");
	     int n = scan.nextInt();

	     scan.close();
	     
	     System.out.println("The nth super ugly number is: " + findNthSUN(primes,n));

	}

}
