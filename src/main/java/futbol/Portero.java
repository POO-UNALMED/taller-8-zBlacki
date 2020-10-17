package futbol;

public class Portero extends Futbolista{

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre ,edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public boolean jugarConLasManos() {
		return (true);
	}
	public int compareTo(Futbolista comparar) {
		return (2);
	}
	public int compareTo(Portero comparar) {
		return (comparar.golesRecibidos - this.golesRecibidos);
	}
	public String toString() {
		return ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos);   
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
