package consola;
import logica.*;
public class PrincipalEmpleado {

	public static void main(String[] args) {
		Fecha f1=new Fecha(12,3,2022);
		Empleado e1=new Empleado("222","Juan",20000,f1);
    System.out.println(e1);

	}

}
