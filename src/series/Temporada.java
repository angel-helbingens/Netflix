package series;

import java.util.ArrayList;

public class Temporada {
	
	private int numero;
	private ArrayList<Capitulo> capitulos;
	private Serie serie;
	
	public boolean addCapitulo(Capitulo capitulo) {
		capitulos.add(capitulo);
		capitulo.setTemporada(this);
		return false;
	}
	public String ListaCapitulos() {
		String res = "";
		for (Capitulo capitulo:capitulos) {
			res = res + capitulo;
		}
		return res;
	}
	public Temporada (){
		this.capitulos = new ArrayList<Capitulo>();
	}
	
	public Serie getSerie() {
		return serie;
	}
	
	public void setSerie(Serie serie) {
		this.serie = serie;
	}

}
