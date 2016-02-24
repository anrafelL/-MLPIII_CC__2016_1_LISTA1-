import java.util.Scanner;

public class MainFatura {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Fatura minhaFatura = new Fatura();
				
		System.out.println("Digite o numero da fatura: ");
			String numero = scan.next();
			minhaFatura.setNumero(numero);
		System.out.println("Digite a descricao da fatura: ");
			String descricao = scan.next();
			minhaFatura.setDescricao(descricao);
		System.out.println("Digite a quantidade de item comprado: ");
			int qntCompraItem = scan.nextInt();
			minhaFatura.setQntCompraItem(qntCompraItem);
		System.out.println("Digite o preco do item: ");
			double precoPItem = scan.nextDouble();
			minhaFatura.setPrecoPItem(precoPItem);
		
		System.out.println("Valor da fatura: "+ minhaFatura.getValorFatura());
	}
}
