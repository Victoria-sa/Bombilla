package BombillaPOO;
/**lA CLASE BOMBILLA SE IMPLEMENTA CON UN INDICADOR DE ESTADO (OFF/ON), QUE SERA INDIVIDUAL PARA CADA BOMBILLA
 * (CADA OBJETO BOMBILLA)AL SER ESTATICO SERA EL MISMO VALOR PARA TODAS
 * @author Programador
 *1.cuantas bombillas.
 */



public class Bombilla {

	public static boolean interruptorGeneral = true;//ATRIBUTO ESTATICO
	private boolean interruptor;//interruptor(estado) que posee cada 	bombilla

	public Bombilla() {//contructor vacio para crear el objeto bombilla
		this.interruptor = false;//inicialmente estan apagadas
	}
	//metodo que enciende o apaaga segun como este el interrupptor
	public void encenderOapagar() {
		if(this.interruptor) {
			this.interruptor=false;
		}else {
			this.interruptor=true;
		}
	}
	public void encender() {
		this.interruptor=true;
	}//metodo para apagar
	public void apagar() {
		this.interruptor=false;
		
	}
	//metodo para cambiar estado
	public boolean estado() {
		return interruptorGeneral && this.interruptor;
		
	}
	public String mostrarEstado() {
		return estado()? " Encendida ": " Apagada ";//depenediendo del estado la cadena se devuelve encen/apaga
		
	}
	}
	
		

