package modulo;

public abstract class Audiovisual {
	protected String codAudiovisual;
	protected String titulo;
	protected int anio;
	protected boolean estreno;
	protected String genero;

	public Audiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero) throws Exception {
	
		this.setCodAudiovisual(codAudiovisual);
		this.titulo = titulo;
		this.anio = anio;
		this.estreno = estreno;
		this.genero = genero;
	}

	public abstract int calcularDuracion();
	
	public boolean verifico(String cod)  {
		boolean veri=true;
	int sumImpar=Character.getNumericValue(cod.charAt(0))+Character.getNumericValue(cod.charAt(2))+Character.getNumericValue(cod.charAt(4));
	sumImpar=sumImpar*3;
	int sumPar=Character.getNumericValue(cod.charAt(1))+Character.getNumericValue(cod.charAt(3))+Character.getNumericValue(cod.charAt(5));
	int total=sumPar+sumImpar;
	
	
	 int cont = 0;

     while(total%10 != 0) {
         total = total + 1;
         cont ++;
     }
	
	if(cont!=Character.getNumericValue(cod.charAt(6))) {
		veri=false;
	}
	return veri;
	}
	

	
	
	
	public String getCodAudiovisual() {
		return codAudiovisual;
	}

	public void setCodAudiovisual(String codAudiovisual) throws Exception {
		if(verifico(codAudiovisual)==false) {
			throw new Exception("el codigo es invalido");
		}
		this.codAudiovisual = codAudiovisual;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isEstreno() {
		return estreno;
	}

	public void setEstreno(boolean estreno) {
		this.estreno = estreno;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Audiovisual [codAudiovisual=" + codAudiovisual + ", titulo=" + titulo + ", anio=" + anio + ", estreno="
				+ estreno + ", genero=" + genero + "]";
	}

}