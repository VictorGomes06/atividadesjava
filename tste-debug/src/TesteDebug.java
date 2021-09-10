
public class TesteDebug {

	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 15;		
		int c = a + b;
		
		
		System.out.printf("%d + %d = %d", a, b, c);
		System.out.println();
		System.out.println(a + " + " + b + " = " + c);
		
		String resposta = "Sim";
		if (resposta == "Sim") {
			System.out.println("a resposta é sim !");
		}
		else {
			System.out.println("resposta incorreta !");
		}
		
		int cont = 0;
		
		while (cont < 5 ) {
			System.out.println(cont);
			cont++;
		}

		
	}

}
