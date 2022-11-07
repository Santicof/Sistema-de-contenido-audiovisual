package modulo;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Audiovisual {
private boolean capitulosUnitarios;
private List<Capitulo> lstCapitulos;
public Serie(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, boolean capitulosUnitarios) throws Exception {
	super(codAudiovisual, titulo, anio, estreno, genero);
	this.capitulosUnitarios = capitulosUnitarios;
	this.lstCapitulos = new ArrayList<Capitulo>();
}


public boolean agregarCapitulos(String capitulo, int nroCapitulo,int duracion,Serie serie) {
	return lstCapitulos.add(new Capitulo(capitulo, nroCapitulo, duracion));
}




public boolean isCapitulosUnitarios() {
	return capitulosUnitarios;
}
public void setCapitulosUnitarios(boolean capitulosUnitarios) {
	this.capitulosUnitarios = capitulosUnitarios;
}
public List<Capitulo> getLstCapitulos() {
	return lstCapitulos;
}
@Override
public String toString() {
	return "Serie [capitulosUnitarios=" + capitulosUnitarios + ", lstCapitulos=" + lstCapitulos + " "+super.toString();
}


@Override
public int calcularDuracion() {
	int suma=0;
	for(int i=0;i<this.getLstCapitulos().size();i++) {
	 suma=suma+this.getLstCapitulos().get(i).getDuracion();
	}
	return suma;
}



}
