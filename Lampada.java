
public class Lampada {
	private String tipo;
	private boolean estado;
	private int watts;
	
	public Lampada() {
		this.tipo = "led";
		this.estado = true;
		this.watts = 60;
	}
	
	public Lampada(String estado, String tipo, int watts) {
		
		if(estado == "Ligada")
			this.estado = true;
		else
			this.estado = false;
		
		this.tipo = tipo;
		this.watts = watts;
			
	}
	
	public void RetornaLampadas() {
		if(this.estado == true)
			System.out.println("ligada "+ this.tipo + " " + this.watts+"watts");
		else
			System.out.println("desligada "+ this.tipo + " " + this.watts+"watts" );
	}
	
	

}
