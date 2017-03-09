package controller.dao;

import java.util.List;

import model.Progreso;

public interface IProgreso {
	
	public void guardar(Progreso progreso);
	public void actualizar(Progreso progreso);
	public List<Progreso> listarProgreesos();
	public Progreso listarProgresoId(int id);
	public void eliminar(Progreso progreso);
	
	
	

}
