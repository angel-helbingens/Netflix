package series;

import java.util.ArrayList;

public class Serie extends Object {
	
	private String titulo;
	private ArrayList<Temporada> temporadas;
	
	public Serie(String titulo, ArrayList<Temporada> temporadas) {
		this.titulo = titulo;
		this.temporadas = temporadas;
	}
	
	public Serie(String titulo) {
		this.titulo = titulo;
		this.temporadas = new ArrayList<Temporada>();
	}
	
	public Serie() {
		this.temporadas = new ArrayList<Temporada>();
	}
	
	public boolean addTemporada(Temporada temporada)  {
		temporadas.add(temporada);
		temporada.setSerie(this);
		return true;
	}
	

}
