package listadois;

public class MaisQueMil {

	public static void main(String[] args) {
		int m41 = 4*251;
		int m42 = 4*252;
		int m43 = 4*253;
		int m44 = 4*254;
		int soma;
		int p1 = 2;
		int p2 = 3;
		int p3 = 5;
		int p4 = 7;
		int pr;
		int res;
		
		soma = m41 + m42 + m43 + m44;
		System.out.println("O resultado da soma dos 4 primeiros múltiplos de 4 acima de mil"
							+ " é igual a: "+soma);
		
		pr = p1 + p2 + p3 + p4;
		res = soma - pr;
		
		System.out.println("O resultado da substração de "+soma+" pelos 4 primeiros "
							+ "números primos a partir de um fica igual a: "+res);

	}

}
