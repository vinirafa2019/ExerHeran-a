package com.model;

public class Aviao extends Veiculo {
	
	public Aviao(String Tipo,String Uso,String Modelo, int Velocidade, int Passageiros, int Combustivel) {
		super(Modelo, Velocidade, Passageiros, Combustivel);
		this.Tipo= Tipo;
		this.Uso= Uso;
	}

	private String Tipo;
	private String Uso;	
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getUso() {
		return Uso;
	}
	public void setUso(String uso) {
		Uso = uso;
	}
}

