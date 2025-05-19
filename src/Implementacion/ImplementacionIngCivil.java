package Implementacion;

import java.util.HashMap;

import Interface.MetodosIngCivil;
import Model.IngCivil;

public class ImplementacionIngCivil implements MetodosIngCivil {

	private HashMap<Long, IngCivil> hashMapDatos = new HashMap<Long, IngCivil>();
	
	@Override
	public void guardar(IngCivil civil) {
		// TODO Auto-generated method stub
		hashMapDatos.put(civil.getCedula(), civil);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hashMapDatos);
	}

	@Override
	public IngCivil buscar(long cedula) {
		// TODO Auto-generated method stub
		return hashMapDatos.get(cedula);
	}

	@Override
	public void editar(IngCivil civil) {
		// TODO Auto-generated method stub
		hashMapDatos.put(civil.getCedula(), civil);
	}

	@Override
	public void eliminar(long cedula) {
		// TODO Auto-generated method stub
		hashMapDatos.remove(cedula);
	}

}
