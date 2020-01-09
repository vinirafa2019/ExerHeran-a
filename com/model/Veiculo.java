package com.model;

public class Veiculo {
	
	private  String Modelo;
	private int Velocidade;
	private int Passageiros;
	private int Combustivel;
	
	
	public Veiculo(String Modelo,int Velocidade,int Passageiros,int Combustivel) {
		this.Modelo=Modelo;
		this.Velocidade=Velocidade;
		this.Passageiros=Passageiros;
		this.Combustivel=Combustivel;		
	}
	

	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	public int getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(int Velocidade) {
		this.Velocidade = Velocidade;
	}
	public int getPassageiros() {
		return Passageiros;
	}
	public void setPassageiros(int Passageiros) {
		this.Passageiros = Passageiros;
	}
	public int getCombustivel() {
		return Combustivel;
	}
	public void setCombustivel(int Combustivel) {
		this.Combustivel = Combustivel;
	}

	public void veiculo() {
		System.out.println("O modelo é: "+this.Modelo);
		System.out.println("A velocidade maxima é: "+this.Velocidade+"KM/H");
		System.out.println("Quantidade maxima de passageiros é: "+this.Passageiros);
		System.out.println("Qauntidade maxidadede combustivel é: "+this.Combustivel);
		
	}
	
}

