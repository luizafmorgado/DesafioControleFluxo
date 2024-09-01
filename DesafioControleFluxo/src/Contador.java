import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite um segundo número: ");
		int parametroDois = terminal.nextInt();
		
		try {

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {

			System.out.println(e.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException ("O segundo número deve ser maior que o primeiro.");
		}
		int contagem = parametroDois - parametroUm;
		
		for (int i = parametroUm; i <= parametroDois; i++){

			System.out.println("Imprimindo o número " + i);
		}
	}
}
