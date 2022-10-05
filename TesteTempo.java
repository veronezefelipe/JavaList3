package ex01;

public class TesteTempo {

    public static void main(String[] args) {
        Tempo temp1 = new Tempo(2, 54, 6);

        System.out.println("Tempo 1 :" +temp1.toString());
        System.out.println("Tempo 1 em segundos: "+temp1.tempoEmSegundos());

        Tempo temp2 = new Tempo(5, 40, 47);
        System.out.println("Tempo 2: "+ temp2.toString());
        System.out.println("Tempo 2 em segundos: "+ temp2.tempoEmSegundos());
        System.out.println("Diferença de tempos em segundos: " + temp1.difTempo(temp2));

        if(temp2.setHora(7)){
            System.out.println("Nova hora = 7");
        }else System.out.println("ERRO, hora inválida");

        if(temp2.setMinuto(74)){
            System.out.println("Novo minuto = 74");
        }else System.out.println("ERRO, minuto inválido");

        if (temp2.setSegundo(60)){
            System.out.println("Novo segundo = 60");
        }else System.out.println("ERRO, segundo inválido");

        System.out.println("Novo tempo 2: " + temp2.toString());
    }
}
