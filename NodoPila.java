
public class NodoPila {

	 	private String identificador;
	    private int peso;
	    private NodoPila sig;
	    public NodoPila(String identificador, int peso, NodoPila sig) {
	        super();
	        this.identificador = identificador;
	        this.peso = peso;
	        this.sig = sig;
	    }
	    public String getIdentificador() {
	        return identificador;
	    }
	    public void setIdentificador(String identificador) {
	        this.identificador = identificador;
	    }
	    public int getPeso() {
	        return peso;
	    }
	    public void setPeso(int peso) {
	        this.peso = peso;
	    }
	    public NodoPila getSig() {
	        return sig;
	    }
	    public void setSig(NodoPila sig) {
	        this.sig = sig;
	    }
	    
	    public String toString() {
	        return "NodoPila [identificador=" + identificador + ", peso=" + peso + "]";
	    }
}
