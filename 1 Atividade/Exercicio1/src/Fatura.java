
public class Fatura {

	private String numero;
	private String descricao;
	private int qntCompraItem;
	private double precoPItem;
	private double valorFatura;
		
	public double getValorFatura() {
		if(qntCompraItem < 0 || precoPItem < 0) {
			valorFatura = 0.00;
		}else {
			valorFatura = qntCompraItem * precoPItem;
		}
		return valorFatura;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getDescicao () {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQntCompraItem() {
		return qntCompraItem;
	}
	
	public void setQntCompraItem(int qntCompraItem) {
		this.qntCompraItem = qntCompraItem;
	}
	
	public double getPrecoPItem() {
		return precoPItem;
	}
	
	public void setPrecoPItem(double precoPItem) {
		this.precoPItem = precoPItem;
	}
}
