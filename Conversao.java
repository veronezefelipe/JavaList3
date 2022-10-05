package ex03;

import java.text.DecimalFormat;

public class Conversao {
	
	private int quantidade = 0;
	
	static DecimalFormat formatador = new DecimalFormat("0.00");
	

	public static void Litro_para_centimetro_cubicos(int quantidade) {
		System.out.println("a sua conversão de litros para centímetros cúbicos é: "+formatador.format(quantidade * 1000)+"cm3");
	}
	public static void Metro_cubico_para_litros(int quantidade) {
		System.out.println("a sua conversão de metros cúbicos para litros é: "+formatador.format(quantidade * 1000)+" litros");
	}
	public static void  Metro_cubico_para_pes_cubicos(int quantidade) {
		System.out.println("a sua conversão de metros cúbicos para pés cúbicos é: "+ formatador.format(quantidade * 35.32)+" pés cúbicos");
	}
	public static void Galao_americano_para_polegadas_cubicas(int quantidade) {
		System.out.println("a sua conversão de galão americano para polegadas cúbicas é: "+ formatador.format(quantidade * 231)+" polegadas cúbicas");
	}
	public static void Galao_americano_para_litros(int quantidade) {
		System.out.println("a sua conversão de galão americano para litros é: "+ formatador.format(quantidade * 3785)+" litros");
	}
}
