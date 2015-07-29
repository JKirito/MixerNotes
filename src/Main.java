import java.io.IOException;
import java.util.Date;


public class Main {
	public static final String prefijoLANACION = "LaNacion";
	public static final String prefijoPAGINA12 = "Pagina12";

	public static void main(String[] args) {

		System.out.println("empezó: "+ new Date());
		String pathNotas = "/home/pruebahadoop/Descargas/Página 12/Sociedad/Notas/Texto/";
		String pathGuardar = "/home/pruebahadoop/Descargas/Página 12/Sociedad/Notas/TextoPorAño/";

		Mixer m = new Mixer(prefijoPAGINA12, pathNotas, pathGuardar, true);
		try {
			m.mixer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK!!! :D");
		System.out.println("Terminó: "+ new Date());

	}

}
