package modulo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List<Audiovisual> lstAudiovisual;

public Sistema() {
	super();
	this.lstAudiovisual = new ArrayList<Audiovisual>();
}


public boolean agregarAudiovisual(String codAudiovisual,String audiovisual,int anio,boolean estreno,String genero,int duracion) throws Exception {
	return lstAudiovisual.add(new Pelicula(codAudiovisual,audiovisual,anio,estreno,genero,duracion));
}

public boolean agregarAudiovisual(String codAudiovisual,String audiovisual,int anio,boolean estreno,String genero,boolean capitulosUnitarios) throws Exception {
	return lstAudiovisual.add(new Serie(codAudiovisual,audiovisual,anio,estreno,genero,capitulosUnitarios));
}


public Audiovisual traerAudiovisual(String codAudiovisual) {
	Audiovisual audio=null;
	int i=0;
	while(audio==null&&i<lstAudiovisual.size()) {
		if(lstAudiovisual.get(i).getCodAudiovisual().equals(codAudiovisual)) {
		    audio=lstAudiovisual.get(i);
		}
		i++;
	}
	return audio;
}










public List<Audiovisual> getLstAudiovisual() {
	return lstAudiovisual;
}

@Override
public String toString() {
	return "Sistema [lstAudiovisual=" + lstAudiovisual + "]";
}

}
