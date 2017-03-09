import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import configuracion.Conexion;

public class ConexionTest {

	@Test
	public void testConectar() {
		
		Connection cnx;
		cnx = Conexion.conectar();
		
		
		assertNotNull(cnx);
		
	}

	@Test
	public void testDesconectar() {
		Connection cnx;
		
		cnx = Conexion.conectar();
		Conexion.desconectar();
		
		
		assertNotNull(cnx);
	}

}
