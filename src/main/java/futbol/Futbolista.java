package futbol;

public abstract class Futbolista implements Comparable<Object>{
	
	private String nombre; 
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	public String toString() {
		return ("El futbolista " + this.nombre  + " tiene " + this.edad + ", y juega de " + this.posicion);
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	public void setNombre(String nombreNuevo) {
		this.nombre = nombreNuevo;
	}
	public int getEdad() {
		return (this.edad);
	}
	public void setEdad(int edadNueva) {
		this.edad = edadNueva;
	}
	public String getPosicion() {
		return (this.posicion);
	}
	public int compareTo (Futbolista futbolista) {
		if (this.equals(futbolista)) {
			return (1);
		}else {
			return (0);
		}
	}
	public abstract boolean jugarConLasManos();
	
}
