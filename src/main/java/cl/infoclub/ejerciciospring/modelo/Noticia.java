package cl.infoclub.ejerciciospring.modelo;

public class Noticia {
	private String nombreNoticia;
	private String descripcion;
	private String urlImg;
	public Noticia(String nombreNoticia, String descripcion, String urlImg) {
		super();
		this.nombreNoticia = nombreNoticia;
		this.descripcion = descripcion;
		this.urlImg = urlImg;
	}
	public String getNombreNoticia() {
		return nombreNoticia;
	}
	public void setNombreNoticia(String nombreNoticia) {
		this.nombreNoticia = nombreNoticia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	
	
	
}
