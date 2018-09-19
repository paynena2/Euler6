//Nathaniel Payne
//Project Euler #6
public class Sum {
	public static void main(String[] args) {
		int difference;
		difference = sumPowered() - sumOfPowers(); //find the difference
		System.out.println(difference);
	}
	public static int sumOfPowers() {
		int total = 0;
		for(int x = 1; x<101; x++) {
			total =  total + (int)(Math.pow(x, 2.0)); // square everything individually and then add to the total
		}
		return total;
	}
	public static int sumPowered() {
		int total = 0;
		for(int x = 1; x < 101; x++) { //add everything together from 0-100
			total = total + x;
		}
		total = (int) Math.pow(total, 2); // square the sum of everything
		return total; 
	}
}
