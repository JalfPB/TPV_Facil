package Principal;

public class Producto {
	
	/*fila[0] = r.getString("Id");
                fila[1] = r.getString("Nombre");
                fila[2] = r.getString("Cantidad");
                fila[3] = r.getString("Precio");*/
	
	private String id;
	private String nombre;
	private int cantidad;
	private float precio;
	
	public Producto(String id, String nombre,int cantidad,float precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
