package Model;

public abstract class Profesionistas {

	private long cedula;
	private String carrera;

	public Profesionistas(long cedula, String carrera) {
		this.cedula = cedula;
		this.carrera = carrera;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
