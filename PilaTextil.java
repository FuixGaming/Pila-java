public class PilaTextil {
	private NodoPila pila;

	public PilaTextil(String identificador, int peso) {
		this.pila = new NodoPila(identificador, peso, null);
	}
	
	public void inicializar() {
		this.pila = null;
	}
	
	public PilaTextil leercabeza() {
		return this;
	}
	
	public PilaTextil extraer() {
		PilaTextil aux=this;
		if (this.pila!=null) {
			this.pila=this.pila.getSig();
		}
		return aux;
	}
	
	public void tirar() {
		
		if (this.pila != null) {
			this.pila = this.pila.getSig();
		}
	}
	
	public void meter(String identificador, int peso) {
		NodoPila aux = new NodoPila(identificador, peso, this.pila);
		this.pila = aux;
	}
	
	public boolean vacia() {
		if (this.pila != null) {
			return false;
		}
		return true;
	}
	
	public int longitud() {
		int contador = 0;
		NodoPila aux = this.pila;
		while(aux != null) {
			contador++;
			aux = aux.getSig();
		}
		return contador;
	}
	
	@Override
	public String toString() {
		return ("identificador: "+this.pila.getIdentificador()+" peso: "+this.pila.getPeso());
	}
	public String listar() {
		String cadena = "";
		NodoPila aux = this.pila;
		while(aux != null) {
			cadena+=aux.toString()+"\n";
			aux = aux.getSig();
		}
		return cadena;
	}
	public int getPeso() {
		return this.pila.getPeso();
	}
	
}
