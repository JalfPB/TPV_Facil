package Principal;

public class Empresa {
	
	//Se declaran estaticas para poder acceder a ellas desde toda la app
	
	public static String nombre;
	public static String contraseña;
	
	
	public Empresa(String nombre, String contraseña) {
		
		this.nombre=nombre;
		this.contraseña=contraseña;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

}
