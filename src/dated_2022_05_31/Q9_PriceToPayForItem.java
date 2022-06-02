package dated_2022_05_31;

public class Q9_PriceToPayForItem {

	public static void main(String[] args) {
		int price = Integer.parseInt(args[0]);
		short quantity = Short.parseShort(args[1]);
		float discount = 0;
		if (quantity >= 10) {
			discount = (price * quantity) * 0.1f;
		}
		System.out.println("Amount to be paid: " + ((price * quantity) - discount));
	}

}
