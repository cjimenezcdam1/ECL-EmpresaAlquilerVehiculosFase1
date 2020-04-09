package alquileres.modelo;


/**
 * Una furgoneta es un vehículo que añade la característica del volumen de carga
 * (valor de tipo double)
 * 
 * El coste de alquiler de una furgoneta no solo depende del nº de días de
 * alquiler
 * Tendrá un incremento que dependerá de su volumen de carga: hasta 5 m3
 * exclusive ( metros cúbicos) de volumen el incremento sobre el precio
 * final será de 10€, entre 5 y 10 (inclusive) el incremento sobre el precio
 * final será de 15€, si volumen > 10 el incremento sobre el precio final será de
 * 25€
 * 
 * @author Christian
 * 
 */
public class Furgoneta extends Vehiculo{

	private double volumenCarga;
	
	/**
	 * Constructor de la clase Furgoneta
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param precioDia
	 */
	public Furgoneta(String matricula, String marca, String modelo, double precioDia, double volumenCarga) {
		super(matricula, marca, modelo, precioDia);
		this.setVolumenCarga(volumenCarga);
	}

	/**
	 * @return the volumenCarga
	 */
	public double getVolumenCarga() {
		return volumenCarga;
	}

	/**
	 * @param volumenCarga the volumenCarga to set
	 */
	public void setVolumenCarga(double volumenCarga) {
		this.volumenCarga = volumenCarga;
	}
}
