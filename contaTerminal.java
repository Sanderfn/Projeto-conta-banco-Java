package contaTerminal;

import java.util.Locale;
import java.util.Scanner;


public class contaTerminal {
	
	public static void main(String[] args) throws Exception{
		
		// TODO:Conhecer e importar a classe Scanner
		
		Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
		
		//Obter pela scanner os valores digitados no terninal
		
		System.out.println("Digite o numero de sua agência: ");
		String agencia = scanner.next();
		
		System.out.println("Digite o numero de sua conta: ");
		int conta = scanner.nextInt();
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite o sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.println("Digite seu saldo");
		float saldo = scanner.nextFloat();
		
		//Exibir a mensagem criada
		
		System.out.println("Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco.");
		System.out.println("Segue os dados de sua conta.");
		System.out.println("Agencia nº: " + agencia);
		System.out.println("Conta nº: " + conta);
		System.out.println("Saldo da conta: R$ " + saldo);
		System.out.println("Seu saldo de R$ " + saldo + ", já está disponível para saque.");
	}
	
}
