package farmersloan;


public class LaunchCalculation {
	int principleFromFarmer;
	int durationFromFarmer;
	
	public void collectDetailsFromFarmers( ) {
		Farmer f1 = new Farmer();
		principleFromFarmer = f1.inputPrinciple();
	}

}
