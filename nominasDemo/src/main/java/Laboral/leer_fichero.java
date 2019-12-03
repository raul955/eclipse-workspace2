package Laboral;

import java.io.FileReader;
import java.io.IOException;

class Leer_Fichero {

	public void lee() {

		try {

			FileReader entrada = new FileReader("empleados.txt");

			int c = entrada.read();

			while (c != -1) {

				char letra = (char) c;

				System.out.print(letra);

				c = entrada.read();

			}

			entrada.close();
			
		} catch (IOException e) {

			System.out.println("Archivo no encontrado.");
		}

	}

}