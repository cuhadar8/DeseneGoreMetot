import java.util.Scanner;

public class Main {
	
	public static void createDesign(int number) {
		
		System.out.print(number + " ");  //16 11 6 1 -4 çıktısını burası bastırıyor
		
		if(number > 0) {
			createDesign(number-5);
			System.out.print(number + " ");  //daha sonra if bloğuna giren en son sayı olan 1 den devam ederek geri dönüyor ve
											//1 6 11 16 burada bastırılıyor
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("N sayısı: ");
		int n = scanner.nextInt();
		createDesign(n);
	}

}
