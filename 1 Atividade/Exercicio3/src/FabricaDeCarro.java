
public class FabricaDeCarro {

	private FabricaDeCarro() {
		
	}
	
	private static FabricaDeCarro instancia = null;
	
	public static FabricaDeCarro getInstancia() {
		if(instancia == null) {
			System.out.println("Criado FabricaDeCarro!");
			instancia = new FabricaDeCarro();
		}
		return instancia;		
	}
}
