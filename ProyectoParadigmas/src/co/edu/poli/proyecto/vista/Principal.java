package co.edu.poli.proyecto.vista;

import java.util.Scanner;

import co.edu.poli.proyecto.model.Catalogo;
import co.edu.poli.proyecto.model.Pelicula;


public class Principal {
      
	public static void main(String[] args) {
		Catalogo indice=new Catalogo();
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println(Menu());
		System.out.println("Opcion: ");
		int x = sc.nextInt();
		
		//Creamos instancias de Pelicula para mostrar en el Catalogo
		Pelicula p1=new Pelicula("Titanic", "James Cameron", "Drama", "1997", false);
		indice.agregarPeli(p1);
		Pelicula p2=new Pelicula("El Padrino", "Francis Ford Coppola", "Crimen", "1972", false);
		indice.agregarPeli(p2);
		Pelicula p3=new Pelicula("Interestelar", "Christopher Nolan", "Ciencia ficción", "2014", true);
		indice.agregarPeli(p3);
		
		Pelicula p4=new Pelicula("La La Land", "Damien Chazelle", "Musical", "2016", true);
		indice.agregarPeli(p4);
		Pelicula p5=new Pelicula("Pulp Fiction", "Quentin Tarantino", "Crimen", "1994", true);
		indice.agregarPeli(p5);
		Pelicula p6=new Pelicula("El Rey León", "Roger Allers, Rob Minkoff", "Animación", "1994", false);
		indice.agregarPeli(p6);
		
		Pelicula p7=new Pelicula("Forrest Gump", "Robert Zemeckis", "Drama", "1994", true);
		indice.agregarPeli(p7);
		Pelicula p8=new Pelicula("El Señor de los Anillos: El retorno del Rey", "Peter Jackson", "Fantasía", "2003", false);
		indice.agregarPeli(p8);
		Pelicula p9=new Pelicula("Volver al Futuro", "Robert Zemeckis", "Ciencia ficción", "1985", true);
		indice.agregarPeli(p9);
         ///////////////////7

		
		do{
		    switch (x) {
		       case 1:{
		    	   Pelicula p=new Pelicula(null, null, null, null, false);
		    	   System.out.print("Ingrese el Nombre de la Pelicula: ");
					String a = sc.next();
					p.setNombre(a);
		    	   indice.agregarPeli(p);
		    	   System.out.print("Ingrese el Director de la Pelicula: ");
					String b = sc.next();
					p.setDirector(b);
					System.out.print("Ingrese el Genero de la Pelicula: ");
					String c = sc.next();
					p.setGenero(c);
					System.out.print("Ingrese el año de estreno de la Pelicula: ");
					String d = sc.next();
					p.setAnio(d);
		    	   indice.agregarPeli(p);
		    	   
		    	   break;
		       }
		       case 2:{
		    	   System.out.println("¿Que Pelicula buscas?: ");
		    	   String y=sc.next();
		    	   indice.buscarPeli(y);
		    	   break;  	   
		       }
		       case 3:{
		    	   indice.mostrarCatalogo();
		    	   break;
		       }
		       case 4:{
		    	   System.out.println("¿Qué Película desea Reservar?: ");
		    	    String y = sc.nextLine(); 
		    	    Pelicula reserva = indice.buscarPeli(y); 
		    	    if (reserva != null) {
		    	        reserva.reservar(); 
		    	    } else {
		    	        System.out.println("La película no se encuentra en el catálogo.");
		    	    }
		    	    
		    	    break;
		    	   	
		       }
		     }
		    System.out.println("******************");

			System.out.println(Menu());
			System.out.print("Opcion: ");
			x = sc.nextInt();
			sc.nextLine();
		} while(x!=5);
	}
	public static String Menu() {
		return "| MENU |\n" + "1. Agregar Pelicula al Catalogo.\n" + "2. Buscar Pelicula.\n" + "3. Catalogo.\n" +  "4. Reservar.\n"+  "5. Salir.\n";

	}
	}

