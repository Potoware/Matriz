/*PARCIAL 2 PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO*/
package matriz;

public class Validar {
	// DEFINICION VARIABLES
	String informacion;
	int valorValidado;

	// FIN DEFINICION VARIABLES

	// VALIDAR DATOS
	public void validadorDatos(String valor) {
		try {
			if ((Integer.parseInt(valor) >= 0) || ((Integer.parseInt(valor) <= 0))) {
				valorValidado = Integer.parseInt(valor);
				informacion = "El valor " + valor + " se asigno correctamente";
			}
		} catch (Exception e) {
			informacion = "error";
		}

	}
	//FIN VALIDAR DATOS
	
	// VALIDAR TAMAÑO MATRIZ
	public void validadorTamano(String valor) {
		try {
			if (Integer.parseInt(valor) > 0) {
				valorValidado = Integer.parseInt(valor);
				informacion = "Valor aceptado correctamente";
			} else {
				informacion = "error";
			}

		} catch (Exception e) {
			informacion = "error";
		}
	}
	//FIN VALIDAR TAMAÑO MATRIZ
}
