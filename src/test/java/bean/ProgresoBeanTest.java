package bean;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.bean.ProgresoBean;
import model.Persona;
import model.Progreso;

public class ProgresoBeanTest {

	@Test
	public void test() {
		
		ProgresoBean bean= new ProgresoBean();
		
		Progreso progreso = new Progreso();
		Persona persona= new Persona();
		
		persona.setGenero("F");
		
		progreso.setEstatura(161);
		progreso.setPeso(40);
		progreso.setCintura(63);
		progreso.setCuello(30);
		progreso.setCadera(73);
		bean.setProgreso(progreso);
		bean.setPersona(persona);
		
		bean.calcular();
		
		System.out.println(bean.getProgreso().getImc()+"/"+bean.getProgreso().getEstado()+"/"+bean.getProgreso().getIdxCintura()+"/"+bean.getProgreso().getGrasaCorporal()+"/"+bean.getProgreso().getGrasaCorporalMagra());
		
		fail("hola");
		
		
		
		
		
		
		
		
	}

}
