import java.util.Scanner;

public class MainCarro {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		Carro meuCarro = new Carro();
		
		System.out.println("Digite a cor do seu carro: ");
			String cor = scan.next();
			meuCarro.setCor(cor);
		System.out.println("Digite o modelo do seu carro: ");
			String modelo = scan.next();
			meuCarro.setModelo(modelo);
		System.out.println("Digite a velocidade atual do seu carro: ");
			int velocidadeAtual = scan.nextInt();
			meuCarro.setVelocidadeAtual(velocidadeAtual);
		System.out.println("Digite a velocidade maxima do seu carro: ");
			int velocidadeMax = scan.nextInt();
			meuCarro.setVelocidadeMax(velocidadeMax);
					
		meuCarro.liga();
		
		System.out.println("Quanto voce deseja acelerar? ");
			int velocidadeAcrecentada = scan.nextInt();			
			meuCarro.acelerar(velocidadeAcrecentada);
		System.out.println("A velocidade atual do carro e: "+ meuCarro.getVelocidadeAtual());
	}

}
