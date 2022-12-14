package ex01;

public class Tempo {

	private int hr;
	private int minuto;
	private int segundo;
	
	public Tempo() {
		
		hr = 0; minuto = 0; segundo = 0;
	}
	
	public Tempo(int h) {
		if((h>0)&&(h<=24)) {
			this.hr = h;
		
		}else hr = 0;
	}
	
	public Tempo(int h, int m) {
		if((h>0)&&(h<=24)) {
			this.hr = h;
		
		}else hr = 0;
		if((m > 0)&&(m<=59)) {
			this.minuto = m;
		}else minuto = 0;
	}
	public Tempo(int h, int m, int s) {
		if((h>0)&&(h<=24)) {
			this.hr = h;
		
		}else hr = 0;
		if((m > 0)&&(m<=59)) {
			this.minuto = m;
		}else minuto = 0;
		if ((s > 0)&&(s<=59)) {
			this.segundo = s;
		}else segundo = 0;
	}
	public String toString() {
        String auxiliar = "";
        if (hr < 9){
        	auxiliar += "0" + hr + ":";
        }else auxiliar += hr + ":";
        if(minuto < 9){
        	auxiliar += "0"+minuto+":";
        }else auxiliar += minuto+":";
        if(segundo < 9){
        	auxiliar += "0"+segundo;
        }else auxiliar += segundo;

        return auxiliar;
    }
	public boolean setHr(int hr) {
        if((hr>=0)&&(hr<=24)){
            this.hr = hr;
            return true;
        }else{
            this.hr = 0;
            return false;
        }
    }

    public boolean setMinuto(int min) {
        if((min>=0)&&(min<=59)){
            this.minuto = min;
            return true;
        }else{
            this.minuto = 0;
            return false;
        }
    }
    
	public boolean setSegundo(int seg) {
		if((seg>=0)&&(seg<=59)) {
			this.segundo = seg;
			return true;
			
		}else {
			this.segundo = 0;
			return false;
		}
	}
	public long tempoEmSegundos(){
        long segundos = segundo;
        long aux = hr * 60;
        aux = aux + minuto;
        segundos = segundos + (aux * 60);
        return segundos;
    }
    public long difTempo(Tempo tAux){
        long tauxT = tAux.tempoEmSegundos();
        long tPrin = tempoEmSegundos();
        long tAuxT = tauxT - tPrin;
        return  tAuxT;

    }
}
