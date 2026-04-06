package placement;

interface Payment1 {
	void pay();
}
class GPay implements Payment1{
	public void pay() {
		System.out.println("GPay payment");
	}
}
class PhonePe implements Payment1{
	public void pay() {
		System.out.println("PhonePe payment");
	}
}
public class Payment{
	public static void main(String[]args) {
		Payment1 p = new GPay();
		p.pay();
		Payment1 y = new PhonePe();
		y.pay();
	}
}