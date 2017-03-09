package model;

import java.util.Date;

public class Progreso {

	private int id;
	private Persona idPersona;
	private int peso;
	private int estatura;
	private int cintura;
	private int cuello;
	private int cadera;
	
	private float imc;
	private String estado;
	private float idxCintura;
	private float grasaCorporal;
	private float grasaCorporalMagra;
	private Date fecha;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Persona getIdPersona() {
		return idPersona;
	}




	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}




	public int getPeso() {
		return peso;
	}




	public void setPeso(int peso) {
		this.peso = peso;
	}




	public int getEstatura() {
		return estatura;
	}




	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}




	public int getCintura() {
		return cintura;
	}




	public void setCintura(int cintura) {
		this.cintura = cintura;
	}




	public int getCuello() {
		return cuello;
	}




	public void setCuello(int cuello) {
		this.cuello = cuello;
	}




	public int getCadera() {
		return cadera;
	}




	public void setCadera(int cadera) {
		this.cadera = cadera;
	}




	public float getImc() {
		return imc;
	}




	public void setImc(float imc) {
		this.imc = imc;
	}




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
		this.estado = estado;
	}




	public float getIdxCintura() {
		return idxCintura;
	}




	public void setIdxCintura(float idxCintura) {
		this.idxCintura = idxCintura;
	}




	public float getGrasaCorporal() {
		return grasaCorporal;
	}




	public void setGrasaCorporal(float grasaCorporal) {
		this.grasaCorporal = grasaCorporal;
	}




	public float getGrasaCorporalMagra() {
		return grasaCorporalMagra;
	}




	public void setGrasaCorporalMagra(float grasaCorporalMagra) {
		this.grasaCorporalMagra = grasaCorporalMagra;
	}




	public Date getFecha() {
		return fecha;
	}




	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}




	public Progreso() {
		// TODO Auto-generated constructor stub
	}

}
