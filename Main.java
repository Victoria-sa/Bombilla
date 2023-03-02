package BombillaPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// vemos el funcionamiento 
		Bombilla salon=new Bombilla();
		Bombilla hab1=new Bombilla();
		Bombilla hab2=new Bombilla();
		Bombilla cocina= new Bombilla();
		Bombilla banio= new Bombilla();
		Bombilla terraza= new Bombilla();
		int opcion;
		Scanner lector= new Scanner(System.in);
		//menu para uso del interuptor
		do {
			System.out.println(" ** Que bombilla desea utilizar **");
			System.out.println(" 1. Salon "+ "["+ salon.mostrarEstado()+"]");
			System.out.println(" 2. Cocina " + "[" + cocina.mostrarEstado()+"]");
			System.out.println(" 3. Baño "+ "["+ banio.mostrarEstado()+"]");
			System.out.println(" 4. Habitacion principal"+ "["+hab1.mostrarEstado()+"]");
			System.out.println(" 5. Habitacion Auxiliar"+ "["+ hab2.mostrarEstado()+"]");
			System.out.println(" 6. Terraza "+ "["+ terraza.mostrarEstado()+"]");
			System.out.println(" 7. Interrruptor General "+ "["+ Bombilla.interruptorGeneral+"]");
			System.out.println(" 8. Salir ");
			System.out.println("Indique la opcion");
			opcion=lector.nextInt();
			String mensaje="El estado de la bombilla es: ";
			switch(opcion) {
			case 1-> {
				salon.encenderOapagar();

				}
			case 2->{
				cocina.encenderOapagar();
			}
			case 3->{
				banio.encenderOapagar();
			}
			case 4->{
				hab1.encenderOapagar();
			}
			case 5->{
				hab2.encenderOapagar();
				}
			case 6->{
				terraza.encenderOapagar();
				}
			case 7->{
				if(Bombilla.interruptorGeneral) {
					Bombilla.interruptorGeneral=false;
					}else {
					Bombilla.interruptorGeneral=true;
				}			
			}						
			default->
			System.out.println("Opcion no valida");				
			}				
			
		}while(opcion!=8);
					
	}

}
