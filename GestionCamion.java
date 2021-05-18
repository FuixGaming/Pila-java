import java.util.Scanner;

public class GestionCamion {

	public static void main(String[] args) {
		PilaTextil Pila = new PilaTextil("pila", 0);
		Pila.inicializar();
		//MENU 1
		int menu=0;
		int pesoA = 0;
		int elementoActual = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿cuantos elementos caben en el camion?");
		int elemento = sc.nextInt();
		System.out.println("¿cual es el peso maximo?");
		int peso = sc.nextInt();
		
		//MENU 2
		while(menu != 6) {
			System.out.println("1. Meter");
			System.out.println("2. Mostrar");
			System.out.println("3. Extraer");
			System.out.println("4. Listar");
			System.out.println("5. Vaciar pila");
			System.out.println("6. Enviar");
			menu = sc.nextInt();
			
		switch(menu) {
		case 1: 
			Scanner id = new Scanner(System.in);
			System.out.println("Introduce el peso del elemento: ");
			int pesoAux = sc.nextInt();
			System.out.println("Introduce un id: ");
			String identificador = sc.next();
			pesoAux = pesoAux+pesoA;
			elementoActual++;
			if (pesoA>peso || elementoActual>elemento) {
				System.out.println("Se ha sobrepasado la capacidad.");
				pesoA = pesoA-pesoAux;
			}else {
				Pila.meter(identificador, pesoAux);
			}
			break;
			
		case 2:
			if(Pila.vacia()) {
			System.out.println("Error, La pila esta vacia.");
				
			}else {
				System.out.println("El ultimo elemento es: "+Pila.leercabeza());
			}
			break;
			
		case 3:
			if(Pila.vacia()) {
				System.out.println("Error, La pila esta vacia.");
			}else {
				System.out.println("El ultimo elemento es: "+Pila.leercabeza());
				pesoA = pesoA - Pila.leercabeza().getPeso();
				Pila.extraer();
				elementoActual--;										
			}
			break;
			
		case 4: 
			if(Pila.vacia()) {
			System.out.println("Error, La pila esta vacia.");			
			}else {
				System.out.println(Pila.listar());
			}
			break;
			
		case 5:
			Pila.inicializar();
			break;
			
		case 6: 
			System.out.println("Saliendo del menu...");
			break;
		}			
		
	}
	
	}

}
