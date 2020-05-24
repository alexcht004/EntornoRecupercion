package probar;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class eje5Test {
	
	static eje0 x=null;
	
	static int operacionesRealizadas = 0;


	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		x = new eje0();
	}
	
	@BeforeEach
	private void preparaPruebaEjecutar(){
		operacionesRealizadas++;
		System.out.println("Ejecutando test "+ operacionesRealizadas);
	}
	
	@AfterEach
	private void terminadaPrueba(){
		System.out.println("Se ha ejecutado el test: "+operacionesRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		x = new eje0();
	}
	
	@DisplayName("Test de Caja Negra  test  positivo")
	@Test
	void testfuncion1() {
		char alexx='+';
		int numero1 =2;
		int numero2 = 3;
		
		assertEquals(5, x.funcion5(numero1, numero2, alexx)); 
	}
	
	
	@DisplayName("Test de Caja Negra  test negativo")
	@Test
	void testfuncion2() {
		char alexx='+';
		int numero1 =2;
		int numero2 = 3;
		
		
		assertEquals(4, x.funcion5(numero1, numero2, alexx)); 
	}
	@DisplayName("Test de Caja Negra  test vacio")
	@Test
	void testfuncion3() {
		char alexx=' ';
		int numero1 = 2;
		int numero2 = 3;
				
		assertEquals(0, x.funcion5(numero1, numero2, alexx));
		
	}
	////
	
	
	@DisplayName("Test de Caja Negra  test ")
	@Test
	void testfuncion4() {
		char alexx=' ';
		int numero1 =2;
		int numero2 = 3;
		
		assertEquals(0, x.funcion5(numero1, numero2, alexx)); 
	}
	
	
	@DisplayName("Test de Caja blanca primera condicion ")
	@Test
	void testfuncion5() {
		char alexx='+';
		int numero1 =2;
		int numero2 = 3;
		
		
		assertEquals(5, x.funcion5(numero1, numero2, alexx)); 
	}
	@DisplayName("Test de Caja blanca segunda condicion ")
	@Test
	void testfuncion6() {
		char alexx='-';
		int numero1 =6;
		int numero2 = 3;
		
		
		assertEquals(3, x.funcion5(numero1, numero2, alexx)); 
	}
	@DisplayName("Test de Caja blanca tercera condicion ")
	@Test
	void testfuncion7() {
		char alexx='/';
		int numero1 =3;
		int numero2 = 3;
		
		
		assertEquals(1, x.funcion5(numero1, numero2, alexx)); 
	}
	@DisplayName("Test de Caja blanca cuarta condicion ")
	@Test
	void testfuncion8() {
		char alexx='*';
		int numero1 = 2;
		int numero2 = 2;
		
		
		assertEquals(4, x.funcion5(numero1, numero2, alexx)); 
	}


}
