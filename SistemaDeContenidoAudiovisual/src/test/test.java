package test;

import modulo.Audiovisual;
import modulo.Serie;
import modulo.Sistema;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sis = new Sistema();
//-----------------------------------------------------------
		System.out.println("1");
		try {
			sis.agregarAudiovisual("7389189", "TODOS TENEMOS UN MUERTO...", 2021, true, "COMEDIA DRAMATICA", 103);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
//-----------------------------------------------------------
		System.out.println("2");
		try {
			sis.agregarAudiovisual("1732485", "LOS SIMULADORES", 2003, false, "DRAMA SOCIAL", true);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

//-----------------------------------------------------------
		System.out.println("3");
		try {
			sis.agregarAudiovisual("3748916", "CORONADOS DE GLORIA", 2019, false, "DOCUMENTAL", true);
			Serie audio = (Serie) sis.traerAudiovisual("3748916");
			audio.agregarCapitulos("EL PRIMER TITULO", 2, 13);
			audio.agregarCapitulos("LA GENESIS DE LA GENERACION DORADA", 1, 14);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			sis.agregarAudiovisual("4689735", "LUNA DE AVELLANEDA", 2004, false, "COMEDIA DRAMATICA", 139);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			sis.agregarAudiovisual("7389182", "TODOS TENEMOS UN MUERTO...", 2021, true, "COMEDIA DRAMATICA", 103);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			sis.agregarAudiovisual("1732489", "LOS SIMULADORES", 2003, false, "DRAMA SOCIAL", true);
			 //sis.traerAudiovisual("1732489");
			
			sis.agregarCapitulos("CAPITULO 2", 2, 30,(Serie)sis.traerAudiovisual("1732489"));
			sis.agregarCapitulos("CAPITULO 1", 1, 40,(Serie)sis.traerAudiovisual("1732489"));

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

        //-----------------------------------------------------------
		System.out.println("4");
		System.out.println(sis.traerAudiovisual("4689735"));
		// -----------------------------------------------------------
		System.out.println("5");
		System.out.println("el calculo total es ----> " + sis.traerAudiovisual("4689735").calcularDuracion());

		// -----------------------------------------------------------
		System.out.println("6");
		System.out.println(sis.traerAudiovisual("3748916"));
		// -----------------------------------------------------------
		System.out.println("7");
		System.out.println("el calculo total es ----> " + sis.traerAudiovisual("3748916").calcularDuracion());

	}

}
