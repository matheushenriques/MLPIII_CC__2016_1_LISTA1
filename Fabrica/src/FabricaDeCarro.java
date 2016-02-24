
public class FabricaDeCarro {
	
	
	private FabricaDeCarro(){
		
	}
	
	private static FabricaDeCarro instancia = null;
	
	public static FabricaDeCarro getInstancia(){
		if(instancia == null){
			System.out.println("Instancia Criada!!");
			instancia = new FabricaDeCarro();
		}
		return instancia;
	}
	
}
