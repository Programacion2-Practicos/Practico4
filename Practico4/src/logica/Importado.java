package logica;

public class Importado extends Articulo {
	private double impuesto;
	private int anioImportacion;
	
	//Constructores
	
	public Importado() {
		super();
	}
	public Importado(double impuesto, int anioImportacion,String nombre , int codigo , double precioCosto , Fecha vencimiento ) {
		super(nombre, codigo, precioCosto, vencimiento);
		this.impuesto = impuesto;
		this.anioImportacion = anioImportacion;
	}
	
	
	//Setters y Getters
	
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public int getAnioImportacion() {
		return anioImportacion;
	}
	public void setAnioImportacion(int anioImportacion) {
		this.anioImportacion = anioImportacion;
	}
	@Override
	public String toString() {
		return super.toString()+"impuesto=" + impuesto + ", anioImportacion=" + anioImportacion;
	}
	@Override
	public double precioVenta() {
		return(super.getPrecioCosto()*0.20+super.getPrecioCosto());
	}
	
}
