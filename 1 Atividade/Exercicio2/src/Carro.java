
public class Carro {

	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMax;
	
	void liga() {
			System.out.println("O carro esta ligado!");
	}
	
	void acelerar(int velocidadeAcrecentada) {
		int velocidadeNova = this.velocidadeAtual + velocidadeAcrecentada;
		this.velocidadeAtual = velocidadeNova;
			if(velocidadeNova > this.velocidadeMax) {
				System.out.println("A velocidade maxima foi exedida!");
			}
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public int getVelocidadeMax(){
		return velocidadeMax;
	}
	
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
}
