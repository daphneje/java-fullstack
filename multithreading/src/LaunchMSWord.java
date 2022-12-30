class MSWord extends Thread{
	public void run() {
		if(getName().equals("TYPE")){
			type();
		} else if (getName().equals("SPELLCHECK")){
			spellCheck();
		} else {
			autoSave();
	}
}
	
	void type() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println("Typing is in progress");
				Thread.sleep(3000);
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void spellCheck() {
		try {
			for(;;) {
				System.out.println("Spell Checking is in progress");
				Thread.sleep(3000);
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void autoSave() {
		try {
			for(;;) {
				System.out.println("Auto Saving is in progress");
				Thread.sleep(3000);
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class LaunchMSWord {
	public static void main(String[] args) {
		MSWord ms1 = new MSWord();
		MSWord ms2 = new MSWord();
		MSWord ms3 = new MSWord();
		
		ms1.setName("TYPE");
		ms2.setName("SPELLCHECK");
		ms3.setName("AUTOSAVE");
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms2.setPriority(8); // set priority > 5
		ms3.setPriority(9); // set priority > 5
		
		ms1.start();
		ms2.start();
		ms3.start();
	}

}