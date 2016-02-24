
public class MainFabricaDeCarro {

	public static void main(String[] args) {
		
		FabricaDeCarro fabricaDeCarro = null;
		
		for(int i = 0; i < 200; i++) {
			fabricaDeCarro = FabricaDeCarro.getInstancia();
		}
	}
}
