package kadai_008;

public class Price_Chapter08 {
	public static void main(String[] args) {
		
		int userAge = 3;
		String serviceCost = "";
		
		serviceCost =switch(userAge) {
		case 1 -> "10代の料金は1000円";
		case 2 -> "20代の料金は2000円";
		case 3 -> "30代の料金は3000円";
		case 4 -> "40代の料金は3000円";
		case 5 -> "50代の料金は4000円";
		case 6 -> "60代の料金は4000円";
		case 7 -> "70代の料金は4000円";
		case 8 -> "80代の料金は5000円";
		default -> "上記以外の年代は500円";
		};
		
		System.out.println(serviceCost);
	}
}