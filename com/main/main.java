package com.main;

import com.model.Aviao;
import com.model.Carro;

public class main {

	public static void main(String[] args) {
		 Carro C = new Carro("Celta",4,"2012", "Chevrolet", 100, 5, 100);
		  
		 
		 System.out.println("A modelo �: " + C.getMarca());
	     System.out.println("O carro tem "+ C.getPortas()+ " portas" );
	     System.out.println("O ano do carro �: " + C.getAno() );
	     System.out.println("A marca �: "+ C.getModelo());
	     System.out.println("A velocidade maxima �: " + C.getVelocidade()+" KM/H");
	     System.out.println("Qauntidade maxima de "+ C.getPassageiros()+ " passageiros");
	     System.out.println("Quantidade Maxima de Combustivel " +C.getCombustivel()+" Litros"+"\n");
	
	     Aviao A = new Aviao("Boeng", "Passeio","AIRBUS A320",871,120,24000);
	     System.out.println("O tipo do aviao �: "+ A.getTipo());
	     System.out.println("O modo de Us �: " + A.getUso());
	     System.out.println("A marca �: "+ A.getModelo());
		 System.out.println("A velocidade maxima �: " + A.getVelocidade()+" KM/H");
		 System.out.println("Qauntidade maxima de "+ A.getPassageiros() + " passageiros" );
		 System.out.println("Quantidade Maxima de " +A.getCombustivel()+" Litros de combustivel");
	     
	      
	}

}
