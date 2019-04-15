public class ejer3{
	public static void main (string []ar)
		{
			scanner teclado= new scanner (system in);
			float sueldo;
			float multisueldo;
			string nom;
			string apellido;
			int horas;
			system.out.print("Ingrese nombre del trabajador: ");
			nom=teclado.nextstring();
			system.out.print("Ingrese apellido del trabajador: ");
			apellido=teclado.nextstring();
			system.out.print("Ingrese las horas de trabajador: ");
			horas=teclado.nextint();
			system.out.print("Ingrese su sueldo: ");
			sueldo=teclado.nextfloat();
			multisueldo= horas * sueldo;
 			System.out.print("Su sueldo es: "+ multisueldo);
 		} 	
}