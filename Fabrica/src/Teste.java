
public class Teste {

	public static void main(String[] args) {
		FabricaDeCarro fabrica = null;

		for (int i = 0; i < 10000; i++) {
			fabrica = FabricaDeCarro.getInstancia();
		}
	}
}
