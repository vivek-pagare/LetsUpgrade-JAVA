package Day4;

public class AvengerMain {

	public static void main(String[] args) {
		Avenger[] avg = new Avenger[5];
		
		for(int i = 0; i < 5; i++) {
			avg[i] = new Avenger();
            avg[i].getDetails();
		}
		
		for(int i = 0; i < 5; i++) {
			avg[i].displayDetails();
		}

	}

}
