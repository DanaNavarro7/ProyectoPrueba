package Main;

import java.util.Scanner;

import Implementacion.ImplementacionIngCivil;
import Model.IngCivil;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = null;

		long cedula;
		String carrera;
		String grado;
		float salario;

		IngCivil civil = null;

		int menuPrinc, menuPrincIngCivil;
		
		
		ImplementacionIngCivil impCivil = new ImplementacionIngCivil();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---CRUD DE ING. CIVIL");
			System.out.println("2---CRUD DE ING. INFORMATICA");
			System.out.println("3---SALIR");

			teclado = new Scanner(System.in);
			menuPrinc = teclado.nextInt();

			switch (menuPrinc) {
			case 1:// ----CRUD ING CIVIL
				do {
					System.out.println("CRUD ING. CIVIL");
					System.out.println("1---ALTA");
					System.out.println("2---MOSTRAR");
					System.out.println("3---BUSCAR");
					System.out.println("4---EDITAR");
					System.out.println("5---ELIMINAR");
					System.out.println("6---REGRESAR AL MENU PRINCIPAL");

					teclado = new Scanner(System.in);
					menuPrincIngCivil = teclado.nextInt();

					switch (menuPrincIngCivil) {
					case 1:
						try {
							System.out.println("Ingresa numero de cedula");
							teclado = new Scanner(System.in);
							cedula = teclado.nextLong();

							System.out.println("Ingresa la carrera");
							teclado = new Scanner(System.in);
							carrera = teclado.nextLine();

							System.out.println("Ingresa el grado");
							teclado = new Scanner(System.in);
							grado = teclado.nextLine();

							System.out.println("Ingresa el salario");
							teclado = new Scanner(System.in);
							salario = teclado.nextFloat();

							// CREAR EL OBJETO
							civil = new IngCivil(cedula, carrera, grado, salario);

							// AGREGAR AL HASHMAP
							impCivil.guardar(civil);
							System.out.println("Se guardó");
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Error al guardar " + e.getMessage());
						}
						break;

					case 2:
						impCivil.mostrar();
						break;

					case 3:
						try {

							System.out.println("Ingrese el número de cedula");
							teclado = new Scanner(System.in);
							cedula = teclado.nextLong();

							// BUSCAR
							civil = impCivil.buscar(cedula);
							System.out.println("Se encontró " + cedula);

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("No se encontró ese registro");
						}
						break;
					case 4:

						try {

							System.out.println("Ingrese el número de cedula");
							teclado = new Scanner(System.in);
							cedula = teclado.nextLong();

							// BUSCAR
							civil = impCivil.buscar(cedula);
							System.out.println("Se encontró " + cedula);

							// ACTUALIZAR
							System.out.println("Ingrese el nuevo grado");
							teclado = new Scanner(System.in);
							grado = teclado.nextLine();

							// ACTUALIZAR EL OBJETO
							civil.setGrado(grado);

							// ACTUALIZAR EL HASHMAP
							impCivil.editar(civil);
							System.out.println("Se editó");

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("No se encontró ese registro");
						}
						break;
					case 5:
						try {
							System.out.println("Ingrese el numero de cedula a eliminar");
							teclado = new Scanner(System.in);
							cedula = teclado.nextLong();

							// ELIMINAR
							impCivil.eliminar(cedula);
							System.out.println("Se ha eliminado correctamente");

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("No se ha podido eliminar. Intente de nuevo");
						}
						break;
					case 6:
						break;
					}

				} while (menuPrincIngCivil < 6);

				break;

			case 2:// -----CRUD ING INFORMATICA

				break;

			case 3:
				break;
			}

		} while (menuPrinc < 4);

	}

}
