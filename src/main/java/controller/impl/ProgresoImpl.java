package controller.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;

import configuracion.Conexion;
import controller.dao.IProgreso;
import model.Progreso;

public class ProgresoImpl implements IProgreso {

	private Connection cx;
	
	public ProgresoImpl() {
		
		
		cx = Conexion.conectar();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void guardar(Progreso progreso) {
		
		try {
			String sql = "INSERT INTO gym.progreso(idpersona, peso, estatura, cintura,cuello, cadera, imc, estado, idxcintura,grasacorporal,grasacorporalmagra,fecha) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,now())";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			
			preparedStatement.setInt(1, progreso.getIdPersona().getId());
			preparedStatement.setInt(2, progreso.getPeso());
			preparedStatement.setInt(3, progreso.getEstatura());
			preparedStatement.setInt(4, progreso.getCintura());
			preparedStatement.setInt(5, progreso.getCuello());
			preparedStatement.setInt(6, progreso.getCadera());
			
			preparedStatement.setFloat(7, progreso.getImc());
			preparedStatement.setString(8, progreso.getEstado());
			preparedStatement.setFloat(9, progreso.getIdxCintura());
			preparedStatement.setFloat(10, progreso.getGrasaCorporal());
			preparedStatement.setFloat(11, progreso.getGrasaCorporalMagra());
			//preparedStatement.setDate(12, (java.sql.Date) new Date());
			
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void actualizar(Progreso progreso) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Progreso> listarProgreesos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Progreso listarProgresoId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Progreso progreso) {
		// TODO Auto-generated method stub

	}

}
