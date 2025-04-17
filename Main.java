import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner cs = new Scanner(System.in);
		String myStr = new String("Concatenar esta cadena");
		String myStr2 = new String("Con esta otra");
		String result = myStr + " / " + myStr2;
		System.out.println(result);
	}
}