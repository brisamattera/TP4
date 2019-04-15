public class ejer2{
	public static void main (string []ar)
		{
			scanner teclado= new scanner (system in);
			float nota1;
			float nota2;
			float nota3;
			float prom;
			string nom;
			string apellido;
			system.out.print("Ingrese nombre del alumno: ");
			nom=teclado.nextstring();
			system.out.print("Ingrese apellido del alumno: ");
			apellido=teclado.nextstring();
			system.out.print("Ingrese primer nota: ");
			nota1=teclado.nextfloat();
			system.out.print("Ingrese segundo nota: ");
			nota2=teclado.nextfloat();
			system.out.print("Ingrese tercer nota: ");
			nota3=teclado.nextfloat();
			prom= (nota1 + nota2 + nota3) / 3;
 			System.out.print("El promedio es: "+ prom);
 		} 	
}