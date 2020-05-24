/*PARCIAL 2 PROGRAMACION LINEAL - ALEJANDRO POTOSI MORENO*/
package matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// DEFINICION CLASES Y VARIABLES GENERALES
		Scanner teclado = new Scanner(System.in);
		Validar validar = new Validar();
		int nFilas = 0;
		int nColumnas = 0;
		String tempDatos;
		String tempTamano;
		// FIN DEFINICION CLASES Y VARIABLES GENERALES

		// SOLICITAR,VALIDAR TAMAÑO DE MATRIZ
		System.out.println("Ingrese el tamaño deseado para la matriz\n");

		// SOLICITAR VALIDAR TAMAÑO DE FILAS
		do {
			System.out.print("Numero de Filas: ");
			tempTamano = teclado.next();
			validar.validadorTamano(tempTamano);

			if (validar.informacion == "error") {
				System.out.println(
						"Valor erroneo. Debe ingresar un valor entero mayor o igual a 1, intente nuevamente\n");
				teclado.hasNextLine();
			} else {
				nFilas = Integer.parseInt(tempTamano);
			}
		} while (validar.informacion == "error");
		// FIN SOLICITAR VALIDAR TAMAÑO DE FILAS

		// SOLICITAR VALIDAR TAMAÑO DE COLUMNAS
		do {
			System.out.print("Numero de Columnas: ");
			tempTamano = teclado.next();
			validar.validadorTamano(tempTamano);

			if (validar.informacion == "error") {
				System.out.println(
						"Valor erroneo. Debe ingresar un valor entero mayor o igual a 1, intente nuevamente\n");
				teclado.hasNextLine();
			} else {
				nColumnas = Integer.parseInt(tempTamano);
			}
		} while (validar.informacion == "error");
		// FIN SOLICITAR VALIDAR TAMAÑO DE FILAS

		// FIN SOLICITAR,VALIDAR TAMAÑO DE MATRIZ

		// INICIALIZAR MATRIZ
		int matriz[][] = new int[nFilas][nColumnas];

		// FIN INICIALIZAR MATRIZ

		// INSERTAR VALORES MATRIZ
		System.out.println("\nA continuacion ingrese los valores que desea asignar a la matriz");

		// RECORRIDO FILAS
		for (int ifil = 0; ifil < nFilas; ifil++) {

			// RECORRIDO COLUMNAS
			for (int jcol = 0; jcol < nColumnas; jcol++) {

				// SOLICITAR Y VERIFICAR VALORES
				System.out.println("_____________\nValor para Fila " + (ifil + 1) + " Columna " + (jcol + 1));
				tempDatos = teclado.next();
				validar.validadorDatos(tempDatos);

				if (validar.informacion == "error") {
					System.out
							.println("No se pudo cargar el valor, debido a que no es de tipo int. Intente nuevamente");
					jcol = jcol - 1;

				} else {
					matriz[ifil][jcol] = validar.valorValidado;
					System.out.println("Se asigno el valor indicado\n");

				}
				// FIN SOLICITAR Y VERIFICAR VALORES
			}
			// FIN RECORRIDO COLUMNAS

		}
		// FIN RECORRIDO FILAS
		// FIN INSERTAR VALORES MATRIZ

		// PINTAR MATRIZ
		System.out.println("La matriz definida es:\n");
		// RECORRIDO FILAS
		for (int ifil = 0; ifil < nFilas; ifil++) {
			System.out.print("|");
			// RECORRIDO COLUMNAS
			for (int jcol = 0; jcol < nColumnas; jcol++) {
				System.out.print(matriz[ifil][jcol]+"  ");
				if (jcol != nFilas - 1) {
					System.out.print("\t");
				}
			}
			// FIN RECORRIDO COLUMNAS
			System.out.println("|");
		}
		// FIN RECORRIDO FILAS

		// FIN PINTAR MATRIZ

	}
}
