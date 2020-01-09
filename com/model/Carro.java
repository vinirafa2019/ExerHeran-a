package com.model;

public class Carro extends Veiculo {

	public Carro(String Marca, int Portas, String Ano,String Modelo, int Velocidade, int Passageiros, int Combustivel) {
		super(Modelo, Velocidade, Passageiros, Combustivel);
		this.Marca = Marca;
		this.Portas =Portas;
		this.Ano = Ano;
	}
	
	

	private String Marca;
	private int Portas;
	private String Ano;
	
	
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public int getPortas() {
		return Portas;
	}
	public void setPortas(int Portas) {
		this.Portas = Portas;
	}
	public String getAno() {
		return Ano;
	}
	public void setAno(String Ano) {
		Ano= Ano;
	}
	
}
