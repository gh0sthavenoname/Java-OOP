public class CostCalculation {
	public static void main(String[] args) {
	int a = 40;
  double y = 0;

  y = a > 5 && a <= 30 ? (a-5)*1.2 :y;
  y = a > 30 ? (a - 30) * 1.5 : y;
  System.out.println(y);
}
  }


