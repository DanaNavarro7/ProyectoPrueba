package Interface;

import Model.IngCivil;

public interface MetodosIngCivil {

	public void guardar(IngCivil civil);

	public void mostrar();

	public IngCivil buscar(long cedula);

	public void editar(IngCivil civil);

	public void eliminar(long cedula);

}
