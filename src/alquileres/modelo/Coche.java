package alquileres.modelo;


/**
 * Un coche es un vehículo que añade un nº de plazas
 * 
 * El coste final de alquiler depende no solo del nº de días de alquiler 
 * sino también del nº de plazas. Si el nº de plazas es > 4 se añaden 5€ más por día
 * 
 * @author Christian
 * 
 */
public class Coche extends Vehiculo{
	
	private int numPlazas;
	public static final int INCREMENTO = 5;
	
	/**
	 * Constructor de la clase Coche
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param precioDia
	 */
	public Coche(String matricula, String marca, String modelo, double precioDia, int numPlazas) {
		super(matricula, marca, modelo, precioDia);
		this.numPlazas = numPlazas;
	}

	/**
	 * @return the numPlazas
	 */
	public int getNumPlazas() {
		return numPlazas;
	}

	/**
	 * @param numPlazas the numPlazas to set
	 */
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	/**
	 * Definici�n nueva del m�todo para el c�lculo del precio del alquiler de un coche
	 */
	@Override
	public double calcularPrecioAlquiler(int dias) {
		double precioSinIncremento = super.calcularPrecioAlquiler(dias);
		if(this.getNumPlazas() > 4) {
			double incremento = INCREMENTO * dias;
			return precioSinIncremento + incremento;
		}
		return precioSinIncremento;
	}

}
