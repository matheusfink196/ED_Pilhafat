package view;
import controller.ContFat;
public class PrincipalFat {
	public static void main(String[] args) throws Exception{
		ContFat fatorial = new ContFat();

		int num = 6;
		
		
		int fat = fatorial.fatorial(num); 
		
		System.out.println("fatorial é: " + fat);
	}
}
