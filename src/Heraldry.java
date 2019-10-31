import java.util.*;

public class Heraldry {
	public static void main(String[] args) {
		Heraldry h = new Heraldry();
		h.CalculateHeraldry();
	}

	public String CalculateHeraldry() {
		Scanner s = new Scanner(System.in);
		String inputs[] = {"","",""};
		
		for (int i =0;i<3;i++) {
			inputs[i]=s.nextLine().toUpperCase();
		}
		
		for (int i = 0;i<3;i++) {
			System.out.println(inputs[i]);
		}
		return "";
	}

	public String FindShield() {
		String Shield[][] = {{"Silver",""},{"Gold",""},{"Black",""},{"Green",""},{"Blue",""},{"Red",""},{"Purple",""},{"Maroon",""},{"Orange",""}};
		return "";
	}
	/*
	 * Silver;
	 * Gold
	 * Black
	 * Green
	 * Blue
	 * Red
	 * Purple
	 * Maroon
	 * Orange
	 */
	
	public String FindTinctures() {

		return "";
	}
	
	public String FindFieldVariations() {

		return "";
	}
	public String FindFieldDivisons() {

		return "";
	}
	public String FindOrdinaries() {

		return "";
	}
	public String FindCharges() {

		return "";
	}
}
