package Model;

public class IngCivil extends Profesionistas{
	
	private String grado;
	private float salario;
	
	public IngCivil(long cedula, String carrera, String grado, float salario) {
		super(cedula, carrera);
		this.grado = grado;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "IngCivil [getCedula()=" + getCedula() + ", getCarrera()=" + getCarrera() + ", grado=" + grado
				+ ", salario=" + salario + "]\n";
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
