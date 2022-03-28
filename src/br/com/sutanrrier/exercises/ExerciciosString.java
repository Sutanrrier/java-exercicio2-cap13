package br.com.sutanrrier.exercises;

public class ExerciciosString {

	public void questao03() {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
	}
	
	public void questao05() {
		String frase = "Teste 2022";
		for(int i=0; i<frase.length(); i++) {
			System.out.print(frase.charAt(i));
		}
	}
	public void questao06() {
		String palavra1 = "Socorram-me, subi no ônibus em Marrocos";
		String palavra2 = "Anotaram a data da maratona";
		
		for(int i=palavra1.length()-1; i>=0; i--) {
			System.out.print(palavra1.charAt(i));
		}
		
		System.out.println("\n=========================================");
		
		for(int i=palavra2.length()-1; i>=0; i--) {
			System.out.print(palavra2.charAt(i));
		}
	}
	
	public void questaoDesafio() {
		String x = "762";
		int i = Integer.parseInt(x);
		System.out.println(i);
	}
}
