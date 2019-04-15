public class ejer1{
	public static void main (string []ar)
		{
			scanner teclado= new scanner (system in);
			int numero1;
			int numero2;
			int suma;
			int resta;
			int division;
			int multiplicacion;
			int resultado;
			system.out.print("Ingrese primer numero: ");
			numero1=teclado.nextfloat();
			system.out.print("Ingrese segundo numero: ");
			numero2=teclado.nextfloat();
 			suma= numero1 + numero2;
 			resta= numero1 - numero2;
 			division= numero1 / numero2;
 			multiplicacion= numero1 * numero2;
 			System.out.print("El resultado  de la suma es: "+ suma, "El resultado de la resta es:" + resta, "El resultado de la division es:" + division, "El resultado de la multiplicacion es:" + multiplicacion);
 		} 	
}