package objetos;

import java.io.Serializable;



public class CPregunta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Long Id;
	public String Titulo;
	public String contexto;
	public CCurso curso;
	public CTema tema;
	public CEtiqueta etiqueta;
	public CEstudiante estudiante;
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public CCurso getCurso() {
		return curso;
	}
	public void setCurso(CCurso curso) {
		this.curso = curso;
	}
	public CTema getTema() {
		return tema;
	}
	public void setTema(CTema tema) {
		this.tema = tema;
	}
	public CEtiqueta getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(CEtiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getContexto() {
		return contexto;
	}
	public void setContexto(String contexto) {
		this.contexto = contexto;
	}
	public CEstudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(CEstudiante estudiante) {
		this.estudiante = estudiante;
	}

	

	
}
