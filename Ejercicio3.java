package fp.daw.exprog20210902;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio3 {
	private File ruta;
	private static int datosTotales;
	static Map<String, Map<String, Integer>> mapa = new TreeMap<>();

	public static void main(String[] args) throws IOException {

		File ruta = new File("C:\\Users\\alumno.INFORMATICA\\git\\exprog20210902\\pm2019.csv");
		almacenarVehiculos(ruta);
		File rutaBinaria = new File("C:\\Users\\alumno.INFORMATICA\\git\\exprog20210902\\pm.2019.dat");
		copiarABinario(rutaBinaria, mapa);
		leerBinario(rutaBinaria);

	}

	public static Map<String, Map<String, Integer>> almacenarVehiculos(File ruta) throws IOException {
		
		try {
			FileReader rutaArchivo = new FileReader(ruta);
			BufferedReader in = new BufferedReader(rutaArchivo);
			String linea = in.readLine();
			String[] tipoVehiculo = linea.split(";");
			while ((linea = in.readLine()) != null) {
				String[] dat = linea.split(";");
				Map<String, Integer> m = new HashMap<>();
				for (int i = 1; i < dat.length; i++) {
					int n = Integer.valueOf(dat[i]);
					m.put(tipoVehiculo[i], n);
					datosTotales += n;
				}
				mapa.put(dat[0], m);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return mapa;

	}

	public static void copiarABinario(File rutaBinaria, Map<String, Map<String, Integer>> mapa) {
		try {
			FileOutputStream fos = new FileOutputStream(rutaBinaria);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//Itero sobre el mapa

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static void leerBinario(File rutaBinaria) throws IOException {
		try {
			FileInputStream fis = new FileInputStream(rutaBinaria);
			BufferedInputStream bis = new BufferedInputStream(fis);
			char c = 0;
			while (c != -1) {
				c = (char) bis.read();
				System.out.println(c);
			}
			bis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
