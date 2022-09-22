package logica;

public class Articulo {
	
		private int codigo;
		private String nombre;
		private double precioCosto;
		private Fecha vencimiento;

//-------------------------------------
public Articulo(String n , int c , double pc , Fecha v) {
     
      nombre=n;
      codigo=c;
      precioCosto=pc;
      vencimiento=v;
 //----------------------------------   
}
public Articulo() {
}
public int getCodigo() {
	return codigo;
}
public String getNombre() {
   return nombre;
}
public double getPrecioCosto() {
	return precioCosto;
}
public Fecha getVencimiento() {
	return vencimiento;
}

//-----------------------------------
public void setNombre(String n) {
	this.nombre = nombre;
}
public void setCodigo(int c) {
	this.codigo = codigo;
}
public void setPrecioCosto(double pc) {
	this.precioCosto = precioCosto;
}
public void setVencimiento(Fecha v) {
	this.vencimiento = vencimiento;
}

//------------------------------------
//Metodo especificos

public boolean estaVencido(Fecha f) {
	boolean esta=false;
	return esta;
}

public double precioVenta() {
	return(precioCosto*0.20+precioCosto);
}

//------------------------------------
public String toString() {
	return("nombre " + nombre + " codigo " + codigo +  " precio Costo " + precioCosto + " vencimiento " + vencimiento);
}

}

