package controller.bean;

import java.text.DecimalFormat;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import controller.impl.ProgresoImpl;
import model.Persona;
import model.Progreso;

@ManagedBean
@ViewScoped
public class ProgresoBean {

	Persona persona;
	Progreso progreso;
	float LN_10 = (float) 2.302585092994046;
	DecimalFormat decimalFormat = new DecimalFormat("#.##");

	public ProgresoBean() {
		persona = new Persona();
		persona.setId(1);
		persona.setGenero("F");
		
		progreso = new Progreso();
		
		progreso.setIdPersona(persona);

	}

	public void calcular() {

		String estado = "";
		float estatura = Float.valueOf(decimalFormat.format((float) progreso.getEstatura() / 100));
		float imc = Float.valueOf(decimalFormat.format((float) (progreso.getPeso() / Math.pow(estatura, 2))));
		progreso.setImc(imc);

		if (imc < 18.50) {

			estado = "Bajo peso";
		} else if (imc < 24.90) {

			estado = "Peso normal";
		} else if (imc < 29.90) {

			estado = "Sobrepeso";
		} else {
			estado = "Obesidad";
		}

		progreso.setEstado(estado);

		progreso.setIdxCintura(
				Float.valueOf(decimalFormat.format((float) progreso.getCintura() / progreso.getEstatura())));

		float grasac;
		float logs;
		float logs1 = (float) (Math.log(progreso.getEstatura()) / LN_10);
		;

		if (progreso.getIdPersona().getGenero().equals("M")) {

			logs = (float) Math.log(progreso.getCintura() - progreso.getCuello()) / LN_10;
			grasac = Float
					.valueOf(decimalFormat.format((float) (495 / (1.0324 - 0.19077 * logs + 0.15456 * logs1) - 450)));

			progreso.setGrasaCorporal(grasac);

		} else {

			logs = (float) Math.log(progreso.getCintura() + progreso.getCadera() - progreso.getCuello()) / LN_10;

			grasac = Float
					.valueOf(decimalFormat.format((float) (495 / (1.29579 - 0.35004 * logs + 0.22100 * logs1) - 450)));

			progreso.setGrasaCorporal(grasac);

		}

		progreso.setGrasaCorporalMagra(Float
				.valueOf(decimalFormat.format((float) progreso.getPeso() * (100 - progreso.getGrasaCorporal()) / 100)));

	}
	
	public String guardar(){
		
		ProgresoImpl progresoImpl = new ProgresoImpl();
		
		progresoImpl.guardar(getProgreso());
		
		return "index.xhtml";
		
		
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Progreso getProgreso() {
		return progreso;
	}

	public void setProgreso(Progreso progreso) {
		this.progreso = progreso;
	}

}
